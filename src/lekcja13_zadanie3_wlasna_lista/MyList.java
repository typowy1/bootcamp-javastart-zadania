package lekcja13_zadanie3_wlasna_lista;

public class MyList <T> {
    private ListItem<T> start;

    void add(T item) {
        ListItem<T> listItem = new ListItem<T>(item);
        if (start == null) {
            start = listItem;
        } else {
            ListItem<T> currentElement = start;
            while (currentElement.next != null) {
                currentElement = currentElement.next;
            }
            currentElement.next = listItem;
        }
    }

    public void add(T ab, int i) {
        ListItem<T> previous = findListItemById(i - 1);
        ListItem<T> nextItem = findListItemById(i);
        ListItem<T> listItem = new ListItem<>(ab);
        previous.next = listItem;
        listItem.next = nextItem;
    }

    public int size() {
        if (start == null) {
            return 0;
        }

        int counter = 1;
        ListItem<T> currentElement = start;
        while (currentElement.next != null) {
            currentElement = currentElement.next;
            counter++;
        }
        return counter;
    }

    public T get(int i) {
        ListItem<T> currentElement = findListItemById(i);
        return currentElement.item;
    }

    private ListItem<T> findListItemById(int i) {
        if (start == null) {
            throw new IllegalArgumentException("Not found");
        }

        ListItem<T> currentElement = start;
        for (int j = 0; j < i; j++) {
            currentElement = currentElement.next;
        }
        return currentElement;
    }

    public void delete(int i) {
        if (i == 0) {
            if (start == null) {
                throw new IllegalArgumentException("Wrong id");
            }

            if (start.next != null) {
                start = start.next;
            }
        }

        ListItem<T> listItemToDelete = findListItemById(i);
        ListItem<T> previous = findListItemById(i - 1);
        previous.next = listItemToDelete.next;
    }


    static class ListItem<T> {
        private T item;
        private ListItem<T> next;

        public ListItem(T item) {
            this.item = item;
        }
    }
}
