package Chapter7;

import java.util.Arrays;
import java.util.Collections;

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

    }
    private static void sortNumbersInAscendingOrder(int[] array){
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    private static void sortNumbersFromOneIndexToAnother(int[] array, int fromIndex, int toIndex){
        Arrays.sort(array, fromIndex, toIndex);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    private static void sortNumbersInDescendingOrder(int[] array){
        Arrays.sort(array, Collections.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
