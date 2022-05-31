package TicTac;


public class Board {
    static Symbols symbols;
   static Symbols sy = Symbols.X;
    private static Symbols[][] board = {
            {Symbols.E, Symbols.E, Symbols.E},
            {Symbols.E, Symbols.E, Symbols.E},
            {Symbols.E, Symbols.E, Symbols.E}
    };

    public static void printBoard() {
       // System.out.println(sy);
        for (int i = 0; i < board.length; i++) {
            System.out.println();
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
        }
    }

    public Symbols[][] getBoard() {
        return board;
    }

    private static void updateBoard(int move, Symbols[][] board) {
if (!isValidMove(move,board)){
    System.out.println("invalid move, try again");
}
else
        switch (move) {
            case 1 -> board[0][0] = Symbols.X;
            case 2 -> board[0][1] = Symbols.X;
            case 3 -> board[0][2] = Symbols.X;
            case 4 -> board[1][0] = Symbols.X;
            case 5 -> board[1][1] = Symbols.X;
            case 6 -> board[1][2] = Symbols.X;
            case 7 -> board[2][0] = Symbols.X;
            case 8 -> board[2][1] = Symbols.X;
            case 9 -> board[2][2] = Symbols.X;
        }
    }
    private static boolean isValidMove(int move, Symbols[][] gameBoard) {
        return switch (move) {
            case 1 -> gameBoard[0][0] == Symbols.E;
            case 2 -> gameBoard[0][1] == Symbols.E;
            case 3 -> gameBoard[0][2] == Symbols.E;
            case 4 -> gameBoard[1][0] == Symbols.E;
            case 5 -> gameBoard[1][1] == Symbols.E;
            case 6 -> gameBoard[1][2] == Symbols.E;
            case 7 -> gameBoard[2][0] == Symbols.E;
            case 8 -> gameBoard[2][1] == Symbols.E;
            case 9 -> gameBoard[2][2] == Symbols.E;
            default -> false;
        };
    }
    public boolean isGameWon(Symbols[][] gameBoard) {
        if (gameBoard[0][0] == Symbols.X && gameBoard[0][2] == Symbols.X && gameBoard[0][4] == Symbols.X) {
            return true;
        } else if (gameBoard[1][0] == Symbols.X && gameBoard[1][2] == Symbols.X && gameBoard[1][4] == Symbols.X) {
            return true;
        } else if (gameBoard[2][0] == Symbols.X && gameBoard[2][2] == Symbols.X && gameBoard[2][4] == Symbols.X) {
            return true;
        } else if (gameBoard[0][0] ==Symbols.X && gameBoard[1][0] == Symbols.X && gameBoard[2][0] == Symbols.X) {
            return true;
        } else if (gameBoard[0][2] == Symbols.X && gameBoard[1][2] == Symbols.X && gameBoard[2][2] == Symbols.X) {
            return true;
        } else if (gameBoard[0][4] == Symbols.X && gameBoard[1][4] == Symbols.X && gameBoard[2][4] == Symbols.X) {
            return true;
        } else if (gameBoard[0][0] == Symbols.X && gameBoard[1][2] == Symbols.X && gameBoard[2][4] == Symbols.X) {
            return true;
        } else if (gameBoard[0][4] == Symbols.X && gameBoard[1][2] == Symbols.X && gameBoard[2][0] == Symbols.X) {
            return true;
        } else if (gameBoard[0][0] == Symbols.O && gameBoard[0][2] == Symbols.O && gameBoard[0][4] == Symbols.O) {
            return true;
        } else if (gameBoard[1][0] == Symbols.O && gameBoard[1][2] == Symbols.O && gameBoard[1][4] == Symbols.O) {
            return true;
        } else if (gameBoard[2][0] == Symbols.O && gameBoard[2][2] == Symbols.O && gameBoard[2][4] == Symbols.O) {
            return true;
        } else if (gameBoard[0][0] == Symbols.O && gameBoard[1][0] == Symbols.O && gameBoard[2][0] == Symbols.O) {
            return true;
        } else if (gameBoard[0][2] == Symbols.O && gameBoard[1][2] == Symbols.O && gameBoard[2][2] == Symbols.O) {
            return true;
        } else if (gameBoard[0][4] == Symbols.O && gameBoard[1][4] == Symbols.O && gameBoard[2][4] == Symbols.O) {
            return true;
        } else if (gameBoard[0][0] == Symbols.O && gameBoard[1][2] == Symbols.O && gameBoard[2][4] == Symbols.O) {
            return true;
        } else if (gameBoard[0][4] == Symbols.O && gameBoard[1][2] == Symbols.O && gameBoard[2][0] ==Symbols.O) {
            return true;
        }
        if (gameBoard[0][0] != Symbols.E && gameBoard[0][2] != Symbols.E && gameBoard[0][4] != Symbols.E
                && gameBoard[1][0] != Symbols.E && gameBoard[1][2] != Symbols.E && gameBoard[1][4] != Symbols.E
                && gameBoard[2][0] != Symbols.E && gameBoard[2][2] != Symbols.E && gameBoard[2][4] != Symbols.E) {
            System.out.println("tie");
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(sy);
        updateBoard(6, board);
        updateBoard(2, board);
        updateBoard(8, board);
        updateBoard(6, board);

      //  char n = symbols.getSymbols();
      //  System.out.println(n);
        printBoard();
    }
}
