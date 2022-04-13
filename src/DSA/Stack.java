package DSA;

public class Stack {
    //private boolean isEmpty = true; // our stack's default is true cause it's empty
    int numberOfElements;

    public boolean isEmpty() {
        if(numberOfElements == 0) return true;
        else return false;
        //return isEmpty; don't need this anymore
    }

    public void push(int element) {
        //isEmpty = false;
        numberOfElements++;
    }

    public void pop() {
        numberOfElements--;
       // isEmpty = true;
    }
}
