package Chapter2;

import java.util.Scanner;

public class SeparatingDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = input.nextInt();
        // number(4357) divided by 10 = 435.7 and the modulo will be 7
        int number1 = number % 10;
        System.out.println(number1);
        int number2 = (number % 100) / 10;
        // 4357 divided by 100 = 43.57 and modulo will give 57. 57 / 10 will give 5.7, using / 5 will be saved cause it is an int
        System.out.println(number2);
        int number3 = (number % 1000) / 100;
        System.out.println(number3);
        int number4 = (number % 10000) / 1000;
        // or number / 1000 will give 4.357, just use division since it is the last number to get
        System.out.println(number4);

        String  no = "45545";
        char no1 = no.charAt(0);
        System.out.println(no1);
        char no2 = no.charAt(1);
        System.out.println(no2);

    }
}
