package Chapter6;

import java.time.YearMonth;
import java.util.Scanner;

public class LeapYear {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter year: ");
        int year = input.nextInt();

        yearType(year);


    }

    public static boolean isLeapYear(int year) {
        int month = 2;
        YearMonth yearOfTheMonth = YearMonth.of(year, month);
        int daysInMonth = yearOfTheMonth.lengthOfMonth();
        return daysInMonth > 28;
    }

    public static void yearType(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
