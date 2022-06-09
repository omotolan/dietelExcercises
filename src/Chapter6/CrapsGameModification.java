package Chapter6;

import java.util.Random;
import java.util.Scanner;

public class CrapsGameModification {
    private static final int seven = 7;
    private static final int eleven = 11;
    private static final int two = 2;
    private static final int three = 3;
    private static final int twelve = 12;
    private static int point;
    private static int sum;
    private static int balance = 1000;
    private static Status gameStatus;
    private static int wager;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        playCraps();

    }

    private static void playCraps() {
        prompt();
        playGame();
        yourBalanceIsRemaining();
        continuePlaying();

    }

    private static void continuePlaying() {
        int continuePlaying = 0;
        while (continuePlaying != 2) {
            yourBalanceIsRemaining();
            System.out.println("Do you wish to play more?");
            System.out.println("press 1 to continue and 2 to quit: ");
            continuePlaying = input.nextInt();
            switch (continuePlaying) {
                case 1 -> playGame();
                case 2 -> {
                    System.out.println("thank you for playing");
                    yourBalanceIsRemaining();
                }
                default -> {
                    System.out.println("invalid selection");
                    continuePlaying();
                }
            }

            message();
        }
    }

    private static void yourBalanceIsRemaining() {
        System.out.println("your balance is: " + getBalance());
        System.out.println();
    }

    private static void message() {
        if (balance <= 200) {
            System.out.println("it's a bad for you, you should consider calling it quit.");
        }
        if (balance == 0) {
            System.out.println("you are out of cash, game over");
            System.exit(-1);
        }
        if (balance > 1500) {
            System.out.println("you are having a great day, congratulations.");
        }
    }

    private static void prompt() {
        System.out.println("Welcome to Adonimawobe casino");
        System.out.println("You have a balance of : " + getBalance());
        setWager();
    }

    private static void playGame() {
        dieRoll();
        System.out.println("Roll result: " + sum);
        pointChecker();
        calculateBalance();
        displayStatus();

    }

    private static void setWager() {
        System.out.println("How much do you wish to wage per game: ");
        int wager = input.nextInt();
        if (wager > 0) {
            CrapsGameModification.wager = wager;
        } else {
            System.out.println("invalid amount. try again!!!");
            prompt();
        }

    }

    private static void calculateBalance() {
        if (gameStatus == Status.WON) {
            balance += wager;
        } else {
            balance -= wager;
        }
    }

    private static int getBalance() {
        return balance;
    }


    private enum Status {
        WON, LOSE, POINT
    }

    private static void dieRoll() {
        Random dice = new Random();
        int firstThrow = 1 + dice.nextInt(6);
        int secondThrow = 1 + dice.nextInt(6);
        sum = firstThrow + secondThrow;

    }

    private static void result() {
        switch (sum) {
            case seven, eleven -> gameStatus = Status.WON;
            case two, three, twelve -> gameStatus = Status.LOSE;
            default -> {
                gameStatus = Status.POINT;
                point = sum;
                System.out.println("Game status: " + gameStatus);
            }
        }
    }

    private static void pointChecker() {
        result();
        while (gameStatus == Status.POINT) {
            dieRoll();
            System.out.println("Roll result: " + sum);

            if (sum == point) {
                gameStatus = Status.WON;

            } else {
                gameStatus = Status.LOSE;

            }
        }
    }

    private static void displayStatus() {
        if (gameStatus == Status.WON) {
            System.out.println("you win");
        } else {
            System.out.println("you lose");
        }
    }
}
