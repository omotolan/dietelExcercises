package Chapter7;

public class Add {
    public static void main(String[] args) {
        int[][] array = {{3,4, 6, 87, 5}, {8, 9, 0, 4, 90}};
int sum =0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }


        }
        System.out.println(sum);
    }
}
