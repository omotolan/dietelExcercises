package Chapter7;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] array1 = {4, 5, 6, 7, 4, 6, 4,};
        int[] array2 = {34, 45, 3, 5, 6, 7, 4,};

        int first = array1.length;
        int second = array2.length;

        int[] result = new int[first + second];

        System.arraycopy(array1, 0, result, 0, first);
        System.arraycopy(array2, 0, result, first, second);
        System.out.println(Arrays.toString(result));

        int t = 2;
        t = t + 7;
        t = t % 10;
        System.out.println(t);

        String resultq = 4 + "" + 8 + "" + 9 + "" +11;
        System.out.println(resultq);

    }
}
