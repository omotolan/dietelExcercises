package Chapter7;

import java.util.*;
import java.util.Arrays;

public class SortArrayDescendingOrder {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter length of array: ");
        int number = input.nextInt();
        int[] numbers = collectInput(number);
        printArray(numbers);
        System.out.println();
        sortArrayInDescendingOrder(numbers);
        printArray(numbers);



    }

    public static int[] collectInput(int number){
        System.out.println("Enter " + number + " numbers: ");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();

        }
        return values;

    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
    public static void sortArrayInDescendingOrder(int [] array){
        Integer[] numbers = {45, 45, 2, 3, 6, 87, 6, 34, 23};
        Arrays.sort(numbers);
        List<Integer> nums = Arrays.asList(numbers);
        nums.sort(Collections.reverseOrder());
        printArray(array);
    }

}
