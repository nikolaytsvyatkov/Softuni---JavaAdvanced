package IteratorAndComparator.Collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListyIterator implements Iterable<String>{
    private List<String> data;
    private int index;


    public ListyIterator(String... strings) {
        this.data = Arrays.asList(strings);
        this.index = 0;
    }
    public boolean Move() {
        if (this.index + 1 < this.data.size()) {
            this.index++;
            return true;
        }
        return false;
    }
    public boolean HasNext() {
        if (this.index  < this.data.size() - 1) {
            return true;
        }
        return false;
    }
    public void Print() {
        if (this.data.size() > this.index) {
            System.out.println(this.data.get(index));
        } else {
            throw new NullPointerException("Invalid Operation!");
        }
    }
    public void PrintAll() {
        for (String str : this) {
            System.out.print( str + " ");
        }
        System.out.println();
    }
    public final class NewIterator implements Iterator<String> {
        int index;
        @Override
        public boolean hasNext() {
            return this.index < data.size();
        }

        @Override
        public String next() {
            return data.get(index++);
        }
    }
    @Override
    public Iterator<String> iterator() {
        return new NewIterator();
    }

    @Override
    public void forEach(Consumer<? super String> action) {

    }
}

