package lekcja16_zadanie1_czteryporyroku;

public enum Season {

    SPRING("Wiosna", new String[]{"marzec, kwiecień, maj"}),
    SUMMER("Lato", new String[]{"czerwiec, lipiec, sierpień"}),
    AUTUMN("Jesień", new String[]{"wrzesień, październik, listopad"}),
    WINTER("Zima", new String[]{"grudzień, styczeń, luty"});

    private String plName;
    private String[] months;

    Season(String plName, String[] months) {
        this.plName = plName;
        this.months = months;
    }

    public String getPlName() {
        return plName;
    }

    public String[] getMonths() {
        return months;
    }

    public static Season getSeasonFromUserChoice(String input) {
        for (Season season : Season.values()) {
            if (input.equalsIgnoreCase(season.plName)) {
                return season;
            }
        }
        return null;
    }
}
