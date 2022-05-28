package DSA;

public class MyStack {
    private int counter;
    private int capacity;
    private Object[] array;// = new Object[5];

    public MyStack(int capacity) {
        this.capacity = capacity;
        array = new Object[this.capacity];
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public void push(Object element) {
        array[counter] = element;
        counter++;
    }

    public int size() {
        return counter;
    }

    public void pop() {
        counter--;
        // array[counter] = -1;
    }

    public Object peek() {
        return array[counter - 1];
    }
}
