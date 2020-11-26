package lekcja14_zadanie2_kody_krajów.rozwiązanie;

public class Country {
    private final String code;
    private final String name;
    private final int population;

    public Country(String code, String name, int population) {
        this.code = code;
        this.name = name;
        this.population = population;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }
}
