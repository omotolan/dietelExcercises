package Chapter3;

import java.util.Scanner;

public class HealthProfileTest {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        HealthProfile user = new HealthProfile(" ", " ", 0, 0, 0000, " ", 0.0, 0.0);

        // prompt user first name
        System.out.println("Enter your first name: ");
        String firstName = keyboard.next();
        user.setFirstName(firstName);

        System.out.println();

        // prompt user last name
        System.out.println("Enter your last name: ");
        String lastName = keyboard.next();
        user.setFirstName(lastName);

        System.out.println();

        // prompt for user for gender
        System.out.println("What is your gender? ");
        String gender = keyboard.next();
        user.setGender(gender);

        System.out.println();

        //prompt user for weight in pounds
        System.out.println("Enter your weight in pounds: ");
        double weight = keyboard.nextDouble();
        user.setWeightInPounds(weight);

        System.out.println();

        //prompt user for height in inches
        System.out.println("enter your height in inches: ");
        double height = keyboard.nextDouble();
        user.setHeightInInches(height);

        System.out.println();

        // prompt year of birth
        System.out.println("Enter year of birth: ");
        int birthYear = keyboard.nextInt();
        user.setYears(birthYear);

        System.out.println();

        // prompt for month
        System.out.println("Enter month of birth: ");
        int birthMonth = keyboard.nextInt();
        user.setMonth(birthMonth);

        System.out.println();

        // prompt for day
        System.out.println("Enter day of birth: ");
        int birthDay = keyboard.nextInt();
        user.setDay(birthDay);

        System.out.println();

        // user health profile
        System.out.println("--- USER HEALTH PROFILE ---");
        System.out.println("user fullname: " + user.getFullName());
        System.out.println("user date of birth: " + user.birthDetails());
        System.out.println("user age is: " + user.getAge(birthYear) + " years old");
        System.out.println("user gender: " + user.getGender());
        System.out.println("user weight in pounds is: " + user.getWeightInPounds());
        System.out.println("user height in inches is: " + user.getHeightInInches());
        System.out.println("user maximum heart rate is: " + user.maximumHeartRate());
        System.out.println("user target heart rate is: " + user.getTargetHeartRate() + "%");
        System.out.println("user body max index is: " + user.getBodyMaxIndex());
        System.out.println(user.currentYear);
    }
}
