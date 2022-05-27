package Chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFreestyle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Array list
        ArrayList<Integer> myList = new ArrayList<>(4);

        //manual addition to list
        myList.add(23);
        myList.add(1);
        myList.add(56);
        myList.add(34);
        myList.add(8);
        myList.add(67);
        myList.add(0);
        System.out.println(myList.get(3));
        System.out.println("enter number");
        int num = input.nextInt();
        myList.add(num);

        System.out.println(myList);
        //access array list with loop
        for (int i = 0; i < 2; i++) {
            System.out.print(myList.get(i) + " ");

        }

        //add to array list from user input
        for (int i = 0; i < 10; i++) {
            System.out.println("enter number: ");
            myList.add(input.nextInt());
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(myList.get(i) + " ");
        }

        //2D arraylist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialising the arraylist. if you dont initialise, it will throw an error
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // to add to the array list
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 2; j++) {
                list.get(i).add(input.nextInt());

            }

        }
        System.out.println(list);

    }
}
