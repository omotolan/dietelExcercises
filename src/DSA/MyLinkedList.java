package DSA;

public class MyLinkedList implements ILinkedList {
    private Node head;
    private Node tail;
    private int counter;

    @Override
    public void insert(Object item) {
        Node node = new Node(item);
        head = node;
        tail = head;

        if (counter >= 1) {
            tail.next = node;
            tail = node;

        }
        counter++;
    }

    @Override
    public void insertAt(int reference, Object item) {

    }

    @Override
    public void insertAtStart(Object item) {

    }

    @Override
    public boolean isEmpty() {
        return counter == 0;
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

        public Node(Object value) {
            this.value = value;
        }

        private Node(Object value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
