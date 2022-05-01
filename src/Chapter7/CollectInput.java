package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class CollectInput {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter length of array: ");
        int number = input.nextInt();
        int[] numbers = new int[number];
        userInput(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("Enter length of array: ");
        int value = input.nextInt();
        int[] values = userInput(value);
        System.out.println(Arrays.toString(values));
    }

    public static int[] userInput(int number) {
        System.out.println("enter " + number + " numbers: ");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();

        }
        return values;
    }

    public static int[] userInput(int[] array) {
        System.out.println("enter  numbers: ");
        // int[] values = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();

        }
        return array;
    }
}
