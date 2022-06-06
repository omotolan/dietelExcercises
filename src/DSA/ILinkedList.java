package DSA;

public interface ILinkedList {
    void insert(Object item);

    void insertAt(int reference, Object item);

    void insertAtStart(Object item);

    boolean isEmpty();

    void display();

    Object get(int index);

    int size();
}
