package Generics.genericbox;

public class Box<T extends Comparable<T>> {
    private T element;
    public Box(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public String toString() {
        return this.element.getClass().getName() + ": " + this.element;
    }
}
