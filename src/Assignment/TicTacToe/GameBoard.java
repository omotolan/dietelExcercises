package Assignment.TicTacToe;

public class GameBoard {
    private final Symbols[][] board = {
            {Symbols.E, Symbols.E, Symbols.E},
            {Symbols.E, Symbols.E, Symbols.E},
            {Symbols.E, Symbols.E, Symbols.E}
    };

    public void printBoard() {
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


}
