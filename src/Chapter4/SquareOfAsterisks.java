package Chapter4;

import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter number between 1 - 20: ");
        int asterisks = keyboard.nextInt();

        for (int i = 0; i < asterisks; i++) {
            for (int j = 0; j < asterisks; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
//        int i = 0;
//        int j = 0;
//        while(i< asterisks){
//            System.out.println();
//            i++;
//            while (j<asterisks){
//                System.out.println("*");
//                j++;
//            }
//        }
    }
}
