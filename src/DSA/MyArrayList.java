package DSA;

import java.util.Arrays;

public class MyArrayList implements CustomList {
    private final int initialCapacity;
    private Object[] array;
    private int counter;

    public MyArrayList() {
        initialCapacity = 10;
        array = new Object[initialCapacity];
    }

    @Override
    public boolean isEmpty() {
        return counter == 0;
    }

    @Override
    public void add(Object data) {
        array = grow();
        array[counter] = data;
        counter++;

    }


    private Object[] grow() {
        if (counter >= initialCapacity) {
            Object[] newArray = array;
            int newSize = array.length + 1;
            array = Arrays.copyOf(newArray, newSize);

        }
        return array;
    }

    @Override
    public void add(int index, Object data) {
        outOfBoundMessage(index);
        int size = array.length + 1;
        Object[] newArray = new Object[size];
        System.arraycopy(array, index, newArray, index + 1, size - index - 1);
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = data;
        array = newArray;
        counter++;

    }


    @Override
    public void clear() {
        Arrays.fill(array, null);
/*        for (int i = 0; i < array.length; i++) {
           array[i] = null;
        }*/
    }

    @Override
    public boolean contains(Object data) {
        for (Object element : array) {
            if (data.equals(element)) {
                return true;
            }
        }
        return false;
        // return indexOf(obj) != -1;
    }

    @Override
    public Object get(int index) {
        outOfBoundMessage(index);
        return array[index];
    }

    @Override
    public int indexOf(Object data) {
        Object element;
        for (int i = 0; i < array.length; i++) {
            element = array[i];
            if (data.equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void remove(Object data) {
        int index = indexOf(data);
        Object[] newArray = new Object[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        array = newArray;
        counter--;

    }

    @Override
    public void remove(int index) {
//        Object[] newArray = new Object[array.length - 1];
//        System.arraycopy(array, 0, newArray, 0, index);
//        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
//        array = newArray;
        outOfBoundMessage(index);
        int newSize = array.length - 1;
        System.arraycopy(array, index + 1, array, index, newSize - index);
        counter--;
        // array[newSize] = null;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public void set(int index, Object data) {
        outOfBoundMessage(index);
        array[index] = data;

    }

    private void outOfBoundMessage(int index) {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + "is out of bound for ArrayList of size: " + array.length);
        }
    }


}
