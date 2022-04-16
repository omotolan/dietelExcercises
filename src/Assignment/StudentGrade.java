package Assignment;

import java.util.Scanner;

public class StudentGrade {
    private static int totalGrade;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        String[] heading = {"Student", "    SUB1", "    SUB2", "    SUB3", "    TOT", " AVE", " POS"};
        System.out.println("enter number of students");
        int numberOfStudent = input.nextInt();
        System.out.println("enter number of subjects");
        int numberOfSubject = input.nextInt();
        int[][] studentData = new int[numberOfStudent][numberOfSubject];



        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println("serial number for student" + " " + (i + 1));
            for (int j = 0; j < numberOfSubject; j++) {
                System.out.println("Enter score of student");
                studentData[i][j] = input.nextInt();
//                for (int a = 0; a <numberOfSubject ; a++) {
//                    System.out.println(totalGrade);
//                    totalGrade = 0;
//                    totalGrade += studentData[i][j];
//                }
                for (int a = 0; a < numberOfSubject; a++) {

                    totalGrade = 0;
                    totalGrade = studentData[i][a] + totalGrade;
                }
            }

        }


        System.out.println("S/N");
//        for (int i = 0; i < heading.length; i++) {
//            System.out.print(heading[i]);
//        }
        System.out.println();
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.print(i + 1 + "    ");

            for (int j = 0; j < numberOfSubject; j++) {
                System.out.print(studentData[i][j] + "        ");
                //

            }
            System.out.println();

        }
//        for (int i = 0; i <numberOfStudent ; i++) {
//            System.out.println();
//
//
//        }
        System.out.println(totalGrade);
    }
}
