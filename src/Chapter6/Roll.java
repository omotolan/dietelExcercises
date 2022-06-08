package Chapter6;

import Assignment.DieRoll;

import java.util.Random;

public class Roll {
    private static final int seven = 7;
    private static final int eleven = 11;
    private static final int two = 2;
    private static final int three = 3;
    private static final int twelve = 12;
    private static int point;
    private static int sum;
    static Status gameStatus;
    private static int balance = 1000;

    public static void main(String[] args) {

        dieRoll();
        System.out.println("Roll result: " + sum);




determine();
continueIfPoints();
calculateBalance();

        System.out.println(balance);
      //  winOrLose();



    }
    private static void calculateBalance(){
        int wager = 100;
        if (gameStatus ==Status.WON) {
            balance += wager;
          //  System.out.println("you win");

        } else {
            balance -= wager;
         //   System.out.println("you lose");
        }
    }
    private static void determine(){
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
    private static void winOrLose(){
        if (gameStatus ==Status.WON) {
            System.out.println("you win");
        } else {
            System.out.println("you lose");
        }
    }
    private static void continueIfPoints(){
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

    private enum Status {
        WON, LOSE, POINT
    }

    private static void dieRoll() {
        Random dice = new Random();
        int firstThrow = 1 + dice.nextInt(6);
        int secondThrow = 1 + dice.nextInt(6);
        sum = firstThrow + secondThrow;

    }
}
