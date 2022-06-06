package DSA;

public interface ILinkedList {
    void insert(Object item);

    void insertAt(int reference, Object data);

    void insertAtStart(Object data);

    void insertAtLast(Object data);

    boolean isEmpty();

    void display();

    Object get(int index);

    int size();
}
