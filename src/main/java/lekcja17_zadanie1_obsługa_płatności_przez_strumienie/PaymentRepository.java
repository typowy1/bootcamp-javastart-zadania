package lekcja17_zadanie1_obsługa_płatności_przez_strumienie;

import java.util.List;

public interface PaymentRepository {
    List<Payment> findAll();
}
