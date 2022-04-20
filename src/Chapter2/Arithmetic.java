package Chapter2;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an int: "); //2.15
        int firstNumber = input.nextInt();

        System.out.println("Enter second int: ");
        int secondNumber = input.nextInt();

        int add;
        int diff;
        int multiply;
        int division;

        add = firstNumber + secondNumber;
        System.out.printf("addition is %d%n", add);

        diff = firstNumber - secondNumber;
        System.out.printf("subtraction is %d%n", diff);


        multiply = firstNumber * secondNumber;
        System.out.printf("multiplication is %d%n", multiply);

        division = firstNumber / secondNumber;
        System.out.printf("division is %d%n", division);
    }
}
