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
                .stream()
                .sorted(Comparator.comparing(Payment::getPaymentDate).reversed())
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
        //Tu chodzi o to, żeby pobrać płatności dla x ostatnich dni
        //To wyżej to pobranie N najnowszych płatności
        //Trzeba po prostu sprawdzić czy data płatności jest wczesniejsza niz dzisiejsza data
        //No i czy data platnosci jest pozniej niz x dni temu
    }

    /*
    Znajdź i zwróć płatności z jednym elementem
     */
    Set<Payment> findPaymentsWithOnePaymentItem() {
        return paymentRepository.findAll().stream()
                .filter(payment -> payment.getPaymentItems().size() < 2)
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
                .flatMap(payment -> payment.getPaymentItems().stream())
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
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    /*
    Znajdź i zwróć płatności dla użytkownika z podanym mailem
     */
    List<PaymentItem> getPaymentsForUserWithEmail(String userEmail) {
        return paymentRepository.findAll().stream()
                .filter(payment -> payment.getUser().getEmail().equals(userEmail))
                .flatMap(payment -> payment.getPaymentItems().stream())
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

    int sumPaymentPriceItems(Payment payment) {
        List<PaymentItem> items = payment.getPaymentItems();
        int sum = 0;
        for (PaymentItem item : items) {
            sum += item.getFinalPrice().intValue();
        }
        return sum;
    }
}
