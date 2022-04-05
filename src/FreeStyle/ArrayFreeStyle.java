package FreeStyle;

import java.util.Arrays;

public class ArrayFreeStyle {
    public static void main(String[] args) {
        int[] figures = {34, 223, 53, -57, 43, 32, -566, 234, 344, 78};
        for (int i : figures){  //0; i < figures.length; i++){
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
    }
    public static int sum(int[] array){
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        return sum;
    }
}
