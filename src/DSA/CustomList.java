package DSA;

import java.util.AbstractList;

public interface CustomList {
    boolean isEmpty();

    void add(Object obj);

    void add(int index, Object obj);

    void clear();

    boolean contains(Object obj);

    Object get(int index);

    int indexOf(Object obj);

    void remove(Object obj);

    void remove(int index);

    int size();

    void set(int index, Object obj);


}
