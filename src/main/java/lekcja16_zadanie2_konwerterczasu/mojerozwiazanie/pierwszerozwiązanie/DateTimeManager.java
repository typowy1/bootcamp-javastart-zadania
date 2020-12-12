package lekcja16_zadanie2_konwerterczasu.mojerozwiazanie.pierwszerozwiązanie;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateTimeManager {

    private final DateTimeFormatter format = DateTimeFormatter.ofPattern(YEAR_MONTHS_DAYS_TIME);
    private static final String DAYS_MONTHS_YEAR_TIME = "dd.MM.yyyy HH:mm:ss";
    private static final String YEAR_MONTHS_DAYS_TIME = "yyyy-MM-dd HH:mm:ss";
    private static final String DAYS_MONTHS_YEAR_TIME_NO_SECONDS = "dd.MM.yyyy HH:mm";
    private static final String YEAR_MONTHS_DAYS = "yyyy-MM-dd";


    public void run() {
        String input = getDateFromUser();

        LocalDateTime timeFromUser = getLocalDateTime(input);

        ZonedDateTime localTimeZone = getLocalZoneDateTime(timeFromUser);

        ZonedDateTime utcZone = getUtcDateTime(localTimeZone);

        ZonedDateTime londonTime = getCityDateTime(localTimeZone, ZonesId.LONDON.getZoneId());

        ZonedDateTime losAngelesTime = getCityDateTime(localTimeZone, ZonesId.LOS_ANGELES.getZoneId());

        ZonedDateTime sydneyTime = getCityDateTime(localTimeZone, ZonesId.SYDNEY.getZoneId());

        printZoneDateTime(localTimeZone, utcZone);

        printCitiesZoneDateTime(londonTime, losAngelesTime, sydneyTime);

    }

    private void printZoneDateTime(ZonedDateTime localTimeZone, ZonedDateTime utcZone) {

        System.out.println("Czas lokalny: " + localTimeZone.format(format));
        System.out.println("UTC: " + utcZone.format(format));

    }

    private void printCitiesZoneDateTime(ZonedDateTime londonTime, ZonedDateTime losAngelesTime, ZonedDateTime sydneylosTime) {

        System.out.println("Londyn: " + londonTime.format(format));
        System.out.println("Los Angeles: " + losAngelesTime.format(format));
        System.out.println("Sydney: " + sydneylosTime.format(format));
    }

    private ZonedDateTime getCityDateTime(ZonedDateTime localTimeZone, String s) {
        ZoneId londonId = ZoneId.of(s);
        return localTimeZone.toInstant().atZone(londonId);
    }

    private ZonedDateTime getUtcDateTime(ZonedDateTime localTimeZone) {
        return localTimeZone.withZoneSameInstant(ZoneOffset.UTC);
    }

    private ZonedDateTime getLocalZoneDateTime(LocalDateTime timeFromUser) {
        return timeFromUser.atZone(ZoneId.systemDefault());
    }

    private LocalDateTime getLocalDateTime(String input) {
        try {
            DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                    .appendOptional(DateTimeFormatter.ofPattern(DAYS_MONTHS_YEAR_TIME))
                    .appendOptional(DateTimeFormatter.ofPattern(YEAR_MONTHS_DAYS_TIME))
                    .appendOptional(DateTimeFormatter.ofPattern(DAYS_MONTHS_YEAR_TIME_NO_SECONDS))
                    .toFormatter();
            return LocalDateTime.parse(input, formatter);
        } catch (DateTimeParseException e) {
            // ignore
        }

        try {
            DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                    .appendOptional(DateTimeFormatter.ofPattern(YEAR_MONTHS_DAYS))
                    .toFormatter();
            LocalDate localdate = LocalDate.parse(input, formatter);
            LocalTime localTime = LocalTime.of(0, 0);

            LocalDateTime timeFromUser = LocalDateTime.of(localdate, localTime);
            return timeFromUser;
        } catch (DateTimeParseException e) {
            // ignore
        }
        return null;
    }

    private String getDateFromUser() {
        System.out.println("Podaj datę:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

}
