package Chapter4;

import java.util.Scanner;

public class EncryptingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 4 digits to encrypt: ");
        int rawNumber = input.nextInt();

        int rawNumber1 = 7 + (rawNumber % 10);
        int rawNumber2 = 7 + ((rawNumber % 100) / 10);
        int rawNumber3 = 7 + (rawNumber % 1000) / 100;
        int rawNumber4 = 7 + ((rawNumber % 10000) / 1000);

        rawNumber1 %= 10;
        rawNumber2 %= 10;
        rawNumber3 %= 10;
        rawNumber4 %= 10;

        int temporaryVariable = rawNumber1;
        int temporaryVariable1 = rawNumber2;

        rawNumber1 = rawNumber3;
        rawNumber2 = rawNumber4;
        rawNumber3 = temporaryVariable;
        rawNumber4 = temporaryVariable1;

        String encryptedNumber = rawNumber1 + "" + rawNumber2 + "" + rawNumber3 + "" + rawNumber4;
        System.out.println("encrypted number is: " + encryptedNumber);

    }
}
