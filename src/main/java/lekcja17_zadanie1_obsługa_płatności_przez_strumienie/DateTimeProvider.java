package lekcja17_zadanie1_obsługa_płatności_przez_strumienie;

import java.time.YearMonth;
import java.time.ZonedDateTime;

public class DateTimeProvider {

    ZonedDateTime zonedDateTimeNow() {
        return ZonedDateTime.now();
    }

    YearMonth yearMonthNow() {
        return YearMonth.now();
    }
}
