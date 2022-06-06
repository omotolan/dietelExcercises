package DSA;

public class MyLinkedList implements ILinkedList {
    private Node head;
    private Node tail;
    private int counter;

    @Override
    public void insert(Object data) {
        Node node = new Node(data);
        head = node;
        tail = head;

        if (counter >= 1) {
            tail.next = node;
            tail = node;

        }
        counter++;
    }

    @Override
    public void insertAt(int reference, Object data) {

    }

    @Override
    public void insertAtStart(Object data) {
        Node temp = head;
        Node node = new Node(data);
        head = node;
        head.next = temp;
        counter++;

    }

    @Override
    public void insertAtLast(Object data) {
        Node temp = tail;
        Node node = new Node(data);
        tail = node; // or tail
        if (temp == null) {
            head = node;
        } else {
            temp.next = node;
        }
        counter++;

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
        return counter;
    }

    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        private Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
