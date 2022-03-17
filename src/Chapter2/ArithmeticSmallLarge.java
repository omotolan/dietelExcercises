package Chapter2;

import java.util.Scanner;

public class ArithmeticSmallLarge {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int add, diff, multiply, division;
        System.out.println("Enter number: "); //2.17
        int fifthNumber = input.nextInt();

        System.out.println("Enter number: ");
        int sixthNumber = input.nextInt();

        System.out.print("Enter number: ");
        int seventhNumber = input.nextInt();

        add = fifthNumber + sixthNumber + seventhNumber;
        System.out.printf("answer is %d%n", add);

        division = (fifthNumber + sixthNumber + seventhNumber) / 3;
        System.out.printf("answer is %d%n", division);

        multiply = fifthNumber * sixthNumber * seventhNumber;
        System.out.printf("answer is %d%n", multiply);

        if (fifthNumber < sixthNumber && fifthNumber < seventhNumber) {
            System.out.println(fifthNumber + "%is the smallest");
        }
        if (sixthNumber < fifthNumber && sixthNumber < seventhNumber) {
            System.out.printf("%d is the smallest number", sixthNumber);
        }
        if (seventhNumber < fifthNumber && seventhNumber < sixthNumber) {
            System.out.println(seventhNumber + "is the smallest mumber");
        }
        if (fifthNumber > sixthNumber && fifthNumber > seventhNumber) {
            System.out.println(fifthNumber + "is the largest");
        }
        if (sixthNumber > fifthNumber && sixthNumber > seventhNumber) {
            System.out.printf("%d is the largest number", sixthNumber);
        }
        if (seventhNumber > fifthNumber && seventhNumber > sixthNumber) {
            System.out.println(seventhNumber + "is the largest number");
        }
    }
}
