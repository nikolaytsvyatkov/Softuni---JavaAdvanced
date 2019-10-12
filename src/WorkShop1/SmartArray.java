package WorkShop1;

public class SmartArray {
    private static final int INITIAL_CAPACITY = 4;
    private int[] data;
    private int size;
    private int capacity;

    public SmartArray() {
        this.capacity = INITIAL_CAPACITY;
        this.data = new int[capacity];
        this.size = 0;

    }
    public void resize () {
        this.capacity *= 2;
        int[] copy = new int[this.capacity];
        for (int i = 0 ; i < this.data.length; i++) {
            copy[i] = this.data[i];
        }
        this.data = copy;
    }
    private void shrink() {
        this.capacity /= 2;
        int[] copy = new int[this.capacity];
        for (int i = 0; i < this.size; i++) {
            copy[i] = this.data[i];
        }
        this.data = copy;

    }
    public void add(int element) {
        if (this.size == this.capacity) {
            this.resize();
        }
        this.data[this.size++] = element;
    }
    public int get(int index) {
        checkIndex(index);
        return this.data[index];
    }
    private void checkIndex (int index) {
        if (!(index >= 0 && index < this.size)) {
            String message = "Index out of bounds";
            throw new IndexOutOfBoundsException(message);
        }
    }
    private void shift (int index) {
        for (int i = index; i < this.size - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[size - 1] = 0;
    }
   public int remove(int index) {
       checkIndex(index);
       int temp = this.data[index];
       shift(index);
       size--;
       if (this.size <= this.capacity / 4) {
           shrink();
       }
       return temp;
   }
   private void shiftRight(int index) {

        for (int i = this.size - 1; i >= index; i--) {
            this.data[i + 1] = this.data[i];
        }
       this.size++;
   }
   public void add(int index, int element) {
        checkIndex(index);
       if (this.size == this.capacity) {
           this.resize();
       }
        shiftRight(index);
        size++;
        this.data[index] = element;
   }
}
