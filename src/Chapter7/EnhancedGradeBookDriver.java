package Chapter7;

import java.util.Scanner;

public class EnhancedGradeBookDriver {
    static Scanner input = new Scanner(System.in);
    static int[][] gradeBook = new int[0][];
    public static void main(String[] args) {


    }
    public static void setGrade(){
        for (int i = 0; i < gradeBook.length; i++) {
            for (int j = 0; j < gradeBook[i].length; j++) {
                System.out.println("Enter student grade for student " + (i+1) +": ");
                gradeBook[i][j] = input.nextInt();

            }
        }
    }
}
