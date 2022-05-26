package DSA;

public class MyStack {
    private int counter;
    private Object[] array = new Object[5];


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
        array[counter] = -1;
    }

    public Object peek() {
        return array[counter - 1];
    }
}
