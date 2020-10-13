package lekcja4_zadanie3_todo;

public class ToDoListTest {
    public static void main(String[] args) {
        Person person1 = new Person("Rafal", "Kowalski");
        Person person2 = new Person("Paweł", "Kowalkiewicz");
        Task toDoList1 = new Task("Sprzątanie", "Sprzątanie salonu.", 0, person1);
        Task toDoList2 = new Task("Zakupy", "Kupienie artykułów na obiad.", 1, person2);
        Task toDoList3 = new Task("Zmywanie", "Zmywanie naczyń.", -1, person1);
        Task toDoList4 = new Task("Podlewanie", "Podlewanie kwiatów.", 0);
        Task toDoList5 = new Task("Sprzątanie", "Sprzątanie balkonu.");

        toDoList1.showAllInfo();
        System.out.println();
        toDoList2.showAllInfo();
        System.out.println();
        toDoList3.showAllInfo();
        System.out.println();
        toDoList4.showInfoWithoutPerson();
        System.out.println();
        toDoList5.showInfoWithoutPriorityAndPerson();

    }
}
