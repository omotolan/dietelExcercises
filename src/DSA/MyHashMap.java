package DSA;

import java.util.ArrayList;
import java.util.zip.DataFormatException;

public class MyHashMap implements IMap {
    private ArrayList<Object> keys = new ArrayList<>();
    private ArrayList<Object> values = new ArrayList<>();
    private int counter;

    @Override
    public boolean isEmpty() {
        return counter == 0;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public void put(Object key, Object value) throws DuplicatedKeyValue {

        if (!isEmpty()) {
            for (Object o : keys) {
                if (o.equals(key)) {
                    throw new DuplicatedKeyValue("Key with value already exists.");

                }
            }
        }
        keys.add(counter, key);
        values.add(counter, value);
        counter++;

    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public boolean remove(Object key, Object value) {
        return false;
    }

    @Override
    public Object replace(Object key, Object value) {
        return null;
    }

    @Override
    public boolean replace(Object key, Object oldValue, Object newValue) {
        return false;
    }
}
