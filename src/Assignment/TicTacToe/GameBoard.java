package Assignment.TicTacToe;

public class GameBoard {
   // Symbols symbols = Symbols.X;
   private  Symbols symbols = Symbols.E;
    static String name = Symbols.X.name();
    static char symbolE = name.charAt(0);

    public char[][] getGameBoard() {
        return gameBoard;
    }

    private     char[][] gameBoard = {
                {'_', '|', '_', '|', '_'},
                {'_', '|', '_', '|', '_'},
                {' ', '|', ' ', '|', ' '}
        };
    public void printGameBoard(){
        for (char[] chars : gameBoard) {
            for (char c : chars) {
                System.out.print(c);

            }
            System.out.println();
        }
    }
    public void updateBoard(int move, char symbol){

       // char symbol = ' ';
       // if (symbolX == symbol) {
         //symbol = symbolX;
      //  } else symbol = 'O';

        switch (move) {
            case 1 -> {
                gameBoard[0][0] = symbol;
                printGameBoard();
            }
            case 2 -> {
                gameBoard[0][2] = symbol;
                printGameBoard();
            }
            // printBoard(gameBoard);
            case 3 -> {
                gameBoard[0][4] = symbol;
                printGameBoard();
            }
            // printBoard(gameBoard);
            case 4 -> {
                gameBoard[1][0] = symbol;
                printGameBoard();
            }
            //printBoard(gameBoard);
            case 5 -> {
                gameBoard[1][2] = symbol;
                printGameBoard();
            }
            // printBoard(gameBoard);
            case 6 -> {
                gameBoard[1][4] = symbol;
                printGameBoard();
            }
            // printBoard(gameBoard);
            case 7 -> {
                gameBoard[2][0] = symbol;
                printGameBoard();
            }
            //printBoard(gameBoard);
            case 8 -> {
                gameBoard[2][2] = symbol;
                printGameBoard();
            }
            // printBoard(gameBoard);
            case 9 -> {
                gameBoard[2][4] = symbol;
                printGameBoard();
            }
            // printBoard(gameBoard);
            default -> {
            }
        }
    }
    public  boolean isValidMove(int move) {
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
    public boolean isGameWon() {
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
            return false;
        }
        return false;
    }


}
