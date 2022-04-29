package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int[][] array = {{3, 4, 6, 87, 5}, {8, 9, 0, 4, 90}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }


        }
        System.out.println(sum);


        Scanner input = new Scanner(System.in);
        int[] number = new int[10];
        for (int i = 0; i < number.length ; i++) {


            System.out.println("enter number: ");
            number[i] =input.nextInt();
        }
        System.out.println(Arrays.toString(number));
    }
}
