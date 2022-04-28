package FreeStyle;

import java.util.Scanner;

public class MultiplicationWithoutMultiplicationSign {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //multiplication without the multiplication sign
        System.out.println("Enter Numbers To Multiply");

        System.out.println("Enter number: ");
        int firstNumber = keyboard.nextInt();

        System.out.println("Enter number: ");
        int secondNumber = keyboard.nextInt();

        int answer = 0;
        for (int i = 1; i <= secondNumber; i++) {
            answer += firstNumber;
        }
        System.out.println(answer);
    }
}
