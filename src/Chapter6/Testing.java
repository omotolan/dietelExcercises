package Chapter6;

import java.util.Scanner;

public class Testing {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // test running methods
        double square = Math.sqrt(56);
        System.out.println(square);
        System.out.println(Math.sqrt(56));

        // method
        System.out.print("Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble(); // read first double
        double number2 = input.nextDouble(); // read second double
        double number3 = input.nextDouble(); // read third double
        // display maximum value
        System.out.println();
        double result = maximum(number1, number2, number3);
        System.out.println("Maximum is: " + result);

    }

    public static double maximum(double x, double y, double z) {
        double maximumValue = x;
        if (y > maximumValue) {
            maximumValue = y;
        }
        if (z > maximumValue) {
            maximumValue = z;
        }
        return maximumValue;
    }
}



