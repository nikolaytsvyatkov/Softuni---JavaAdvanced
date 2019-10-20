package IteratorAndComparator.froggy;

import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {
    private List<Integer> elements;
    private Frog Iterator;
    public Lake(List<Integer> data) {
        this.elements = data;
        this.Iterator = new Frog();
    }

    public Frog getIterator() {
        return Iterator;
    }

    private class Frog implements Iterator<Integer> {

            private int cursor = elements.size() == 0 ? 0 : -2;

            private boolean isEvenCursor() {
                return cursor % 2 == 0;
            }

            @Override
            public boolean hasNext() {
                if (isEvenCursor() && elements.size() > 2) {
                    return true;
                } else if (!isEvenCursor() && elements.size() > 2) {
                    return cursor < elements.size() - 2;
                } else {
                    return cursor < elements.size() - 1;
                }
            }

            @Override
            public Integer next() {
                cursor += 2;

                if (cursor > elements.size() - 1) {
                    cursor = 1;
                }

                return elements.get(cursor);
            }
        }


    @Override
    public Iterator<Integer> iterator() {
        return this.Iterator;
    }
}
