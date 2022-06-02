package Chapter4;

import java.util.Scanner;

public class DecryptingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 4 digits to decrypt: ");
        int rawNumber = input.nextInt();

        int rawNumber1 = (rawNumber % 10);
        int rawNumber2 = (rawNumber % 100) / 10;
        int rawNumber3 = (rawNumber % 1000) / 100;
        int rawNumber4 = (rawNumber % 10000) / 1000;

        int temporaryVariable = rawNumber1;
        int temporaryVariable1 = rawNumber2;

        rawNumber1 = rawNumber3;
        rawNumber2 = rawNumber4;
        rawNumber3 = temporaryVariable;
        rawNumber4 = temporaryVariable1;

        rawNumber1 = (rawNumber1 + 10) - 7;
        rawNumber2 = (rawNumber2 + 10) - 7;
        rawNumber3 = (rawNumber3 + 10) - 7;
        rawNumber4 = (rawNumber4 + 10) - 7;

        String decryptedNumber = rawNumber1 + "" + rawNumber2 + "" + rawNumber3 + "" + rawNumber4;
        System.out.println("Decrypted number is: " + decryptedNumber);
    }
}
