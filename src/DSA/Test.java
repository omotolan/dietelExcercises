package DSA;

import java.util.Arrays;

public class Test {

    // test run for my arraylist.
    //tested the add method
    MyArrayList myArrayList = new MyArrayList();

    public static void main(String[] args) {
        Test test = new Test();
        test.add();
    }

    public void add() {
        myArrayList.add(8);
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(2);
        myArrayList.add(40);
        myArrayList.add(70);
        int index = 2;
        int a = myArrayList.size() + 1;
        System.out.println(a);
        Object[] nu;// = new Object[a];
        Object[] temp = new Object[a];
//nu = myArrayList.array;
        //    System.out.println(Arrays.toString(nu));
        System.out.println(Arrays.toString(temp));
        //error System.arraycopy(myArrayList.array,index,temp,index+1,myArrayList.array.length-index);
        System.out.println(Arrays.toString(temp));

        // error System.arraycopy(myArrayList.array,0,temp,0,index);
        System.out.println(Arrays.toString(temp));
        temp[index] = 9;
        System.out.println(Arrays.toString(temp));
        //error  myArrayList.array = temp;
        //error  System.out.println(Arrays.toString(myArrayList.array));

    }
}
