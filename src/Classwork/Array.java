package Classwork;

import java.util.Arrays;
import java.util.Random;

//practising array
public class Array {
    public static void main(String[] args) {
//       // String[] boyNames = {"tola", "biodun", "tolu", "bassey"};
//        String[] boyNames = new String[4];
//        boyNames [0] = "tola";
//        boyNames[1] = "biodun";
//        boyNames[2] = "tolu";
//        boyNames[3] = "bassey";
//       System.out.println(boyNames[3]);
//        //System.out.println(boyNames[0, 1]);
//        for(int i = 0; i<=boyNames.length; i++){
//            System.out.println(boyNames[i]);
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
//generate password
          char[] password = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J','K', 'L', 'M',
                            'N', 'O', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0','n',
                            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                            'P', 'Q','R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
            Random random = new Random();

            for(int i = 0; i<13; i++){
                String myPass = String.valueOf(password[random.nextInt(i + ' ')]);
                System.out.print(myPass);
            }
        }
        }

