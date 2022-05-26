package DSA;

public interface IQueue {
    void add(Object obj);
    Object offer();
    Object element();
    Object peek();
    Object remove();
    Object poll();
    boolean isEmpty();
    int size();

}
