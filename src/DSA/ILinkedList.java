package DSA;

public interface ILinkedList {
    void add(Object item);

    void add(int reference, Object data);

    void addAtStart(Object data);

    void addAtLast(Object data);

    boolean isEmpty();

    void deleteFirst();

    void deleteLast();

    boolean contains(Object data);

    Object getLast();

    Object getFirst();

    void display();

    Object get(int index);

    int size();
}
