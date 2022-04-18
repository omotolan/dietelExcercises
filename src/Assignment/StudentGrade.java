package Assignment;

import java.util.Scanner;

public class StudentGrade {
    private static int sum;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("enter number of students");
        int numberOfStudent = input.nextInt();
        System.out.println("enter number of subjects");
        int numberOfSubject = input.nextInt();
        int[][] studentData = new int[numberOfStudent][numberOfSubject];
        int[][] total = new int[numberOfStudent][numberOfSubject];
        double[][] average = new double[numberOfStudent][numberOfSubject];


        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println("serial number for student" + " " + (i + 1));
            for (int j = 0; j < numberOfSubject; j++) {
                System.out.println("Enter score of student");
                studentData[i][j] = input.nextInt();
                }
            }

        System.out.println();
        for (int i = 0; i < numberOfStudent; i++) {
            sum = 0;
            for (int j = 0; j < numberOfSubject; j++) {

                sum +=studentData[i][j];
                total[i][0] = sum;
                average[i][0] = (double) total[i][0] / numberOfSubject;
            }
        }
        //method call
        equals();
        System.out.println();
        System.out.print("s/n" + "\t");
        for (int i = 0; i < numberOfSubject; i++) {
            System.out.print("Sub"+ (i+1) + "\t" );

        }
        System.out.print("tot"+ "\t\t");
        System.out.print("avg"+ "\t\t");
        System.out.println();
        // method call
        equals();
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.print(i + 1 + "\t");

            for (int j = 0; j < numberOfSubject; j++) {
                System.out.print(studentData[i][j] + " \t\t");
            }
            for (int j = 0; j < 1; j++) {

                System.out.print(total[i][j] + "\t\t");

            }
            for (int j = 0; j < 1; j++) {

                System.out.println(average[i][j] + "\t");

            }
           System.out.println();
        }
        equals();



        // subject summary
        System.out.println("subject 1");
        int highest = 0;
        for (int i = 0; i < numberOfStudent; i++) {
            for (int j = 0; j <= 0; j++) {
               // highest = 0;
                highest = studentData[i][j];
                if (highest < studentData[i][j]){
                    studentData[i][j] = highest;
                }


            }


        }
        System.out.println();
        System.out.println(highest);

    }
    private static void equals(){
        //loop for equal signs
        for (int i = 0; i <60 ; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}
