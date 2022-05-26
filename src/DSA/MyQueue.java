package DSA;


import java.util.NoSuchElementException;

public class MyQueue implements IQueue {
    private Object[] array = new Object[5];
    private int counter;

    @Override
    public void add(Object obj) {
        array[counter] = obj;
        counter++;
    }

    @Override
    public Object offer() {
        if (isEmpty()) {
            throw new NoSuchElementException("No Such Element");
        }
        return array[0];

    }

    @Override
    public Object element() {
        if (isEmpty()) {
            return null;
        }
        return array[0];
    }

    @Override
    public Object peek() {
        return array[0];
    }

    @Override
    public Object remove() {
        Object[] newArray = new Object[array.length - 1];
        System.arraycopy(array, 1, newArray, 0, array.length - 1);
        array = newArray;
        if (isEmpty()) {
            return null;
        }
        return array[0];
    }

    @Override
    public Object poll() {
        if (isEmpty()) {
            throw new NullPointerException("Queue is empty");
        }
        return array[0];

    }

    @Override
    public boolean isEmpty() {
        return counter == 0;
    }

    @Override
    public int size() {
        return counter;
    }
}
