package FreeStyle;

import java.util.Scanner;

public class DivisionWithoutDivisionSign {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Division Without The Division Sign
        System.out.println("Division Of Numbers");

        System.out.println("Enter dividend: ");
        int dividend = keyboard.nextInt();

        System.out.println("Enter divisor: ");
        int divisor = keyboard.nextInt();

        int i = 0;
        while (dividend >= divisor) {
           i++;
           dividend -= divisor;
        }
        System.out.println(i);
        System.out.println(dividend);

    }
}
