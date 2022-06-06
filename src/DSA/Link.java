package DSA;

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

    public static void main(String[] args) {
        Link li = new Link();
        li.add(6);
        li.add(76);
        li.add(3);
        li.add(7);
        li.add(367);
        li.add(10);
        li.add(45);
        System.out.println(li.getSize());

        li.display();
    }
}
