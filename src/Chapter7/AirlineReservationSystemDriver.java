package Chapter7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AirlineReservationSystemDriver {
    static AirLineReservationSystem air = new AirLineReservationSystem();
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        edoAirways();


    }


    private static void edoAirways() {
        welcomeMessage();
        while (!air.isFull()) {
            choice();
        }
        allSeatsBookedResponse();
    }


    private static void welcomeMessage() {
        System.out.println("Welcome to Edo Airways.");
    }

    private static void prompt() {
        System.out.println("""
                Press 1 for First class seat
                Press 2 for economy class
                """);
    }

    private static void choice() {
        prompt();
        try {

            int choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    air.setFirstClass();
                    firstClassSeatNumber();
                }
                case 2 -> {
                    air.setEconomy();
                    economyClassSeatNumber();
                }
                default -> {
                    System.out.println("Invalid selection, Try again");
                    prompt();
                    choice();
                }

            }
        } catch (InputMismatchException inputMismatchException) {
            System.err.println("Input mismatch. Try again.");
            input.nextLine();
            System.out.println("Enter an integer");
        }
    }

    private static void firstClassSeatNumber() {
        if (air.getFirstClassSeats() < 6) {
            System.out.println("Thank you for choosing First Class");
            System.out.println("you have been allotted seat number " + air.getFirstClassSeats());
            System.out.println("Enjoy your flight");
        }
        if (air.getFirstClassSeats() == 5 && air.getEconomySeats() != 10) {
            promptForFirstClass();

        }

    }

    private static void economyClassSeatNumber() {
        if (air.getEconomySeats() < 11) {
            System.out.println("Thank you for choosing Economy Class");
            System.out.println("you have been allotted seat number " + air.getEconomySeats());
            System.out.println("Enjoy your flight");
        }
        if (air.getEconomySeats() == 10 && air.getFirstClassSeats() != 5) {
            promptForEconomyClass();
        }
    }

    private static void promptForFirstClass() {

        System.out.println("Sorry! our first class seats are all booked");
        System.out.println("We have economy class available");
        System.out.println("would you like to book that?");
        responseForEconomyClass();


    }

    private static void promptForEconomyClass() {
        if (air.getEconomySeats() == 10 && air.getFirstClassSeats() < 6) {
            System.out.println("Sorry! our economy class seats are all booked");
            System.out.println("We have first class available");
            System.out.println("would you like to book that?");
            responseForFirstClass();
        }
    }

    private static void responseForFirstClass() {
        try {

            System.out.println("Press 1 yes to proceed and 2 to cancel: ");
            int response = input.nextInt();
            if (response == 1) {
                air.setFirstClass();
            } else {
                nextFlightSchedule();

            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Input mismatch. Try again!!!");
            input.nextLine();
            System.out.println("Press 1 yes to proceed and 2 to cancel: ");

        }

    }

    private static void responseForEconomyClass() {
        try {
            System.out.println("Press 1 yes to proceed and 2 to cancel: ");
            int response = input.nextInt();
            if (response == 1) {
                air.setEconomy();
            } else {
                nextFlightSchedule();

            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Input mismatch. Try again!!!");
            input.nextLine();
            System.out.println("Press 1 yes to proceed and 2 to cancel: ");

        }
    }

    private static void nextFlightSchedule() {
        System.out.println("Our next flight is scheduled for 3pm later today, Thank you.");
        System.exit(-1);
    }

    private static void allSeatsBookedResponse() {
        System.out.println("All seats for this morning's flight scheduled for Oshodi has all been booked");
        nextFlightSchedule();
    }
}
