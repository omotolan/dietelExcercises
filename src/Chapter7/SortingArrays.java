package Chapter7;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        int[] numbers = {45, 45, 2, 3, 6, 87, 6, 34, 23};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
        System.out.println();

        // sort from one particular index to another
        int[] figures = {45, 45, 2, 3, 6, 87, 6, 34, 23};
        Arrays.sort(figures, 1, 5);
        for (int i = 0; i < figures.length; i++) {
            System.out.print(figures[i] + " ");

        }
    }
}
