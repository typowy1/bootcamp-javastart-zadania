package lekcja6_zadanie1_tablica_pracownikow1;

public class Company {
    private Employee[] employees;
    private int quantity = 0;

    public Company(int employeesNumber) {
        this.employees = new Employee[employeesNumber];
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void add(Employee emp) {
        this.employees[quantity] = emp;
        quantity++;
    }

    public Employee get(int index) {
        return employees[index];
    }
}
