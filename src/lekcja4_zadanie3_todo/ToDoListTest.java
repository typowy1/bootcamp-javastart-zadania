package lekcja4_zadanie3_todo;

public class ToDoListTest {
    public static void main(String[] args) {
        Person person1 = new Person("Rafal", "Kowalski");
        Person person2 = new Person("Paweł", "Kowalkiewicz");
        ToDoList toDoList1 = new ToDoList("Sprzątanie", "Sprzątanie salonu.", 0, person1);
        ToDoList toDoList2 = new ToDoList("Zakupy", "Kupienie artykułów na obiad.", 1, person2);
        ToDoList toDoList3 = new ToDoList("Zmywanie", "Zmywanie naczyń.", -1, person1);
        ToDoList toDoList4 = new ToDoList("Podlewanie", "Podlewanie kwiatów.", 0);
        ToDoList toDoList5 = new ToDoList("Sprzątanie", "Sprzątanie balkonu.");

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
