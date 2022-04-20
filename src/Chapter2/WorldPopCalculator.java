package Chapter2;

import java.util.Scanner;

public class WorldPopCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter world population digits: "); //2.34
        long population = input.nextLong();
        System.out.print("Enter number of years: " );
        int numberOfYears = input.nextInt();

        double growthRate = 2.53/100;
        int expectedPopulation1 = (int) (population * growthRate);
        int expectedPopulation2 = (int) (population * growthRate * numberOfYears);
        int expectedPopulation3 = (int) (population * growthRate *numberOfYears);
        int expectedPopulation4 = (int) (population * growthRate *numberOfYears);
        int expectedPopulation5 = (int) (population * growthRate *numberOfYears);

        if (numberOfYears == 1){
            System.out.printf("population growth rate for a year is: %d%n", expectedPopulation1);
        }
        if (numberOfYears == 2){
            System.out.printf("population growth rate for two years is: %d%n", expectedPopulation2);
        }
        if (numberOfYears == 3) {
            System.out.printf("population growth rate for three years is: %d%n", expectedPopulation3);
        }
        if (numberOfYears == 4){
            System.out.printf("population growth rate for four years is: %d%n", expectedPopulation4);
        }
        if (numberOfYears == 5){
            System.out.printf("population growth rate for five years is: %d%n", expectedPopulation5);
        }
    }
}
