package DSA;

import java.util.Arrays;

public class MySet implements CustomList {
    private final int initialCapacity = 5;
    Object[] array = new Object[initialCapacity];

    int counter;

    @Override
    public boolean isEmpty() {
        return counter == 0;


    }

    @Override
    public void add(Object data) {
        if (!contains(data)) {
            array = grow();
            array[counter] = data;
            counter++;
        }
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

        if (!contains(data)) {
            Object[] newArray = new Object[array.length + 1];
            System.arraycopy(array, index, newArray, index + 1, newArray.length - index - 1);
            System.arraycopy(array, 0, newArray, 0, index);
            newArray[index] = data;
            array = newArray;
            counter++;
        }
    }

    @Override
    public void clear() {
        Arrays.fill(array, null);

    }

    @Override
    public boolean contains(Object data) {
        for (Object o : array) {
            if (data.equals(o)) {
                return true;
            }
        }
        return false;
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
        if (contains(data)) {
            int indexOfObj = indexOf(data);
            int newSize = array.length - 1;
            System.arraycopy(array, indexOfObj + 1, array, indexOfObj, newSize - indexOfObj);
            counter--;
        }

    }

    @Override
    public void remove(int index) {
        outOfBoundMessage(index);
        int newSize = array.length - 1;
        System.arraycopy(array, index + 1, array, index, newSize - index);
        counter--;

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
