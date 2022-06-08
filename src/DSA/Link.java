package DSA;


import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Link {
    // to create a list you need a node, so create a private class node
    private class Node {
        // a node holds two stuff; data and reference to the next node.
        private Object object;
        public Node next;

        // a constructor to always initialise the value of item upon creating a node object;
        public Node(Object object) {
            this.object = object;
            //this.next = null;
        }
    }

    // a linked list needs a head and tail. head is first node, tail is last node.
    private Node head;
    private Node tail;
    private int size;

    public void add(Object data) {
        //create a new node when adding to the linked list
        // inserting the first item to the list
        Node node = new Node(data);
        // if head is null, then the first data you are adding becomes the head and the tail points to
        // the same node cause the first node is the first and last item in the list
        // but the tail will always reference nothing until a new data is added
        if (head == null) {
            head = node;
            tail = head;
        }
        // adding second item to the node
        // if size is greater or equals to one, means there is a head.
        //  another node is created and the tail which is point to same location as the head now points to
        //  the new node(next node) and the node becomes the new tail
        else if (size >= 1) {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void insertAtStart(Object data) {
        //create a temporary variable to hold the data of the previous head. create a new node and assign the
        //new node to the head. now link the new head to the previous head(temporary value)
        Node temp = head;
        Node node = new Node(data);
        head = node;
        head.next = temp;
        size++;

    }
    public void deleteFirst(){

        if (head != null){
            Node temp = head;
        head = temp.next;}
        --size;
    }

    public void insertAtLast(Object data) {
        // create a temp node and assign the tail to it. create a new node and assign it to the tail.
        // then make the temp variable reference the new node(tail)
        // condition is for if there is no head, just make it the head
        Node temp = tail;
        Node node = new Node(data);
        tail = node; // or tail
        if (temp == null) {
            head = node;
        } else {
            temp.next = node;
        }
        size++;

    }
    public Object getLast() {
        if (tail == null){
            throw new NoSuchElementException();
        }else{
            Node temp = tail;

            return temp.object;}
    }
    public Object getFirst(){
        if(head == null){
            throw new NoSuchElementException();
        }
        else{
            Node temp = head;
            return temp.object;
        }
    }

    public int getSize() {
        return size;
    }

    public void display() {
        //you need the head to loop through the list
        // you need the head to loop through the list, because the head is always the first and doesn't
        // need to change node, you assign the head to a temporary
        //variable and loop through the list
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.object);
            temp = temp.next;
        }
    }
    public boolean contains(Object data){
        if (head == null){
            throw new NoSuchElementException();
        }
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            if (data.equals(temp)){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Link li = new Link();
        li.add(6);
        li.add(76);
        li.add(3);
        li.add(7);
        li.add(367);
        li.add(10);
        li.add(45);
        li.insertAtStart(678);
        li.insertAtStart(76273);
        li.insertAtLast(1);
        li.add(2);
        System.out.println(li.getSize());
        System.out.println(li.getLast());
        System.out.println(li.getFirst());
        li.deleteFirst();
      //  LinkedList

        li.display();
        System.out.println(li.contains(7));
    }
}
