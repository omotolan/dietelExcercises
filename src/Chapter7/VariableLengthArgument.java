package Chapter7;

import java.util.Scanner;

public class VariableLengthArgument {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Addition of numbers");
        System.out.println("Enter length of values you which to input: ");
        int length = input.nextInt();
        int[] numbers = new int[length];
        int add = 0;
        for (int i = 0; i < length; i++) {
            System.out.println("enter numbers: ");
            numbers[i] = input.nextInt();

        }
        add = addition(numbers);
        System.out.println(add);
        int n = addition(40, 43, 34, 34, 34);
        System.out.println(n);

    }

    public static int addition(int... number) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        return sum;
    }
}
