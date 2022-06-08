package Chapter6;

import java.util.Random;
import java.util.Scanner;

public class CoinToss {
    static Random random = new Random();
    private static int headCount;
    private static int tailCount;
    private static CoinSides coinSides;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        while (choice != -1) {
            System.out.println("Enter a number to toss and -1 to quit");
            choice = input.nextInt();
            tossCoin();
        }
        results();

    }

    public static void tossCoin() {
        int sides = random.nextInt(2);
        switch (sides) {
            case 0 -> {
                coinSides = CoinSides.HEAD;
                headCount++;
            }
            case 1 -> {
                coinSides = CoinSides.TAIL;
                tailCount++;
            }
        }
    }

    public static void results() {
        System.out.println("head occurred: " + headCount + " times.");
        System.out.println("tail occurred: " + tailCount + " times.");
    }

    private enum CoinSides {
        HEAD, TAIL
    }
}
