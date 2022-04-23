package Chapter6;

import java.util.Scanner;

public class ParkingCharges {
    static Scanner input = new Scanner(System.in);
    private static final double CHARGE_FOR_3_HOURS = 2.00;
    private static final double CHARGE_FOR_3_HOURS_ABOVE = 0.50;

    public static void main(String[] args) {
        System.out.println("Hours spent: ");
        int number0fHoursSpent = input.nextInt();
        double price = calculateChargesFor3HoursBelow(number0fHoursSpent);
        System.out.println(price);

    }

    public static double calculateChargesFor3HoursBelow(int hours) {

        double charge = 0.00;
        if (hours <= 3) {
            charge = hours * CHARGE_FOR_3_HOURS;

        } else {
            charge += calculateInExcessOf3Hours(hours);
        }
        return charge;
    }

    public static double calculateInExcessOf3Hours(int hours) {
        double charge = 0.00;
        double newCharge = 0.00;
        int newHours = 0;
        if (hours > 3 /*&& hours < 24*/) {
            charge = 3 * CHARGE_FOR_3_HOURS;
            newHours = hours - 3;
            newCharge = newHours * CHARGE_FOR_3_HOURS_ABOVE;
            charge += newCharge;
        }
        return charge;
    }
}
