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

    private static Double getFinalPrice(Ticket ticket) {

        if (ticket.getType().equals("bilet internetowy") && ticket.getDiscount() != 0) {
            return ticket.getDiscountPriceFromOnlinePrice();

        } else if (ticket.getType().equals("bilet internetowy") && ticket.getDiscount() == 0) {
            return ticket.getOnlinePrice();

        } else if (ticket.getType().equals("bilet standardowy") && ticket.getDiscount() != 0) {
            return ticket.getDiscountPriceFromStandardPrice();

        } else if (ticket.getType().equals("bilet standardowy") && ticket.getDiscount() == 0) {
            return ticket.getStandardPrice();

        } else if (ticket.getType().equals("bilet prezentowy") && ticket.getDiscount() != 0) {
            return ticket.getDiscountPriceFromGiftPrice();

        } else if (ticket.getType().equals("bilet prezentowy") && ticket.getDiscount() == 0) {
            return ticket.getGiftPrice();
        }
        return null;
    }

    public static void showInfo(Ticket[] tickets) {
        for (int i = 0; i < tickets.length; i++) {
            System.out.println("Informacje o bilecie");
            System.out.println(tickets[i].getInfo());
            System.out.println("Cena przy zakupie jako: " + tickets[i].getType()
                    + ", cena: " + getFinalPrice(tickets[i]));
        }
    }
}

