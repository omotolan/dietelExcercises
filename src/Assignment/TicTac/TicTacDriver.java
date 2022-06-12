package Assignment.TicTac;

import java.util.Scanner;


public class TicTacDriver {

    static TicTac ticTac = new TicTac();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        set();
    }

    private static void set() {

        ticTac.print();
        boolean won = isGameWon();
        boolean tie = isTie();
        while (!won && !tie) {
            System.out.println("Enter move player 1: ");
            int move = input.nextInt();
            updateMove(1, move);
            won = isGameWon();
            if (won) {
                break;
            }
            System.out.println("Enter move player 2: ");
            move = input.nextInt();
            updateMove(2, move);
            won = isGameWon();
            if (won) {
                break;
            }

        }
        if (isGameWon()) {
            System.out.println("you win");
        }
        if (isTie()) {
            System.out.println("it is a tie");
        }
    }

    public static void updateMove(int num, int move) {
        ticTac.updateMoves(num, getGameBoard(), move);
    }

    private static char[][] getGameBoard() {
        return ticTac.getGameBoard();
    }

    public static boolean isGameWon() {
        return ticTac.isGameWon(getGameBoard());
    }

    private static boolean isTie() {
        return ticTac.isTie(getGameBoard());
    }
}
