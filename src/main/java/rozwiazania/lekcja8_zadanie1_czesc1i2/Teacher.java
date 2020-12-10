package rozwiazania.lekcja8_zadanie1_czesc1i2;

public class Teacher extends Person{

    private double salary;

    public Teacher(String firstName, String lastName, String pesel, String adderss, double salary) {
        super(firstName, lastName, pesel, adderss);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", " + salary;
    }
}
