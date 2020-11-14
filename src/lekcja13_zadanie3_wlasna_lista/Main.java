package lekcja13_zadanie3_wlasna_lista;

public class Main {

    public static void main(String[] args) {

        MyList<String> myList = new MyList<>();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");
        myList.add("e");
        myList.add("f");
        myList.add("g");

        myList.add("ab", 1);

        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println(myList.get(3));

    }
}
