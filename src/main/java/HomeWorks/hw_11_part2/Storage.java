package HomeWorks.hw_11_part2;

import java.util.ArrayList;

public class Storage<T> {
    private ArrayList<T> items;

    public Storage() {
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public T get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= items.size()) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return items.get(index);
    }

    public int size() {
        return items.size();
    }
}
