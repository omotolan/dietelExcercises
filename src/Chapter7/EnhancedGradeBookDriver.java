package Chapter7;

import java.util.Scanner;

public class EnhancedGradeBookDriver {
    static Scanner input = new Scanner(System.in);
    static int[][] gradeBook = new int[2][3];
    static EnhancedGradeBook enhancedGradeBook = new EnhancedGradeBook();

    public static void main(String[] args) {
        // System.out.println("enter score: ");
        // sey(input.nextInt());

        setInput();

      //  setGrade();
        enhancedGradeBook.displayGradeBook();
    }

    public static void setGrade() {
        for (int i = 0; i < gradeBook.length; i++) {
            for (int j = 0; j < gradeBook[i].length; j++) {
                System.out.println("Enter student " + (i + 1) + " grade for subject " + (j + 1) + ": ");
                int grade = input.nextInt();
                if (grade > 0 && grade <= 100) {
                    gradeBook[i][j] = grade;
                }

            }
        }
    }
    public static void setInput(){
        System.out.println("enter number of student: ");
        int numberOfStudents = input.nextInt();
        System.out.println("enter number of subject: ");
        int numberOfSubjects = input.nextInt();
        enhancedGradeBook.setNumberOfStudents(numberOfStudents);
        enhancedGradeBook.setNumberOfSubjects(numberOfSubjects);
    }

    public static void sey(int score) {
        for (int i = 0; i < gradeBook.length; i++) {
            for (int j = 0; j < gradeBook[i].length; j++) {
                gradeBook[i][j] = score;
            }

        }
    }
}
