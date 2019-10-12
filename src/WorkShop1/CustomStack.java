package WorkShop1;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class CustomStack {
    private static final int INITIAL_CAPACITY = 4;
   private int[] items;
   private int size;
   private int capacity;

   public CustomStack() {
       this.capacity = INITIAL_CAPACITY;
       this.items = new int[capacity];
   }
   private void resize() {
       this.capacity *= 2;
       int[] copy = new int[this.capacity];
       for (int i = 0; i < this.size; i++) {
           copy[i] = this.items[i];
       }
       this.items = copy;
   }
   public int size() {
       return this.size;
   }
   public void push(int element) {
       if (this.size == capacity) {
           this.resize();
       }
       this.items[this.size++] = element;
   }
   public int pop() {
       if (this.size == 0) {

       }

       int temp = this.items[this.size - 1];
       this.size--;
       return temp;
   }
   public int peek() {
       if (this.size == 0) {
           throw  new NoSuchElementException();
       }
       return this.items[this.size - 1];
   }
   public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.items[i]);
        }
   }
}
