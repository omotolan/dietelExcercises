package DSA;

public class MyStack {
    private int counter;
    private final Object[] array;

    public MyStack(int capacity) {
        array = new Object[capacity];
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public void push(Object data) {
        array[counter] = data;
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
