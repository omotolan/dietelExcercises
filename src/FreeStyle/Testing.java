package FreeStyle;

import java.util.Arrays;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of studemts: ");
        int studentsNumber = input.nextInt();
        System.out.println("enter subjects: ");
        int studentSubject = input.nextInt();
        // int[] score = {2, 3, 7, 8};
        int[] grade = new int[studentSubject];
        int[] students = new int[studentsNumber];

        for (int n = 0; n < students.length; n++) {
            //System.out.println(" enter nuber of student: ");
            // students[n] = input.nextInt();
            System.out.println(n);


            for (int i = 0; i < studentSubject; i++) {
                System.out.print("enter score: ");
                grade[i] = input.nextInt();

            }
        }
        int total = 0;
        for (int j = 0; j < students.length; j++) {
            System.out.println();


            for (int i = 0; i < grade.length; i++) {
                //System.out.print(student[i] + " ");
                // total = 0;
                //2 total = 0;
                total += grade[i];


            }
        }
        System.out.println(total);


//        int total = 0;
//        for (int i = 0; i < score.length; i++) {
//            total +=score[i];
//
//        }
//        System.out.println(total);
    }
}
