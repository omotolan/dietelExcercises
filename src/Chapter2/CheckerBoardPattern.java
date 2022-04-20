package Chapter2;

public class CheckerBoardPattern {
    public static void main(String[] args) {
        System.out.println("*************");
        System.out.println(" *************");
        System.out.println("*************");
        System.out.println(" *************");
        System.out.println("*************");
        System.out.println(" *************");
        System.out.println("*************");
        System.out.println(" *************");
        pattern();
    }
    public static void pattern(){
        String pat = "*";
        for (int row = 0; row < 8; row++) {

            for (int i = 0; i < 8; i++) {
                if (row % 2 == 0){

                System.out.print(pat);
                }
                else System.out.printf("%s", "#");
            }
            System.out.println();
        }
    }
}
