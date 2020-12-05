package lekcja17_zadanie1_obsługa_płatności_przez_strumienie;

import java.time.ZonedDateTime;
import java.util.List;

public class Payment {

    private User user;
    private ZonedDateTime paymentDate;
    private List<PaymentItem> paymentItems;

    public Payment(User user, ZonedDateTime paymentDate, List<PaymentItem> paymentItems) {
        this.user = user;
        this.paymentDate = paymentDate;
        this.paymentItems = paymentItems;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ZonedDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(ZonedDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public List<PaymentItem> getPaymentItems() {
        return paymentItems;
    }

    public void setPaymentItems(List<PaymentItem> paymentItems) {
        this.paymentItems = paymentItems;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "user=" + user +
                ", paymentDate=" + paymentDate +
                ", paymentItems=" + paymentItems +
                '}';
    }
}
