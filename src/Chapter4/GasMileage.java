package Chapter4;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter miles covered per trip");
        int miles = keyboard.nextInt();

        System.out.println("Enter gallons used in each trip(full tank)");
        int gallons = keyboard.nextInt();

        double milesPerGallon;


        System.out.println("Enter number of trips or -1 to quit");
        int trip = keyboard.nextInt();

        int counter = 0;
        int totalTrips = 0;
        while (trip != -1) {
            totalTrips += trip;

            System.out.println("Enter number of trips or -1 to quit");
            trip = keyboard.nextInt();
            counter++;


        }
        milesPerGallon = (double) miles / gallons;
        milesPerGallon += totalTrips * milesPerGallon;
        gallons = gallons * totalTrips;
        miles = miles * totalTrips;

        System.out.println("total number of trip is " + totalTrips);
        System.out.println("miles travelled per gallon is " + milesPerGallon);
        System.out.println("quantity of gallons used is " + gallons);
        System.out.println("total miles covered is " + miles);
        System.out.println(counter);
    }
}
