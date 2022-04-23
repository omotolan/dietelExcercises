package Chapter4;

import java.util.Scanner;

public class SalesCommission {
    static Scanner keyboard = new Scanner(System.in);
    private final double COMMISSION = 0.09;
    private final double WAGE = 200.0;
    private int numberOfItem;
    private double price;

    public static void main(String[] args) {
        SalesCommission salesCommission = new SalesCommission();
        salesCommission.sentinelLoop();
        double result = salesCommission.takeHome();
        System.out.println(result);

    }

    public void setItemNumber(int numberOfItem) {
        this.numberOfItem = numberOfItem;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double sentinelLoop() {
        System.out.println("Enter -1 to end program or 0 to continue0");
        int userInput = keyboard.nextInt();

        while (userInput != -1) {

            promptUserForItemNumber();
            getNumberOfItem();
            promptUserForItemPrice();
            getPrice();
            calculateCommissionOnItem();
            System.out.println("which to continue?");
            userInput = keyboard.nextInt();

        }
        return calculateCommissionOnItem();
    }

    public void promptUserForItemNumber() {
        System.out.println("enter number of item : ");
        int itemNumber = keyboard.nextInt();
        this.numberOfItem = itemNumber;
    }

    public int getNumberOfItem() {
        return numberOfItem;
    }

    public void promptUserForItemPrice() {
        System.out.println("enter price of price : ");
        double itemPrice = keyboard.nextInt();
        this.price = itemPrice;
    }

    public double getPrice() {
        return price;
    }

    public double calculateCommissionOnItem() {
        int itemNumber = getNumberOfItem();
        double itemPrice = getPrice();
        double amount = (itemPrice * itemNumber) * COMMISSION;
        return amount;
    }

    public double takeHome() {
        double amount = sentinelLoop();
        double amountToTakeHome = amount + WAGE;
        return amountToTakeHome;
    }

}

