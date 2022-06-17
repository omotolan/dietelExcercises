package DSA;

public interface ILinkedList<E> {
    void add(E value);

    void add(int reference, E value);

    void addAtStart(E value);

    void addAtLast(E value);

    boolean isEmpty();

    void deleteFirst();

    void deleteLast();

    boolean contains(E value);

    E getLast();

    E getFirst();

    void display();

    E get(int index);

    int size();
}
