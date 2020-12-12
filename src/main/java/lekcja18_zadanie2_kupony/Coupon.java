package lekcja18_zadanie2_kupony;

public class Coupon {

    private final Category category;
    private final int discountValueInPercents;

    public Coupon(Category category, int discountValueInPercents) {
        this.category = category;
        this.discountValueInPercents = discountValueInPercents;
    }

    public Category getCategory() {
        return category;
    }

    public int getDiscountValueInPercents() {
        return discountValueInPercents;
    }
}
