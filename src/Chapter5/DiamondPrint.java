package Chapter5;

public class DiamondPrint {
    public static void main(String[] args) {
        String star = "*";
        for (int i = 1; i <= 9; i++) {
            System.out.println();
            for (int j = 1; j <= i; j += 2) {
                System.out.print("*");
            }

        }
    }
}
