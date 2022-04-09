package FreeStyle;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter<10) {
            System.out.print("Enter grade: ");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter++;
            System.out.println(gradeCounter);

        }


        int average = total / 10;

        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.println(average);
    }
}