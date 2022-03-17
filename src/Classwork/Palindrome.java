package Classwork;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first digit:  ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second digit:  ");
        int secondNumber = input.nextInt();

        System.out.print("Enter third digit:  ");
        int thirdNumber = input.nextInt();

        System.out.print("Enter fourth digit:  ");
        int forthNumber = input.nextInt();

        if (firstNumber == forthNumber && secondNumber == thirdNumber) {

            System.out.print("Number is a palindrome");
        }
       // if (firstNumber != forthNumber && secondNumber != thirdNumber) {
        else{
            System.out.print("Number is not a palindrome");
        }
    }
}
