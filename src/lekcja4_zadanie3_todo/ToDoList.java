package lekcja4_zadanie3_todo;

public class ToDoList {
    private String taskName;
    private String taskDescription;
    private double taskPriority;
    private Person person;

    public ToDoList(String taskName, String taskDescription, double priority, Person person) {
        this(taskName, taskDescription, priority);
        this.person = person;
    }

    public ToDoList(String taskName, String taskDescription, double priority) {
        this(taskName, taskDescription);
        this.taskPriority = priority;
    }

    public ToDoList(String taskName, String taskDescription) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    boolean highPriority() {
        return taskPriority > 0;
    }

    boolean mediumPriority() {
        return taskPriority == 0;
    }

    boolean lowPriority() {
        return taskPriority < 0;
    }

    void showAllInfo() {
        System.out.println("Wykonawca: " + person.getFirstName() + " " + person.getSecondName());
        showInfoWithoutPerson();
    }

    void showInfoWithoutPerson() {
        showInfoWithoutPriorityAndPerson();
        System.out.println("Prirytet zadania!");
        System.out.println("Wysoki: " + highPriority());
        System.out.println("Normalny: " + mediumPriority());
        System.out.println("Niski: " + lowPriority());
    }

    void showInfoWithoutPriorityAndPerson() {
        System.out.println("Zadanie: " + " " + taskName + ", opis: " + taskDescription);
    }
}
