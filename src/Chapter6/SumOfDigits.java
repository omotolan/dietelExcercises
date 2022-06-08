package Chapter6;

import java.util.Scanner;

public class SumOfDigits {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Sum of digits");
        System.out.println("Enter for digits number: ");
        int number = input.nextInt();

        int sum = sumOfDigits(number);
        System.out.println("sum of digits of " + number + " is: " + sum);

    }

    public static int sumOfDigits(int number) {
        int sum;
        int firstNumber = number % 10;
        int secondNumber = (number % 100) / 10;
        int thirdNumber = (number % 1000) / 100;
        int forthNumber = (number / 1000);

        sum = firstNumber + secondNumber + thirdNumber + forthNumber;
        return sum;
    }
}
