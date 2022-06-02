package Chapter4;

import java.util.Scanner;

public class DecimalEquivalentOfBinaryNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter binary number of 4 digits: ");
        int number = input.nextInt();

        int number1 = (number % 10);
        int number2 = (number % 100) / 10;
        int number3 = (number % 1000) / 100;
        int number4 = (number % 10000) / 1000;

        int decimal = (number1 * 1) + (number2 * 2) + (number3 * 4) + (number4 * 8);
        System.out.println(decimal);
    }
}
