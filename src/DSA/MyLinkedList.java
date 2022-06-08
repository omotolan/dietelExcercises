package DSA;

import java.util.NoSuchElementException;

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
    public void deleteFirst() {
        if (tail == null) {
            throw new NoSuchElementException();
        } else {
            Node temp = head;
            head = temp.next;
            counter--;
        }

    }

    @Override
    public void deleteLast() {
//        if (head == null) {
//            throw new NoSuchElementException();
//        } else {
//            Node temp = tail;
//            tail = temp.next;
//        }
    }

    @Override
    public boolean contains(Object data) {
        if (head == null) {
            throw new NoSuchElementException();
        }
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            if (data.equals(temp)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object getLast() {

        if (tail == null) {
            throw new NoSuchElementException();
        }
        Node temp = tail;
        return temp.data;
    }

    @Override
    public Object getFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        Node temp = head;
        return temp.data;
    }

    @Override
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.next);
            temp = temp.next;
        }

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
