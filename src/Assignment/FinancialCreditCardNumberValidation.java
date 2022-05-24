package Assignment;

import java.util.Scanner;

public class FinancialCreditCardNumberValidation {
    static Scanner input = new Scanner(System.in);
    static int numberEven;
    static int numberOdd;

    public static void main(String[] args) {
        validate();
    }

    public static void validate() {
        collectCreditCardNumber();
        validity();
    }

    private static void validity() {
        boolean isValid = isValid();
        System.out.println(isValid);
    }

    private static void collectCreditCardNumber() {

        int number;
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int number5 = 0;
        int number6 = 0;
        int number7 = 0;
        int number8 = 0;
        for (int i = 1; i < 17; i++) {

            System.out.println("Enter your credit card number: ");
            number = input.nextInt();
            if (i % 2 == 0) {
                numberOdd += number;
            }

            if (i == 1) {
                number1 = number * 2;
                number1 = separateNumber(number1);
            }
            if (i == 3) {
                number2 = number * 2;
                number2 = separateNumber(number2);
            }
            if (i == 5) {
                number3 = number * 2;
                number3 = separateNumber(number3);
            }
            if (i == 7) {
                number4 = number * 2;
                number4 = separateNumber(number4);
            }
            if (i == 9) {
                number5 = number * 2;
                number5 = separateNumber(number5);
            }
            if (i == 11) {
                number6 = number * 2;
                number6 = separateNumber(number6);
            }
            if (i == 13) {
                number7 = number * 2;
                number7 = separateNumber(number7);
            }
            if (i == 15) {
                number8 = number * 2;
                number8 = separateNumber(number8);
            }
            numberEven = number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8;
        }
        //System.out.println(numberEven);
        // System.out.println(numberOdd);
    }

    private static int separateNumber(int number) {
        if (number > 9) {

            int new1 = (number % 10);
            int new2 = (number % 100) / 10;
            number = new1 + new2;
        }
        return number;

    }

    private static boolean isValid() {
        int number = numberEven + numberOdd;
        if (number % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }

}

