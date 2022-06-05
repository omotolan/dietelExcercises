package DSA;

public class Stack {
    int numberOfElements;
    private int element;

    public boolean isEmpty() {
        if (numberOfElements == 0) return true;
        else return false;
    }

    public void push(int element) {

        numberOfElements++;
        this.element = element;
    }

    public int pop() {
        numberOfElements--;

        return element;
    }
}
