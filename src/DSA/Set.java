package DSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Set implements CustomList {
    private final int initialCapacity = 5;
    Object[] array = new Object[initialCapacity];

    int counter;

    @Override
    public boolean isEmpty() {
        return counter == 0;

    }

    @Override
    public void add(Object obj) {
        if (!contains(obj)) {
            array = grow();
            array[counter] = obj;
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
    public void add(int index, Object obj) {

        if (!contains(obj)) {
            Object[] newArray = new Object[array.length + 1];
            System.arraycopy(array, index, newArray, index + 1, newArray.length - index - 1);
            System.arraycopy(array, 0, newArray, 0, index);
            newArray[index] = obj;
            array = newArray;
            counter++;
        }
    }

    @Override
    public void clear() {
        Arrays.fill(array, null);

    }

    @Override
    public boolean contains(Object obj) {
        for (Object o : array) {
            if (obj.equals(o)) {
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
    public int indexOf(Object obj) {
        Object element;
        for (int i = 0; i < array.length; i++) {
            element = array[i];
            if (obj.equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void remove(Object obj) {
        if (contains(obj)) {
            int indexOfObj = indexOf(obj);
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
    public void set(int index, Object obj) {
        outOfBoundMessage(index);
        array[index] = obj;

    }

    private void outOfBoundMessage(int index) {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + "is out of bound for ArrayList of size: " + array.length);
        }
    }

}
