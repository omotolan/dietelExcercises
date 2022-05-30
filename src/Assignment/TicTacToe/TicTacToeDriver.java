package Assignment.TicTacToe;

//import static Assignment.TicTacToe.TicTacToe.getGameBoard;


import java.util.Scanner;

import static Assignment.TicTacToe.TicTacToe.isWon;
import static Assignment.TicTacToe.TicTacToe.updateBoards;

public class TicTacToeDriver {
   static TicTacToe ticTacToe = new TicTacToe();
   //static IPlayer iPlayer;
   static PlayerOne playerOne = new PlayerOne();
   static PlayerTwo playerTwo = new PlayerTwo();
    Computer computer = new Computer();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
set();
//setttt();
extracted();
    }
    private static void extracted() {
        boolean gameOver = false;
        boolean result;
        while (!isWon()) {
            System.out.println("Enter  1-9");
            int move = input.nextInt();
            updateBoards(playerOne, move);
            gameOver = isWon();
            if (gameOver) {
                break;
            }
            //computerMove(gameBoard);
            System.out.println("Enter  1-9");
            move = input.nextInt();
            updateBoards(playerTwo, move);
            gameOver = isWon();
            if (gameOver) {
                break;
                //   if (userInput == 6){

                //  }
            }
            // playerMove(gameBoard);

        }
        result = isWon();
        if (result) {
            System.out.println("Game won");
        } else {
            System.out.println("game lost");
        }
    }
    private static void setttt() {
        ticTacToe.printt();
        boolean gameOver = false;
        boolean result;
        while (!isGameWon()) {
            System.out.println("Enter  1-9");
            int move = input.nextInt();
            updateMove(playerOne, move);
            gameOver = isGameWon();
            if (gameOver) {
                break;
            }
            System.out.println("Enter  1-9");
            move = input.nextInt();
           updateMove(playerTwo, move);
            gameOver =isGameWon();
            if (gameOver) {
                break;
            }
        }
        result =    isGameWon();
        if (result) {
            System.out.println("Game won");
        } else {
            System.out.println("game lost");
        }
    }
    private static void set() {
        ticTacToe.printt();
        boolean gameOver = false;
        boolean result;
        while (!isGameWon()) {
            System.out.println("Enter  1-9");
            int move = input.nextInt();
           updateMove(playerOne, move);
            gameOver = isGameWon();
            if (gameOver) {
                break;
            }
            System.out.println("Enter  1-9");
            move = input.nextInt();
            updateMove(playerTwo, move);
            gameOver = isGameWon();
            if (gameOver) {
                break;
            }

        }
        result = isWon();
        if (result) {
            System.out.println("Game won");
        } else {
            System.out.println("game lost");
        }
    }
    public static void updateMove(IPlayer iPlayer,int move){
       ticTacToe.updateMove(iPlayer,move);
    }
    private static char[][] getGameBoard(){
        return ticTacToe.getGameBoard();
    }
public static boolean isGameWon(){
       return ticTacToe.isGameWon(getGameBoard());
}
//public static boolean isMoveValid(){
//        return ticTacToe.
//}
}
