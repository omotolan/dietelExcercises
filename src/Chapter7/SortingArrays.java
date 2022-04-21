package Chapter7;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        int[] numbers = {45, 45, 2, 3, 6, 87, 6, 34, 23};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        //called on method sort
        sortNumbersInAscendingOrder(numbers);

        System.out.println();

        // called on method to sort from one particular index to another
        int[] figures = {45, 45, 2, 3, 6, 87, 6, 34, 23};
        sortNumbersFromOneIndexToAnother(figures, 1, 5);

        System.out.println();
        // called on method reverse print
        printArrayFromReverse(figures);
    }

    public static void sortNumbersInAscendingOrder(int[] array) {
        Arrays.sort(array);
        loopThroughArray(array);
    }

    public static void sortNumbersFromOneIndexToAnother(int[] array, int fromIndex, int toIndex) {
        Arrays.sort(array, fromIndex, toIndex);
        loopThroughArray(array);
    }

    public static void printArrayFromReverse(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            printLoopedArray(array, i);
        }
    }

    private static void printLoopedArray(int[] array, int i) {
        System.out.print(array[i] + " ");
    }

    private static void loopThroughArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            printLoopedArray(array, i);
        }
    }

}
