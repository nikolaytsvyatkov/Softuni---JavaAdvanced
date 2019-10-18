package Generics.customlist;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomList<T extends Comparable<T>> implements Iterable<T> {
    private List<T> list;


    public CustomList() {
        list = new ArrayList<T>();
    }

    public List<T> getList() {
        return this.list;
    }

    public void add(T element) {
        this.list.add(element);
    }
    public T remove(int index) {
        T element = list.remove(index);
        return element;
    }
    public boolean contains(T element) {
        return this.list.contains(element);
    }
    public void swap(int index1, int index2) {
        T element = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, element);
    }
    public int countGreaterThan(T element) {
        int count = 0;
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }
    public T getMax(){
       /* T max = list.get(0);
        for (int i = 1; i < this.list.size(); i++) {
            if (max.compareTo(this.list.get(i)) < 0) {
                max = this.list.get(i);
            }
        }
        return max;*/
       return Collections.max(this.list);
    }



    public T getMin(){
       /* T max = list.get(0);
        for (int i = 1; i < this.list.size(); i++) {
            if (max.compareTo(this.list.get(i)) > 0) {
                max = this.list.get(i);
            }
        }*/
        return Collections.min(this.list);
    }
    public void print() {
      for (int i = this.list.size() - 1; i >= 0; i--) {
           System.out.println(this.list.get(i));
       }
    }
    public static <T extends Comparable<T>> void printList(CustomList<T> data) {
        data.list.forEach(System.out::println);
    }
    private final class CustomIterator implements Iterator<T>{
        private int index;
        @Override
        public boolean hasNext() {
            return index < getList().size();
        }

        @Override
        public T next() {
            return getList().get(index++);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator();
    }
}
