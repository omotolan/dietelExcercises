package Chapter5;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char grade = ' ';
        int studentA = 0;
        int studentB = 0;
        int studentC = 0;
        int studentD = 0;


        int counter = 0;
        while (counter < 5) {
            System.out.println("Enter student number: ");
            grade = input.next().charAt(0);
            switch (grade) {
                case 'A' -> studentA++;
                case 'B' -> studentB++;
                case 'C' -> studentC++;
                case 'D' -> studentD++;
                default -> System.out.println("does not apply");

            }
            counter++;
        }
        System.out.println(studentA + " scored A");
        System.out.println(studentB + " scored B");
        System.out.println(studentC + " scored C");
        System.out.println(studentD + " scored D");

    }
}
