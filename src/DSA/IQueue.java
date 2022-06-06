package DSA;

public interface IQueue {
    void add(Object data) throws MyQueue.QueueIsFullException;

    boolean isFull();

    Object offer();

    Object element();

    Object peek();

    void remove();

    Object poll();

    boolean isEmpty();

    int size();

}
