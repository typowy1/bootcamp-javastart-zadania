package lekcja8_zadanie2_bilety_z_typami_i_znizkami;

import java.util.Scanner;

public class TicketUtils {

    static Scanner scanner = new Scanner(System.in);

    public static Ticket[] enterTickets() {

        int quantity = enterTicketsQuantity();
        Ticket[] tickets = new Ticket[quantity];

        for (int i = 0; i < tickets.length; i++) {
            System.out.println("Podaj nazwę eventu:");
            String eventName = scanner.nextLine();

            System.out.println("Podaj miejsce eventu:");
            String placeOfEvent = scanner.nextLine();

            System.out.println("Podaj cenę biletu:");
            double basicPrice = scanner.nextDouble();

            System.out.println("Podaj wartość zniżki biletu, od 0 do 1");
            double discount = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Podaj rodzaj biletu: bilet internetowy, bilet standardowy, bilet prezentowy");
            String type = scanner.nextLine();

            int ticketId = i + 1;

            tickets[i] = new Ticket(eventName, placeOfEvent, basicPrice, discount, type, ticketId);
        }
        return tickets;
    }

    private static int enterTicketsQuantity() {

        System.out.println("Podaj ilość biletów do wprowadzenia:");
        int productsQuantity = scanner.nextInt();
        scanner.nextLine();
        return productsQuantity;
    }

    public static Double getFinalPrice(Ticket[] tickets) {

        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i].getType().equals("bilet internetowy")) {
                if (tickets[i].getDiscount() != 0) {
                    return tickets[i].getDiscountPrice();
                } else {
                    return tickets[i].getOnlinePrice();
                }
            } else if (tickets[i].getType().equals("bilet standardowy")) {
                if (tickets[i].getDiscount() != 0) {
                    return tickets[i].getDiscountPrice();
                } else {
                    return tickets[i].getStandardPrice();
                }
            } else {
                if (tickets[i].getDiscount() != 0) {
                    return tickets[i].getDiscountPrice();
                } else {
                    return tickets[i].getGiftPrice();
                }
            }
        }
        return null;
    }

    public static void showInfo(Ticket[] tickets) {
        for (int i = 0; i < tickets.length; i++) {
            System.out.println("Informacje o bilecie");
            System.out.println(tickets[i].getInfo());
            if (tickets[i].getType().equals("bilet internetowy")) {
                System.out.println("Cena przy zakupie jako " + tickets[i].getType()
                        + ", cena: " + tickets[i].getOnlinePrice());
            } else if (tickets[i].getType().equals("bilet standardowy")) {
                System.out.println("Cena przy zakupie jako " + tickets[i].getType()
                        + ", cena: " + tickets[i].getStandardPrice());
            } else {
                System.out.println("Cena przy zakupie jako " + tickets[i].getType()
                        + ", cena: " + tickets[i].getGiftPrice());
            }
        }
    }
}
