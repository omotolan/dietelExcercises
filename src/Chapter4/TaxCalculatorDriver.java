package Chapter4;

import java.util.Scanner;

public class TaxCalculatorDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TaxCalculator taxCalculator = new TaxCalculator();


        System.out.println("Enter your annual earning: ");
        double earning = input.nextDouble();

        taxCalculator.setEarnings(earning);
        System.out.println("your annual earning is: " + taxCalculator.getEarnings());
        System.out.println("Tax rate on your annual earning of: " + taxCalculator.getEarnings() + " is: " + taxCalculator.getTaxRate());
    }
}
