package Classwork;

//practising array
public class Arrays {
    public static void main(String[] args) {
        String[][] xAndOs = new String[3][3];
        xAndOs[0][0]= "X";
        xAndOs[0][1]= "0";
        xAndOs[0][2]= "X";
        xAndOs[1][0]= "X";
        xAndOs[1][1]= "X";
        xAndOs[1][2]= "X";
        xAndOs[2][0]= "0";
        xAndOs[2][1]= "X";
        xAndOs[2][2]= "0";

        System.out.println(xAndOs[0][0] + " "+ xAndOs[0][1] + " " + xAndOs[0][2]);
        System.out.println(xAndOs[1][0] + " "+ xAndOs[1][1] + " " + xAndOs[1][2]);
        System.out.println(xAndOs[2][0] + " "+ xAndOs[2][1] + " " + xAndOs[2][2]);

        int[] numbers = new int[300];
        for (int j =0; j<300; j++) {
            numbers[j]=j+1;}
            for (int i = 0; i <300; i++) {
                System.out.print(numbers[i]+ " ");
            }
        System.out.println();

  //assigment
        int[] figures = {34, 223, 53, 57, 43, 32, 566, 234, 344, 78};
        for (int figure : figures) {
            System.out.print(figure + " ");
        }
        System.out.println();
        System.out.println("Sum of the array is" + " " + sumOfFigures(figures));
        System.out.println();
        System.out.println( "highest number in the array list is " + " " + highestFigure(figures));
        System.out.println();
        System.out.println("average of the array is" + " " + averageOfFigure(figures));
        }
        public static int highestFigure(int[] array){
        int highest = array[0] ;
            for (int i : array) {
                if (i > highest) {
                    highest = i;
                }
            }
            return  highest;
        }
        public static double averageOfFigure(int[] array){
//        double sum = 0;
//        for(int m =0; m< array.length; m++){
//            sum += array[m];
//        }
        return  sumOfFigures(array)/ array.length;
        }
        public static  double sumOfFigures(int[] array){
       int sum = 0;
            for (int i : array) {
                sum += i;
            }
            return sum;
        }
}

