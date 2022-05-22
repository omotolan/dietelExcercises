package Chapter7;

public class Union {
    public static void main(String[] args) {
        int[] array1 = {4, 5, 6, 7, 4, 6, 4,};
        int[] array2 = {34, 45, 3, 5, 6, 7, 4,};

            int sum1 = 0; int sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
         sum1 += array1[i] ;
        }
        for (int i = 0; i < array2.length; i++) {
            sum2 +=array2[i];
        }
        System.out.println(sum1 + sum2);
    }
}
