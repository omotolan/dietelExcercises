package Chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionByZero {
    public static void main(String[] args) {
        int numerator = input("Enter numerator: ");
        int denominator = input("Enter denominator: ");

        try {
            int approximateQuotient = numerator / denominator;
            display(approximateQuotient + " ");
        }
        catch (InputMismatchException e){
            System.out.println("you cant input zero");
        }

    }

    private static int input(String prompt) {
        display(prompt);
        Scanner input = new Scanner(System.in);
        try {
            return input.nextInt();
        }
        catch (InputMismatchException ex){
            System.out.println("I expect intergers");
            display("Try again.");
           // System.exit(3);
            input(prompt);
        }
        return 0;
    }

    private static void display(String prompt) {
        System.out.println(prompt);
    }
}
