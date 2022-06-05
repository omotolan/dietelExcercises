package DSA;

import java.util.ArrayList;

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
        if (!isEmpty()) {
            for (Object o : keys) {
                if (key.equals(o)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        if (!isEmpty()) {
            for (Object o : values) {
                if (value.equals(o)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Object get(Object key) {
        if (!isEmpty()) {
            for (Object o : keys) {
                if (key.equals(o)) {

                }
            }
        }
        return null;
    }

    @Override
    public void clear() {

        for (Object o : keys) {
            // if (o.equals(keys)){
            o = null;
        }
        for (Object obj : values) {

            obj = null;
        }


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
