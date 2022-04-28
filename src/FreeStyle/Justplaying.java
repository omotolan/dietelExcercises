package FreeStyle;

import java.util.Scanner;

public class Justplaying {
    static int month, day, year;

    //Scanner keyboard = new Scanner(System.in);
    public static void diplayMessage() {
        System.out.println("Please note that all information supplied is confidential");
        System.out.println("No personal details will be shared with any third party");
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
        //Justplaying display = new Justplaying();
        System.out.println("Please enter the year of your birth");
        diplayMessage();
// get year from user
        year = keyboard.nextInt();
// prompt for month of birth
        System.out.println("Please enter the month of your birth as a number from 1 to 12");
        diplayMessage();
// get month from user
        month = keyboard.nextInt();
// prompt for day of birth
        System.out.println("Please enter the day of your birth as a number from 1 to 31");
        diplayMessage();
// get day from user
        day = keyboard.nextInt();
    }
}
