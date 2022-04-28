package Chapter3;

import java.util.Scanner;

public class TargetHeartRateCalculatorTest {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        TargetHeartRateCalculator user = new TargetHeartRateCalculator(" ", " ", 0, 0, 0000);

        // prompt user first name
        System.out.println("Enter your first name: ");
        String firstName = keyboard.next();
        user.setFirstName(firstName);
        System.out.println(user.getFirstName());

        System.out.println();

        // prompt user first name
        System.out.println("Enter your last name: ");
        String lastName = keyboard.next();
        user.setFirstName(lastName);
        System.out.println(user.getLastName());

        System.out.println();

        // prompt year of birth
//        user.getYears();
//        System.out.println("year of birth is " + user.getYears());
        System.out.println("Enter year of birth: ");
        int birthYear = keyboard.nextInt();
        user.setYears(birthYear);
        System.out.println(user.getYears());

        System.out.println();

        // prompt for month
        System.out.println("Enter month of birth: ");
        int birthMonth = keyboard.nextInt();
        user.setMonth(birthMonth);
        System.out.println(user.getMonth());

        System.out.println();

        // prompt for day
        System.out.println("Enter day of birth: ");
        int birthDay = keyboard.nextInt();
        user.setDay(birthDay);
        System.out.println(user.getDay());

        System.out.println();

        // calculate age
        System.out.println("you are " + user.getAge(birthYear) + " years old.");
        // date of birth
        System.out.println("your date of birth is " + user.birthDetails());
        System.out.println(user.currentYear);

        System.out.println();

        // target heart rate calculator
        System.out.println("maximum heart rate is " + user.maximumHeartRate());
        System.out.println();
        System.out.println("your target heart rate is " + user.getTargetHeartRate() + "%");
    }
}
