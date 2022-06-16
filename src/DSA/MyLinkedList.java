package DSA;

import java.util.NoSuchElementException;

public class MyLinkedList implements ILinkedList {
    private Node head;
    private Node tail;
    private int counter;

    @Override
    public void add(Object value) {
        Node node = new Node(value);
        head = node;
        tail = head;

        if (counter >= 1) {
            tail.next = node;
            tail = node;

        }
        counter++;
    }

    @Override
    public void add(int reference, Object value) {

    }

    @Override
    public void addAtStart(Object value) {
        Node temp = head;
        Node node = new Node(value);
        head = node;
        node.next = temp;
        counter++;

    }

    @Override
    public void addAtLast(Object value) {

        Node temp = tail;
        Node node = new Node(value);
        if (temp == null) {
            head = node;
        } else {
            temp.next = node;
            tail = node;
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
        if (head == null){
            throw new NoSuchElementException();
        }
        else {
            Node temp = head;
            while (temp != null){
                temp = temp.next;
            }

        }
//        if (head == null) {
//
//        } else {
//            Node temp = tail;
//            tail = temp.next;
//        }
    }

    @Override
    public boolean contains(Object value) {
        if (head == null) {
            throw new NoSuchElementException();
        }
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            if (value.equals(temp)) {
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
        return temp.value;
    }

    @Override
    public Object getFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        Node temp = head;
        return temp.value;
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
