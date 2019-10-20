package IteratorAndComparator.CustomStack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack implements Iterable<Integer> {
    private List<Integer> data;

    public Stack() {
        this.data = new ArrayList<>();
    }

    public void push(int element) {
        this.data.add(element);
    }
    public void pop() {
        if (this.data.size() > 0) {
            this.data.remove(this.data.size() - 1);
        } else {
            throw new IndexOutOfBoundsException("No elements");
        }

    }
    public void print() {
        for (int i : this) {
            System.out.println(i);
        }
        for (int i : this) {
            System.out.println(i);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index = data.size() - 1;
            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public Integer next() {
                return data.get(index--);
            }

        };
    }
}
