package Assignment.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    private static GameBoard gameBoard = new GameBoard();
    private static PlayerOne playerOne = new PlayerOne();
    private static PlayerTwo playerTwo = new PlayerTwo();
    private  Symbols symbols = Symbols.X;
   static String name = Symbols.X.name();
   static char symbolX = name.charAt(0);
    static String name1 = Symbols.O.name();
    static char symbolO = name1.charAt(0);

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
       // System.out.println(symbolX);
//        int place = playerOne.move(4);
//        System.out.println(place);
//updateBoard(place);
//        updateBoard(playerOne, 4);
//        updateBoard(playerTwo, 4);
//        updateBoard(playerTwo, 8);
//        updateBoard(playerOne, 3);
        boolean gameOver = false;
        boolean result;
        while (!isWon()) {
            System.out.println("Enter  1-9");
            int move = input.nextInt();
            updateBoard(playerOne, move);
            gameOver = isWon();
            if (gameOver) {
                break;
            }
            //computerMove(gameBoard);
            System.out.println("Enter  1-9");
            int moves = input.nextInt();
            updateBoard(playerTwo, moves);
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

//printBoard();

//print();
//printBoard();
    }


    public static GameBoard getGameBoard() {

        return gameBoard;
    }
    public static void printBoard(){
        gameBoard.printGameBoard();
    }
    public static void updateBoard(IPlayer player, int move){
        char symbol = ' ';
        if (playerOne == player){
            symbol = symbolX;
        }
        else symbol = symbolO;
        if (!gameBoard.isValidMove(move)){
            System.out.println("try again");
        }
        else{
        gameBoard.updateBoard(playerOne.move(move), symbol );}
    }
    public static void player(IPlayer player, char symbol, int move){
        if (playerOne == player){
symbol = symbolX;
        }


    }
public static boolean isWon(){

        return gameBoard.isGameWon();
}
    public static void validateMove(int move){
        if (!gameBoard.isValidMove(move)){
            System.out.println("try again");
        }
      //  else

      //gameBoard.isValidMove(move);
    }
    public static void print(){
      //  updateBoard(4);
        printBoard();
    }
}
