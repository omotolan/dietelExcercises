package Assignment;

import java.util.Scanner;

public class FinancialCreditCardNumberValidationAdvanceDriver {
    private static Scanner input = new Scanner(System.in);
    static FinancialCreditCardNumberValidationAdvance financialCreditCardNumberValidationAdvance = new FinancialCreditCardNumberValidationAdvance();

    public static void main(String[] args) {
        creditCardStatus();

    }

    private static int[] collectCreditCardNumber() {
        int[] creditCardNumber = new int[16];
        System.out.println("Enter your 16 digit credit card number: ");
        for (int i = 0; i < creditCardNumber.length; i++) {
            creditCardNumber[i] = input.nextInt();
        }
        return creditCardNumber;
    }

    private static int sumCreditCardNumber() {
        int summedValue = 0;
        summedValue = financialCreditCardNumberValidationAdvance.sum(collectCreditCardNumber());
        return summedValue;
    }

    private static boolean isValid() {
        boolean isValid = financialCreditCardNumberValidationAdvance.isValid(sumCreditCardNumber());
        return isValid;
    }

    private static void creditCardStatus() {
        boolean isValid = isValid();
        if (isValid) {
            System.out.println("Credit card is valid.");
        } else {
            System.out.println("Credit card is invalid.");
        }
    }

}
