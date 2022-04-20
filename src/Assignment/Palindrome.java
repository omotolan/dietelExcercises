package Assignment;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Palindrome {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter numbers: ");
        int number = input.nextInt();
        boolean answer = palindrome(number);
        System.out.println(answer);
    }

    public static boolean palindrome(int theNumber) {
        int new1 = (theNumber % 10) / 1;
        int new2 = (theNumber % 100) / 10;
        int new3 = (theNumber % 1000) / 100;
        int new4 = (theNumber % 10000) / 1000;
        int new5 = (theNumber % 100000) / 10000;

        if (new1 == new5) if (new2 == new4) {
            return true;
        }
        if (new1 != new5) if (new2 != new4) {
            return false;
        }
        return false;
    }
}
