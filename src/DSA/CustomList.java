package DSA;

public interface CustomList {
    boolean isEmpty();

    void add(Object value);

    void add(int index, Object value);

    void clear();

    boolean contains(Object value);

    Object get(int index);

    int indexOf(Object value);

    void remove(Object value);

    void remove(int index);

    int size();

    void set(int index, Object value);


}
