package lekcja14_zadanie2_kody_krajów;

import java.util.Objects;

public class Country {
    private String code;
    private String name;
    private int population;


    public Country(String code, String name, int population) {
        this.code = code;
        this.name = name;
        this.population = population;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Country country = (Country) o;
        return population == country.population
                && Objects.equals(code, country.code)
                && Objects.equals(name, country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, population);
    }

    @Override
    public String toString() {
        return code + " " + "(" + name + ")" + " ma " + population + " ludności.";
    }
}
