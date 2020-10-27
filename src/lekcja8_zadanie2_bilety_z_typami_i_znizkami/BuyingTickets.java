package lekcja8_zadanie2_bilety_z_typami_i_znizkami;

public class BuyingTickets {
    public static void main(String[] args) {


        Ticket[] tickets = TicketUtils.enterTickets();
        TicketUtils.getFinalPrice(tickets);
        TicketUtils.showInfo(tickets);
    }
}
