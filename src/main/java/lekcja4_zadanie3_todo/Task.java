package lekcja4_zadanie3_todo;

public class Task {
    private String name;
    private String description;
    private double priority;
    private Person person;

    public Task(String taskName, String taskDescription, double priority, Person person) {
        this(taskName, taskDescription, priority);
        this.person = person;
    }

    public Task(String taskName, String taskDescription, double priority) {
        this(taskName, taskDescription);
        this.priority = priority;
    }

    public Task(String taskName, String taskDescription) {
        this.name = taskName;
        this.description = taskDescription;
    }

    public boolean highPriority() {
        return priority > 0;
    }

    public boolean mediumPriority() {
        return priority == 0;
    }

    public boolean lowPriority() {
        return priority < 0;
    }

    public void showAllInfo() {
        System.out.println("Wykonawca: " + person.getFirstName() + " " + person.getSecondName());
        showInfoWithoutPerson();
    }

    public void showInfoWithoutPerson() {
        showInfoWithoutPriorityAndPerson();
        System.out.println("Prirytet zadania!");
        System.out.println("Wysoki: " + highPriority());
        System.out.println("Normalny: " + mediumPriority());
        System.out.println("Niski: " + lowPriority());
    }

    public void showInfoWithoutPriorityAndPerson() {
        System.out.println("Zadanie: " + " " + name + ", opis: " + description);
    }
}
