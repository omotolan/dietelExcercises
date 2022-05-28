package DSA;


import java.util.NoSuchElementException;

public class MyQueue implements IQueue {

    private int front;
    private int rear;
    private int capacity;
    private Object[] array;
    private int counter;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        array = new Object[this.capacity];
        front = -1;
        rear = -1;
    }

    @Override
    public void add(Object obj) throws QueueIsFullException {

        if (isFull()) {
            throw new QueueIsFullException("Queue is full.");
        } else {
            front = 0;
            rear++;
            array[rear] = obj;
            counter++;
        }

    }

    @Override
    public Object peek() {

        return array[front];

    }

    @Override
    public void remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");


        } else if (rear == front) {
            front = -1;
            rear = -1;

        } else {
            front++;
        }
        counter--;
    }

    @Override
    public boolean isFull() {
        // rear = capacity -1;
        return capacity == counter;
    }

    @Override
    public Object offer() {
        if (isEmpty()) {
            throw new NoSuchElementException("No Such Element");
        }
        return array[front];

    }

    @Override
    public Object element() {
        if (isEmpty()) {
            return null;
        }
        return array[front];
    }


    @Override
    public Object poll() {
        if (isEmpty()) {
            return null;
        }
        return array[front];

    }

    @Override
    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    @Override
    public int size() {
        return counter;
    }

    static class QueueIsFullException extends Throwable {
        public QueueIsFullException(String s) {
        }
    }

    private static void queueEmptyMessage() {
        throw new NullPointerException("Queue is empty");
    }
}
