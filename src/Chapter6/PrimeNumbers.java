package Chapter6;

import java.util.Scanner;

public class PrimeNumbers {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("To determine if a number is a prime number");
        int number = 0;
        while (number != -1) {
            System.out.println("Enter number: ");
            number = input.nextInt();

            System.out.println(isPrimeNumber(number));
        }

    }

    public static boolean isPrimeNumber(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        return counter == 2;
    }
}
