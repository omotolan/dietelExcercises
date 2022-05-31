package Assignment.TicTacToe;


import java.util.Random;
import java.util.Scanner;

public class XAndO {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        char[][] gameBoard = {
                {'_', '|', '_', '|', '_'},
                {'_', '|', '_', '|', '_'},
                {' ', '|', ' ', '|', ' '}
        };
       // int userInput = input.nextInt();

        printBoard(gameBoard);
        boolean gameOver = false;
        boolean result;
        while (!gameOver) {
            playerMove(gameBoard);
            gameOver = isGameWon(gameBoard);
            if (gameOver) {
                break;
            }
            //computerMove(gameBoard);
            secondPlayerMove(gameBoard);
            gameOver = isGameWon(gameBoard);
            if (gameOver) {
                break;

            }


        }
        result = isGameWon(gameBoard);
        if (result) {
            System.out.println("Game won");
        } else {
            System.out.println("game lost");
        }
        //  System.out.println(result);
    }

    private static void printBoard(char[][] gameBoard) {
        for (char[] chars : gameBoard) {
            for (char c : chars) {
                System.out.print(c);

            }
            System.out.println();
        }
    }

    private static void computerMove(char[][] gameBoard) {

        Random random = new Random();
        int move = random.nextInt(9) + 1;
        boolean isValid = isValidMove(move, gameBoard);
        while (!isValid) {

            move = input.nextInt(9) + 1;
            isValid = isValidMove(move, gameBoard);

        }
        updateMoves(move, 2, gameBoard);

    }

    private static void playerMove(char[][] gameBoard) {

        System.out.println("Enter options, (1-9)");
        int move = input.nextInt();
        boolean isValid = isValidMove(move, gameBoard);

        while (!isValid) {
            System.out.println("Try Again");
            move = input.nextInt();
            isValid = isValidMove(move, gameBoard);
        }
        updateMoves(move, 1, gameBoard);
       // input.next();
    }
    private static void secondPlayerMove(char[][] gameBoard) {

        System.out.println("Enter options, (1-9)");
        int move = input.nextInt();
        boolean isValid = isValidMove(move, gameBoard);

        while (!isValid) {
            System.out.println("Try Again");
            move = input.nextInt();
            isValid = isValidMove(move, gameBoard);
        }
        updateMoves(move, 2, gameBoard);
       // input.next();
    }


    private static void updateMoves(int move, int player, char[][] gameBoard) {
        char symbol = ' ';
        if (player == 1) {
            symbol = 'X';
        } else symbol = 'O';

        switch (move) {
            case 1 -> {
                gameBoard[0][0] = symbol;
                printBoard(gameBoard);
            }
            case 2 -> {
                gameBoard[0][2] = symbol;
                printBoard(gameBoard);
            }
            case 3 -> {
                gameBoard[0][4] = symbol;
                printBoard(gameBoard);
            }
            case 4 -> {
                gameBoard[1][0] = symbol;
                printBoard(gameBoard);
            }
            case 5 -> {
                gameBoard[1][2] = symbol;
                printBoard(gameBoard);
            }
            case 6 -> {
                gameBoard[1][4] = symbol;
                printBoard(gameBoard);
            }
            case 7 -> {
                gameBoard[2][0] = symbol;
                printBoard(gameBoard);
            }
            case 8 -> {
                gameBoard[2][2] = symbol;
                printBoard(gameBoard);
            }
            case 9 -> {
                gameBoard[2][4] = symbol;
                printBoard(gameBoard);
            }
            default -> {
                System.out.println("invalid selection");
            }
        }
    }

    private static boolean isValidMove(int move, char[][] gameBoard) {
        return switch (move) {
            case 1 -> gameBoard[0][0] == '_';
            case 2 -> gameBoard[0][2] == '_';
            case 3 -> gameBoard[0][4] == '_';
            case 4 -> gameBoard[1][0] == '_';
            case 5 -> gameBoard[1][2] == '_';
            case 6 -> gameBoard[1][4] == '_';
            case 7 -> gameBoard[2][0] == ' ';
            case 8 -> gameBoard[2][2] == ' ';
            case 9 -> gameBoard[2][4] == ' ';
            default -> false;
        };
    }

    private static boolean isGameWon(char[][] gameBoard) {
        if (gameBoard[0][0] == 'X' && gameBoard[0][2] == 'X' && gameBoard[0][4] == 'X') {
            // System.out.println("game won");
            return true;
        } else if (gameBoard[1][0] == 'X' && gameBoard[1][2] == 'X' && gameBoard[1][4] == 'X') {
            //  System.out.println("game won");
            return true;
        } else if (gameBoard[2][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[2][4] == 'X') {
            // System.out.println("game won");
            return true;
        } else if (gameBoard[0][0] == 'X' && gameBoard[1][0] == 'X' && gameBoard[2][0] == 'X') {
            System.out.println("game won");
            return true;
        } else if (gameBoard[0][2] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][2] == 'X') {
            // System.out.println("game won");
            return true;
        } else if (gameBoard[0][4] == 'X' && gameBoard[1][4] == 'X' && gameBoard[2][4] == 'X') {
            //  System.out.println("game won");
            return true;
        } else if (gameBoard[0][0] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][4] == 'X') {
            // System.out.println("game won");
            return true;
        } else if (gameBoard[0][4] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][0] == 'X') {
            //  System.out.println("game won");
            return true;
        } else if (gameBoard[0][0] == 'O' && gameBoard[0][2] == 'O' && gameBoard[0][4] == 'O') {
            //   System.out.println("game won");
            return true;
        } else if (gameBoard[1][0] == 'O' && gameBoard[1][2] == 'O' && gameBoard[1][4] == 'O') {
            //  System.out.println("game won");
            return true;
        } else if (gameBoard[2][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[2][4] == 'O') {
            //  System.out.println("game won");
            return true;
        } else if (gameBoard[0][0] == 'O' && gameBoard[1][0] == 'O' && gameBoard[2][0] == 'O') {
            //  System.out.println("game won");
            return true;
        } else if (gameBoard[0][2] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][2] == 'O') {
            // System.out.println("game won");
            return true;
        } else if (gameBoard[0][4] == 'O' && gameBoard[1][4] == 'O' && gameBoard[2][4] == 'O') {
            //  System.out.println("game won");
            return true;
        } else if (gameBoard[0][0] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][4] == 'O') {
            //  System.out.println("game won");
            return true;
        } else if (gameBoard[0][4] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][0] == 'O') {
            //  System.out.println("game won");
            return true;
        } if (gameBoard[0][0] != '_' && gameBoard[0][2] != '_' && gameBoard[0][4] != '_'
                && gameBoard[1][0] != '_' && gameBoard[1][2] != '_' && gameBoard[1][4] != '_'
                && gameBoard[2][0] != ' ' && gameBoard[2][2] != ' ' && gameBoard[2][4] != ' ') {
            System.out.println("tie");
           // return false;
        }
        return false;
    }

}
