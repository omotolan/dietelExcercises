package Assignment;

import java.util.Arrays;

public class SevenSegmentDisplay {
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
        setScreen("2");

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
    public static void setScreen(String input) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 3; j++) {
                segments[i][j] = " ";
            }
        }
        if (input.charAt(7) == '1') {
            if (input.charAt(0) == '1') {
                setSegmentA();
            }
            if (input.charAt(1) == '1') {
                setSegmentB();
            }
            if (input.charAt(2) == '1') {
                setSegmentC();
            }
            if (input.charAt(3) == '1') {
                setSegmentD();
            }
            if (input.charAt(4) == '1') {
                setSegmentE();
            }
            if (input.charAt(5) == '1') {
                setSegmentF();
            }
            if (input.charAt(6) == '1') {
                setSegmentG();
            }
        }
    }
    public  static void display(){
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(segments[i][j]+" ");
            }
            System.out.println();
        }
    }

}
