package DSA;

public class MyArrayList implements CustomList {
    private Object[] array = new Object[5];
    private int counter;

    @Override
    public boolean isEmpty() {
        if (counter == 0) {
            return true;
        } else return false;
    }

    @Override
    public void add(Object obj) {

        array[counter] = obj;
        counter++;

        Object[] newArray = new Object[array.length + 1];
        if (counter >= array.length) {
            array = newArray;
        }

    }

    @Override
    public void add(int index, Object obj) {
        array[index] = obj;
        counter++;
    }

    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    @Override
    public boolean contains(Object obj) {
        for (Object element : array) {
            if (obj.equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object get(int index) {
        Object item = null;

        try {
            for (int i = 0; i < array.length; i++) {
                item = array[index];
            }
        } catch (Exception e) {
            System.out.println("Index of of bound waray");

        }
        return item;
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
        int index = indexOf(obj);
        Object[] newArray = new Object[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        array = newArray;

    }

    @Override
    public void remove(int index) {
        Object[] newArray = new Object[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        array = newArray;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public void set(int index, Object obj) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[index] = obj;
            }

        }

    }

}
