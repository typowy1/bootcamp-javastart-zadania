package lekcja18_zadanie2_kupony;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    public double calculatePrice(List<Product> products, List<Coupon> coupons) {
        if (products == null || products.isEmpty()) {
            return 0;
        }
        if (coupons == null || coupons.isEmpty()) {
            coupons = new ArrayList<>();
            coupons.add(new Coupon(null, 0));
        }

        double currentBest = Double.MAX_VALUE;
        for (Coupon coupon : coupons) {
            double price = calculatePriceForCoupon(products, coupon);
            currentBest = Math.min(currentBest, price);
        }

        return currentBest;
    }

    public double calculatePriceForCoupon(List<Product> products, Coupon coupon) {
        return products
                .stream()
                .mapToDouble(product -> calculatePriceForProductWithCoupon(product, coupon))
                .sum();
    }

    private double calculatePriceForProductWithCoupon(Product product, Coupon coupon) {
        if (coupon.getCategory() == null || coupon.getCategory() == product.getCategory()) {
            double beforeRounding = product.getPrice() * (1. - coupon.getDiscountValueInPercents() / 100.);
            return round(beforeRounding);
        }
        return product.getPrice();
    }

    private double round(double input) {
        return Math.round(input * 100) / 100.;
    }
}
