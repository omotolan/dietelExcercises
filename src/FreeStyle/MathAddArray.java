package FreeStyle;

import java.util.Arrays;

public class MathAddArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {1,1,1,3};
        int[] c = new int[4];
        int sum = 0;
        for (int i = a.length-1; i >= 0 ; i--) {
            c[i] = a[i] + b[i];
        }



        System.out.println(Arrays.toString(c));
    }
}
