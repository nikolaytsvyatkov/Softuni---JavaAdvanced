package Generics.utilities;

import java.util.ArrayList;
import java.util.List;

public class ListUtils<T extends Comparable<T>> {
    private List<T> data;
    public ListUtils() {
        this.data = new ArrayList<>();
    }

    public T getMax(List<T> data) {
        if (this.data == null || this.data.size() == 0) {
            throw  new IllegalStateException();
        }
        T max = data.get(0);
        for (int i = 0; i < this.data.size(); i++) {
            if (max.compareTo(data.get(i)) < 0) {
                max = data.get(i);
            }
        }
        return max;
    }
    public T getMin(List<T> data) {
        if (this.data == null || this.data.size() == 0) {
            throw  new IllegalStateException();
        }
        T max = data.get(0);
        for (int i = 0; i < this.data.size(); i++) {
            if (max.compareTo(data.get(i)) > 0) {
                max = data.get(i);
            }
        }
        return max;
    }
}
