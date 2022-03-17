package Chapter2;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number"); //2.25
        int i = input.nextInt();

        if(i % 2 == 0) {
            System.out.printf("%d is an even number %n", i);
        }
        if (i % 2 == 1){
            System.out.printf("%d is and odd number %n", i);
        }
    }
}
