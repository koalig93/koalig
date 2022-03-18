package pingwit.hw_5.task_2;

import java.util.Arrays;

// +
public class Warehouse<T> {

    private final T[] catalog;
    private int pos;

    public Warehouse(T[] catalog) {
        this.catalog = catalog.clone();
        pos = catalog.length - 1;
    }

    public T next() {
        pos = (pos + 1) % catalog.length;
        return catalog[pos];
    }

    public int size() {
        return catalog.length;
    }

    public T[] getArray() {
        return catalog.clone();
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "catalog=" + Arrays.toString(catalog) +
                '}';
    }
}
