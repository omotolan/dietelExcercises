package FreeStyle;

public class Loops {
    public static void main(String[] args) {

        // the outer loop is vertical, that is columns
        // the inner loop is horizontal, that is rows
        // 2 dimension has rows and columns
        //to get the 2D, separate it first. print the rows and columns separately
        // then try and bring them together


//        for (int i = 0; i<4 ; i++ ) {
//            System.out.println(" ");
//            for (int j = 0; j < 3; j++) {
//                System.out.print("*");
//            }
//        }


        for (int i = 0; i < 4; i++) {
            System.out.println(" ");
            for (int j = 0; j < 4; j++) {
                System.out.print(i++);
            }
        }
    }
}
