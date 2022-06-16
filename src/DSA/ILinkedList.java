package DSA;

public interface ILinkedList {
    void add(Object value);

    void add(int reference, Object value);

    void addAtStart(Object value);

    void addAtLast(Object value);

    boolean isEmpty();

    void deleteFirst();

    void deleteLast();

    boolean contains(Object value);

    Object getLast();

    Object getFirst();

    void display();

    Object get(int index);

    int size();
}
