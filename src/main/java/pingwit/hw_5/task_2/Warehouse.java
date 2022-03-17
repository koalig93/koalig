package pingwit.hw_5.task_2;

import java.util.Arrays;

public class Warehouse<T> {

    private final T[] catalog;
    private int pos = 0;

    public Warehouse(T[] catalog) {
        this.catalog = catalog.clone();
    }

    public T next() {
        T result = catalog[pos];
        pos = (pos + 1) % catalog.length;
        return result;
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
