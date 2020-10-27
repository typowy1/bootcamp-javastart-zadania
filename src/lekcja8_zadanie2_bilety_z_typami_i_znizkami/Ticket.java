package lekcja8_zadanie2_bilety_z_typami_i_znizkami;

public class Ticket {
    private String eventName;
    private String placeOfEvent;
    private double basicPrice;
    private double discount;
    private String type;
    private int ticketId;


    public Ticket(String eventName, String placeOfEvent, double basicPrice, double discount, String type, int ticketId) {
        this.eventName = eventName;
        this.placeOfEvent = placeOfEvent;
        this.basicPrice = basicPrice;
        this.discount = discount;
        this.type = type;
        this.ticketId = ticketId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getPlaceOfEvent() {
        return placeOfEvent;
    }

    public void setPlaceOfEvent(String placeOfEvent) {
        this.placeOfEvent = placeOfEvent;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(double basicPrice) {
        this.basicPrice = basicPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfo() {
        return "Ewent: " + eventName + ", miejsce: " + placeOfEvent + ", cena podstawowa: " + basicPrice + ", zniżka: " +
                discount + ", id biletu: " + ticketId + ", rodzaj biletu" + type;
    }

    public double getDiscountPrice() {
        double result = basicPrice * discount;
        return basicPrice - result;
    }

    public double getOnlinePrice() {
        return basicPrice;
    }

    public double getStandardPrice() {
        basicPrice += 5;
        return basicPrice;
    }

    public double getGiftPrice() {
        double result = basicPrice * 0.05;
        return getStandardPrice() + result;
    }

}
