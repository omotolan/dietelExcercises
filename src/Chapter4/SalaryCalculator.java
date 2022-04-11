package Chapter4;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter hours worked: ");
        int workHours = keyboard.nextInt();

        System.out.println("Enter amount received per hours: ");
        int amount = keyboard.nextInt();

        int wage;
        int wage1 = 0;
            wage = 40 * amount;
             if(workHours > 40){
                int newWorkHours = workHours - 40;
                wage1 = newWorkHours * (amount / 2);
            }
        System.out.println();
        int wages = wage + wage1;
        System.out.println("your salary is: " + wages);

    }
}
