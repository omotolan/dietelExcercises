package Chapter5;

public class Aste {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,7,5,3,1};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print(" "+"*");
            }
            System.out.println();
        }
    }
}
