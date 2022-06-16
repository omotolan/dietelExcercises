package DSA;

public class MyDoublyLinkedList implements ILinkedList {
    private Node head;
    private Node tail;
    private int counter;

    @Override
    public void add(Object value) {
        Node node = new Node(value);
        head = node;
        tail = head;
        if (counter >= 1){
            head.next = node;
            tail = node;

        }
    }

    @Override
    public void add(int reference, Object value) {

    }

    @Override
    public void addAtStart(Object value) {

    }

    @Override
    public void addAtLast(Object value) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void deleteFirst() {

    }

    @Override
    public void deleteLast() {

    }

    @Override
    public boolean contains(Object value) {
        return false;
    }

    @Override
    public Object getLast() {
        return null;
    }

    @Override
    public Object getFirst() {
        return null;
    }

    @Override
    public void display() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }


    private class Node {

        private Object value;
        private Node next;
        private Node prev;

        public Node(Object value) {
            this.value = value;
        }
    }
}
