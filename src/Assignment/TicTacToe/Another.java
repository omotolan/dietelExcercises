package Assignment.TicTacToe;

import java.util.Scanner;

public class Another {
    private static GameBoard gameBoard = new GameBoard();
    private static PlayerOne playerOne = new PlayerOne();
    private static PlayerTwo playerTwo = new PlayerTwo();
    private static Computer computer = new Computer();
  //  private Symbols symbols = Symbols.X;
    static String symbolForX = Symbols.X.name();
    static char symbolX = symbolForX.charAt(0);
    static String symbolForO = Symbols.O.name();
    static char symbolO = symbolForO.charAt(0);

    public static void main(String[] args) {
        Another another = new Another();
        another.set();
    }
    static Scanner input = new Scanner(System.in);
    public void print() {
        gameBoard.printGameBoard();

    }

    private void set() {
        print();
        boolean gameOver = false;
        boolean result;
        while (!isGameWon(getGameBoard())) {
            System.out.println("Enter  1-9");
            int move = input.nextInt();
            updateMoves(playerOne, getGameBoard(), move);
            gameOver = isGameWon(getGameBoard());
            if (gameOver) {
                break;
            }
            System.out.println("Enter  1-9");
            move = input.nextInt();
            updateMoves(playerTwo, getGameBoard(), move);
            gameOver = isGameWon(getGameBoard());
            if (gameOver) {
                break;
            }
        }
        result = isGameWon(getGameBoard());
        if (result) {
            System.out.println("Game won");
        } else {
            System.out.println("game lost");
        }
    }
    public char[][] getGameBoard() {

        return gameBoard.getGameBoard();
    }


    private boolean isValidMove(int move, char[][] gameBoard) {
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

    public boolean isGameWon(char[][] gameBoard) {
        if (gameBoard[0][0] == 'X' && gameBoard[0][2] == 'X' && gameBoard[0][4] == 'X') {
            return true;
        } else if (gameBoard[1][0] == 'X' && gameBoard[1][2] == 'X' && gameBoard[1][4] == 'X') {
            return true;
        } else if (gameBoard[2][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[2][4] == 'X') {
            return true;
        } else if (gameBoard[0][0] == 'X' && gameBoard[1][0] == 'X' && gameBoard[2][0] == 'X') {
            return true;
        } else if (gameBoard[0][2] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][2] == 'X') {
            return true;
        } else if (gameBoard[0][4] == 'X' && gameBoard[1][4] == 'X' && gameBoard[2][4] == 'X') {
            return true;
        } else if (gameBoard[0][0] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][4] == 'X') {
            return true;
        } else if (gameBoard[0][4] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][0] == 'X') {
            return true;
        } else if (gameBoard[0][0] == 'O' && gameBoard[0][2] == 'O' && gameBoard[0][4] == 'O') {
            return true;
        } else if (gameBoard[1][0] == 'O' && gameBoard[1][2] == 'O' && gameBoard[1][4] == 'O') {
            return true;
        } else if (gameBoard[2][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[2][4] == 'O') {
            return true;
        } else if (gameBoard[0][0] == 'O' && gameBoard[1][0] == 'O' && gameBoard[2][0] == 'O') {
            return true;
        } else if (gameBoard[0][2] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][2] == 'O') {
            return true;
        } else if (gameBoard[0][4] == 'O' && gameBoard[1][4] == 'O' && gameBoard[2][4] == 'O') {
            return true;
        } else if (gameBoard[0][0] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][4] == 'O') {
            return true;
        } else if (gameBoard[0][4] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][0] == 'O') {
            return true;
        }
        if (gameBoard[0][0] != '_' && gameBoard[0][2] != '_' && gameBoard[0][4] != '_'
                && gameBoard[1][0] != '_' && gameBoard[1][2] != '_' && gameBoard[1][4] != '_'
                && gameBoard[2][0] != ' ' && gameBoard[2][2] != ' ' && gameBoard[2][4] != ' ') {
            System.out.println("tie");
            return false;
        }
        return false;
    }

public char symbol(IPlayer iPlayer){
    char symbol = 0;
    if (iPlayer.equals(playerOne)) {
        symbol = symbolX;
    }
    if (iPlayer.equals(playerTwo)) {
        symbol = symbolO;
    }
    return symbol;
}
    public void updateMoves(IPlayer iPlayer, char[][] gameBoards, int move) {

      char symbol = symbol(iPlayer);
        if (!isValidMove(move, gameBoards)) {
            System.out.println("try again");
        } else
            switch (move) {
                case 1 -> {
                    gameBoards[0][0] = symbol;
                    System.out.println(symbol);
                    print();
                }
                case 2 -> {
                    gameBoards[0][2] = symbol;
                    System.out.println(symbol);
                    print();
                }
                case 3 -> {
                    gameBoards[0][4] = symbol;
                    print();
                }
                case 4 -> {
                    gameBoards[1][0] = symbol;
                    print();
                }
                case 5 -> {
                    gameBoards[1][2] = symbol;
                    print();
                }
                case 6 -> {
                    gameBoards[1][4] = symbol;
                    print();
                }
                case 7 -> {
                    gameBoards[2][0] = symbol;
                    print();
                }
                case 8 -> {
                    gameBoards[2][2] = symbol;
                    print();
                }
                case 9 -> {
                    gameBoards[2][4] = symbol;
                    print();
                }
                default -> {
                }
            }

    }
}
