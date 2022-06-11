package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Airline {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] seats = new boolean[10];
        int firstClass = 0;
        int economy = 5;

        int counter = 0;
        while (counter != 15) {

            System.out.println("enter 1 for first");
            int choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    if (firstClass != 5) {
                        seats[firstClass] = true;
                        firstClass++;
                    }
                    if (firstClass == 5 && economy != 10) {
                        System.out.println("first class is full, would you prefer second class?");
                    } else if (firstClass == 5 && economy == 10) {
                        System.out.println("we are out of tickets");
                    }
                }
                case 2 -> {
                    if (economy != 10) {
                        seats[economy] = true;
                        economy++;
                    }
                    if (economy == 10 && firstClass == 5) {
                        System.out.println("we are out of tickets");
                    } else if (economy == 10 && firstClass != 5) {
                        System.out.println("second class fully booked, would you prefer first class?");
                    }
                }
            }
            counter++;
            System.out.println(Arrays.toString(seats));

        }
    }
}
