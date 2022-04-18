package Assignment;

import java.util.Arrays;

public class SevenSegementDisplay {
    private static String[][] segments = new String[5][4];
    public static void main(String[] args) {

        setSegmentA();
        setSegmentB();
        setSegmentC();
        setSegmentD();
        setSegmentE();
        setSegmentF();
        setSegmentG();
        System.out.println(Arrays.deepToString(segments));

    }
    public static void setSegmentA(){
        for (int i = 0; i <= 0 ; i++) {
            for (int j = 0; j <= 3; j++) {
                segments[i][j] = "*";
            }
        }
    }
    public static void setSegmentB(){
        for (int i = 0; i <= 2 ; i++) {
            for (int j = 3; j <= 3; j++) {
                segments[i][j] = "*";
            }
        }
    }
    public static void setSegmentC(){
        for (int i = 2; i <= 4 ; i++) {
            for (int j = 3; j <= 3; j++) {
                segments[i][j] = "*";
            }
        }
    }
    public static void setSegmentD(){
        for (int i = 4; i <= 4 ; i++) {
            for (int j = 0; j <= 3; j++) {
                segments[i][j] = "*";
            }
        }
    }
    public static void setSegmentE(){
        for (int i =2; i <= 4 ; i++) {
            for (int j = 0; j <= 0; j++) {
                segments[i][j] = "*";
            }
        }
    }
    public static void setSegmentF(){
        for (int i = 0; i <= 2 ; i++) {
            for (int j = 0; j <= 0; j++) {
                segments[i][j] = "*";
            }
        }
    }
    public static void setSegmentG(){
        for (int i = 2; i <= 2 ; i++) {
            for (int j = 0; j <= 3; j++) {
                segments[i][j] = "*";
            }
        }
    }

}
