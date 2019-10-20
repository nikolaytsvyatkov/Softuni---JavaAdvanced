package IteratorAndComparator.ListlyIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListyIterator {
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


}
