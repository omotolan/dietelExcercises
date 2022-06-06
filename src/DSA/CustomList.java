package DSA;

public interface CustomList {
    boolean isEmpty();

    void add(Object data);

    void add(int index, Object data);

    void clear();

    boolean contains(Object data);

    Object get(int index);

    int indexOf(Object data);

    void remove(Object data);

    void remove(int index);

    int size();

    void set(int index, Object data);


}
