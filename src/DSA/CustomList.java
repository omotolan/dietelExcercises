package DSA;

public interface CustomList {
    boolean isEmpty();

    void add(String item);

    void add(int index, String item);

    void clear();

    boolean contains(String item);

    String get(int index);

    int indexOf(String item);

    void remove(String item);

    void remove(int index);

    int size();

    void set(int index, String item);
    void expand();

}
