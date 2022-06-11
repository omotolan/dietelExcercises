package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class AirlineReservationSystem {
    private static boolean[] seats = new boolean[10];


    private static int firstClassSeat;
    private static int economyClassSeat = 5;

    private static int select;

    static Scanner input = new Scanner(System.in);
    private static boolean quit;

    public static void main(String[] args) {

        option();
        System.out.println(Arrays.toString(seats));
        System.out.println(firstClassSeat);
        System.out.println(economyClassSeat);

    }


    public static void setFirstClassSeat() {
        if (firstClassSeat >= 0 && firstClassSeat < 6) {
            seats[firstClassSeat] = true;
referToEconomy();
            firstClassSeat++;
        }
    }
    public static void referToEconomy(){
        if (firstClassSeat == 5) {
            System.out.println("We are sorry to inform you our first class seats are completely booked");
            System.out.println("But we do have economy available. Would you like to book economy?");
            System.out.println("Type yes to proceed and no to cancel: ");
            String answer = input.nextLine();
            input.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("enter 2 to book economy");
            select = input.nextInt();
            setEconomyClassSeat();
            } else {
                System.exit(7);
                System.out.println("Thank you for choosing Edo Airways!!!");
            }
        }
//        if (firstClassSeat == 5){
//            System.out.println("we only have economy class available");
//            System.out.println("enter 2 to book economy");
//            select = input.nextInt();
//        }
    }


    public static void setEconomyClassSeat() {

        if (economyClassSeat < 11) {
            seats[economyClassSeat] = true;
            economyClassSeat++;

            if (economyClassSeat == 10) {
                System.out.println("economy class full");
                System.out.println("We are sorry to inform you our economy class seats are completely booked");
                System.out.println("But we do have first class seats available. Would you like to book economy?");
                System.out.println("Type yes to book first class and no to cancel: ");
                String answer = input.nextLine();
                if (answer.equalsIgnoreCase("yes")) {
                    setFirstClassSeat();
                } else {
                    System.exit(7);
                    System.out.println("Thank you for choosing Edo Airways!!!");
                }
            }

        }

    }

    public static void option() {
        for (int i = 0; i < 10; i++) {

            System.out.println("enter option: ");
            select = input.nextInt();
            input.nextLine();
            switch (select) {
                case 1 -> {setFirstClassSeat();
                    System.out.println("You've been allotted seat number " + firstClassSeat);
                }
                case 2 -> {setEconomyClassSeat();System.out.println("You've been allotted seat number " + economyClassSeat);}
                case 3 -> quit = true;
            }
        }
    }

}


