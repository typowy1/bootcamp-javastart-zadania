package lekcja17_zadanie1_obsługa_płatności_przez_strumienie;

import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PaymentService {

    private PaymentRepository paymentRepository;
    private DateTimeProvider dateTimeProvider;

    PaymentService(PaymentRepository paymentRepository, DateTimeProvider dateTimeProvider) {
        this.paymentRepository = paymentRepository;
        this.dateTimeProvider = dateTimeProvider;
    }

    /*
    Znajdź i zwróć płatności posortowane po dacie malejąco
     */
    List<Payment> findPaymentsSortedByDateDesc() {
        return paymentRepository
                .findAll()
                .stream()// pobieramy wszystko
                .sorted(Comparator.comparing(Payment::getPaymentDate).reversed())//sortujemy mlejąco
                .collect(Collectors.toList());
    }

    /*
    Znajdź i zwróć płatności dla aktualnego miesiąca
     */
    List<Payment> findPaymentsForCurrentMonth() {
        return paymentRepository.findAll()
                .stream()
                .filter(payment -> YearMonth.from(payment.getPaymentDate()).equals(dateTimeProvider.yearMonthNow()))
                .collect(Collectors.toList());
    }

    /*
    Znajdź i zwróć płatności dla wskazanego miesiąca
     */
    List<Payment> findPaymentsForGivenMonth(YearMonth yearMonth) {
        return paymentRepository.findAll().stream()
                .filter(payment -> YearMonth.from(payment.getPaymentDate()).equals(yearMonth))
                .collect(Collectors.toList());
    }

    /*
    Znajdź i zwróć płatności dla ostatnich X dzni
     */
    List<Payment> findPaymentsForGivenLastDays(int days) {
        List<Payment> collect = paymentRepository.findAll().stream()
                .filter(payment -> payment.getPaymentDate().isBefore(dateTimeProvider.zonedDateTimeNow()))
                .filter(payment -> payment.getPaymentDate().isAfter(dateTimeProvider.zonedDateTimeNow().minusDays(days)))
                .collect(Collectors.toList());
        return collect;
        //płatności < dzisiaj && płatności > dzis - days
        //Tu chodzi o to, żeby pobrać płatności dla x ostatnich dni
        //To wyżej to pobranie N najnowszych płatności
        //Trzeba po prostu sprawdzić czy data płatności jest wczesniejsza niz dzisiejsza data
        //No i czy data platnosci jest pozniej niz x dni temu
//        teraz - np 3dni < data zakupu < teraz
    }

    /*
    Znajdź i zwróć płatności z jednym elementem
     */
    Set<Payment> findPaymentsWithOnePaymentItem() {
        return paymentRepository.findAll().stream()
                .filter(payment -> payment.getPaymentItems().size() == 1) // lub == 1 tylko z 1 czyli nie moze byc innego
                .collect(Collectors.toSet());
    }

    /*
    Znajdź i zwróć nazwy produktów sprzedanych w aktualnym miesiącu
     */
    Set<String> findProductsSoldInCurrentMonth() {
        return findPaymentsForCurrentMonth().stream()
                .flatMap(payment -> payment.getPaymentItems().stream())
                .map(PaymentItem::getName)
                .collect(Collectors.toSet());
    }

    /*
    Policz i zwróć sumę sprzedaży dla wskazanego miesiąca
     */
    BigDecimal sumTotalForGivenMonth(YearMonth yearMonth) {
        return findPaymentsForGivenMonth(yearMonth).stream()
                .flatMap(payment -> payment.getPaymentItems().stream())// daje nam liste splaszczona
                .map(PaymentItem::getFinalPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    /*
    Policz i zwróć sumę przeyznanaych rabatów dla wskazanego miesiąca
     */
    BigDecimal sumDiscountForGivenMonth(YearMonth yearMonth) {
        return findPaymentsForGivenMonth(yearMonth)
                .stream()
                .flatMap(payment -> payment.getPaymentItems()
                        .stream()
                        .map(paymentItem -> paymentItem.getRegularPrice().subtract(paymentItem.getFinalPrice())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);// metoda redukuje
    }

    /*
    Znajdź i zwróć płatności dla użytkownika z podanym mailem
     */
    List<PaymentItem> getPaymentsForUserWithEmail(String userEmail) {
        return paymentRepository.findAll().stream()
                .filter(payment -> payment.getUser().getEmail().equals(userEmail))
                .flatMap(payment -> payment.getPaymentItems().stream())// do dlatego ze mam zwrócić PaymentItem
                .collect(Collectors.toList());
    }

    /*
    Znajdź i zwróć płatności, których wartość przekracza wskazaną granicę
     */
    Set<Payment> findPaymentsWithValueOver(int value) {
        return paymentRepository.findAll().stream()
                .filter(payment -> sumPaymentPriceItems(payment) > value)
                .collect(Collectors.toSet());

//        tutaj nie uzywaj flatmapy zamiast tego w filtrze zsusmuj wszystkie ceny itemow w danym paymencie.
//Najlepiej zaczac od zrobienia osobnej metody ktora przyjmije Payment jako argument i zwroci sume cen wszystkich itemow
    }

    private Integer sumPaymentPriceItems(Payment payment) {
        return payment.getPaymentItems()
                .stream()
                .map(paymentItem -> paymentItem.getFinalPrice().intValue())
                .reduce(0, Integer::sum);
        //      .reduce(0, (sum, finalPrice) -> sum + finalPrice);
    }
// stara wersja
//    int sumPaymentPriceItems(Payment payment) {
//        List<PaymentItem> items = payment.getPaymentItems();
//        int sum = 0;
//        for (PaymentItem item : items) {
//            sum += item.getFinalPrice().intValue();
//        }
//        return sum;
//    }

//    lub tak

    Set<Payment> findPaymentsWithValueOver2(int value) {
        return paymentRepository.findAll()
                .stream()
                .filter(payment -> calculateValue(payment).compareTo(BigDecimal.valueOf(value)) > 0)
                .collect(Collectors.toSet());
    }

private BigDecimal calculateValue(Payment payment) {
    return payment.getPaymentItems()
            .stream()
            .map(PaymentItem::getFinalPrice)
            .reduce(BigDecimal.ZERO, BigDecimal::add); // BigDecimal.ZERO pierwszy element, BigDecimal::add dodawany element
            //reduce(0, (init, next) -> init + next);
    //czyli reduce sumuje elementy a zero to element początkowy jest to zastepstwo sumowania elementow za pomoca pętli sero to zmienna początkowa z wartoscią 0
    //reduce(0, (init, next) -> init + next);
    //czyli odpowiednik tego
//    int sumPaymentPriceItems1(Payment payment) {
//        List<PaymentItem> items = payment.getPaymentItems();
//        int sum = 0;
//        for (PaymentItem item : items) {
//            sum += item.getFinalPrice().intValue();
//        }
//        return sum;
//    }

    //// sum using a for loop
    //        BigDecimal sum = BigDecimal.ZERO;
    //        for (BigDecimal amt : invoices) {
    //            sum = sum.add(amt);
    //        }
    //        System.out.println("Sum = " + sum);
    //
    //        // sum using stream
    //        BigDecimal sum2 = invoices.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
    //        System.out.println("Sum (Stream) = " + sum2);
}

}
