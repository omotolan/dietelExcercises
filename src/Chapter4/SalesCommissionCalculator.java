package Chapter4;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final double  item1Price = 239.99;
        final double  item2Price = 129.75;
        final double  item3Price = 99.95;
        final double  item4Price = 350.89;
        final int wage = 200;

        for(int i =0; i != -1; i++) {
            System.out.println("enter number of item 1: ");
            int item1Quantity = keyboard.nextInt();


            System.out.println("enter number of item 2: ");
            int item2Quantity = keyboard.nextInt();

            System.out.println("enter number of item 3: ");
            int item3Quantity = keyboard.nextInt();

            System.out.println("enter number of item 4: ");
            int item4Quantity = keyboard.nextInt();

            int counter = 0;
            double item1Sales = 0;
            while (item1Quantity != -1) {
                item1Sales += item1Price * item1Quantity;
                counter++;
                System.out.println("enter number of item 1: ");
                item1Quantity = keyboard.nextInt();
            }
            System.out.println(item1Sales);

            double item2Sales = 0;
            while (item2Quantity != -1) {
                item2Sales += item2Price * item2Quantity;
                counter++;
                System.out.println("enter number of item 2: ");
                item2Quantity = keyboard.nextInt();
            }
            System.out.println(item2Sales);

            double item3Sales = 0;
            while (item3Quantity != -1) {
                item3Sales += item3Price * item3Quantity;
                counter++;
                System.out.println("enter number of item 3: ");
                item3Quantity = keyboard.nextInt();
            }
            System.out.println(item3Sales);

            double item4Sales = 0;
            while (item4Quantity != -1) {
                item4Sales += item4Price * item4Quantity;
                counter++;
                System.out.println("enter number of item 4: ");
                item4Quantity = keyboard.nextInt();
            }
            System.out.println(item4Sales);


            double totalItemBonus = ((item1Sales + item2Sales + item3Sales + item4Sales) * 9) / 100;
            double earning = wage + totalItemBonus;

            System.out.println("sales person total earning is: " + earning);
            System.out.println(counter);
        }
    }
}
