package Chapter2;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter number: "); //2.16
        int thirdNumber = input.nextInt();

        System.out.println("Enter number: ");
        int forthNumber = input.nextInt();

        if (thirdNumber > forthNumber) {
            System.out.printf("%d is larger %n", thirdNumber);
        }
        if (forthNumber > thirdNumber) {
            System.out.printf("%d is larger %n", forthNumber);
        }
    }
}
