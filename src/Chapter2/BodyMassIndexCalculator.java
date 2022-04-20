package Chapter2;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in kilograms: ");
        double weight = input.nextDouble();
        System.out.println("Enter height in meters: ");
        double height = input.nextDouble();

        double BMI = weight / (height * height);

        System.out.println("BMI is: " + BMI);
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 0r greater");
    }
}
