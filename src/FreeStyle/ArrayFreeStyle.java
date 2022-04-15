package FreeStyle;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFreeStyle {
    public static void main(String[] args) {

        int[] figures = {34, 223, 53, -57, 43, 32, -566, 234, 344, 78};
        for (int i : figures) {  //0; i < figures.length; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print(sum(figures) + " ");

        System.out.println();
        int[] numbers = new int[7];
        System.out.println(Arrays.toString(numbers));
        System.out.println();
        boolean[] test = new boolean[7];
        System.out.println(Arrays.toString(test));
        System.out.println();
        String[] string = new String[4];
        System.out.println(Arrays.toString(string));

        // collecting array indexes from user
        Scanner keyboard = new Scanner(System.in);
        int[] ar = new int[5];
        System.out.println(Arrays.toString(ar));
        for (int i = 0; i < ar.length; i++) {
            System.out.println("enter array indexes: ");
            ar[i] = keyboard.nextInt();
        }
        for (int j = 0; j < ar.length; j++) {
            System.out.println(ar[j]);
        }


    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
