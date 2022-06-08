package Assignment;

import java.util.Scanner;

public class TwelveDaysOfChristmas {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int numberEntered = 0;
        while (numberEntered != -1) {
            System.out.println();
            System.out.println("Enter number between 1-12 and -1 to end: ");
            numberEntered = keyboard.nextInt();

            switch (numberEntered) {
                case 1 -> System.out.println("On the first day of christmas My true love said to me");
                case 2 -> System.out.println("On the second day of Christmas my true love said to me");
                case 3 -> System.out.println("On the third day of Christmas my true love said to me");
                case 4 -> System.out.println("On the forth day of Christmas my true love said to me");
                case 5 -> System.out.println("On the fifth day of Christmas my true love said to me");
                case 6 -> System.out.println("On the sixth day of Christmas my true love said to me");
                case 7 -> System.out.println("On the seventh day of christmas My true love said to me");
                case 8 -> System.out.println("On the eighth day of Christmas my true love said to me");
                case 9 -> System.out.println("On the ninth day of Christmas my true love said to me");
                case 10 -> System.out.println("On the tenth day of Christmas my true love said to me");
                case 11 -> System.out.println("On the eleventh day of Christmas my true love said to me");
                case 12 -> System.out.println("On the twelve day of Christmas my true love said to me");
                default -> System.out.println("no such number");
            }
            switch (numberEntered) {
                case 12:
                    System.out.println("12 drummers drumming");
                case 11:
                    System.out.println("i sent 11 pipers piping");
                case 10:
                    System.out.println("Ten loads a-leaping");
                case 9:
                    System.out.println("Nine ladies dancing");
                case 8:
                    System.out.println("Eight maids a milking");
                case 7:
                    System.out.println("Seven swans a swimming");
                case 6:
                    System.out.println("Six geese a laying");
                case 5:
                    System.out.println("Five golden rings (five golden rings)");
                case 4:
                    System.out.println("Four calling birds");
                case 3:
                    System.out.println("Three French hens");
                case 2:
                    System.out.println("Two turtle-doves");
                case 1:
                    System.out.println("A partridge in a pear tree");

            }

        }
    }
}
