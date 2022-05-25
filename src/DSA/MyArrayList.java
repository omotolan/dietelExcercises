package DSA;

public class MyArrayList implements CustomList {
    private int newCapacity =5;

    private String[] array = new String[newCapacity*2];
    private int counter;

    @Override
    public boolean isEmpty() {
        if (counter == 0) {
            return true;
        } else return false;
    }

    @Override
    public void add(String item) {
        array[counter] = item;
        counter++;
        newCapacity++;
    }

    @Override
    public void add(int index, String item) {
        array[index] = item;
        counter++;
        newCapacity++;
    }

    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    @Override
    public boolean contains(String item) {
        for (String element : array) {
            if (item.equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String get(int index) {
        String item = null;

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
    public int indexOf(String item) {
        String element;
        for (int i = 0; i < array.length; i++) {
            element = array[i];
            if (item.equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void remove(String item) {
        int index = indexOf(item);
        String[] newArray = new String[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        array = newArray;

    }

    @Override
    public void remove(int index) {
        String[] newArray = new String[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        array = newArray;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public void set(int index, String item) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[index] = item;
            }

        }

    }

    @Override
    public void expand() {
        newCapacity = array.length * 2;
        String[] newArray = new String[newCapacity];
        System.arraycopy(array, 0, newArray, 0, newCapacity * 2);
        array = newArray;

    }
}
