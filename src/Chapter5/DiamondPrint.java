package Chapter5;

public class DiamondPrint {
    public static void main(String[] args) {
        int star = 1;

        for (int i = 1; i <= 8; i+=2) {
            System.out.println();
//            for (int j = 8; j >= 0; j -= 2) {
//                System.out.print(" ");
//
//            }
            for (int k = 1; k <= i; k+=2) {
                System.out.print(k);
            }
//            for (int k = 1; k%2 == 1  ; k +=2) {
//                System.out.print("*");
//
//            }

        }
    }
}
