package Chapter6;

import java.util.Scanner;

public class PerfectNumbers {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //perfect number, a positive integer that is equal to the sum of its proper divisors.
        System.out.println("To determine is a number is a perfect number.");
        int number = 0;
        while (number != -1) {
            System.out.println("Enter number or -1 to terminate:");
            number = input.nextInt();

            System.out.println(isPerfect(number));
        }


    }

    public static boolean isPerfect(int number) {
        int result = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                result += i;
            }
        }
        return result == number;
    }
}
