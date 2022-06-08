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
    public void put(Object key, Object data) throws DuplicatedKeyValue {

        if (!isEmpty()) {
            for (Object o : keys) {
                if (o.equals(key)) {
                    throw new DuplicatedKeyValue("Key with value already exists.");

                }
            }
        }
        keys.add(counter, key);
        values.add(counter, data);
        counter++;

    }

    private Object add(Object key, Object data) {
        if (!isEmpty()) {
            for (int i = 0; i < keys.size(); i++) {
                if (key.equals(keys.get(i))) {
                    values.add(i, data);
                }

            }

        }
//        Object temp = null;
//        if (!isEmpty()){
//            for (Object o : keys){
//                if (o.equals(key)){
//                    temp = data;
//                    values.add(data);
//                }
//            }
//        }
        keys.add(counter, key);
        values.add(counter, data);
        counter++;
        return null;
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
    public boolean containsData(Object data) {
        if (!isEmpty()) {
            for (Object o : values) {
                if (data.equals(o)) {
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
    public boolean remove(Object key, Object data) {
        return false;
    }

    @Override
    public Object replace(Object key, Object data) {
        return null;
    }

    @Override
    public boolean replace(Object key, Object oldData, Object newData) {
        return false;
    }

}
