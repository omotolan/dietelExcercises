package TicTac;

import Assignment.TicTacToe.IPlayer;
import Assignment.TicTacToe.PlayerOne;
import Assignment.TicTacToe.PlayerTwo;

public class TicTacDriver {
    static TicTac ticTac = new TicTac();
    static PlayerOne playerOne = new PlayerOne();
    static PlayerTwo playerTwo = new PlayerTwo();
    static Symbols tt = Symbols.X;
    static Symbols bb = Symbols.O;
    static Tolani tolani = new Tolani(tt);
    static   Tolani bunmi = new Tolani(bb);


    public static void main(String[] args) {
        updateMove(tolani, 1);
        updateMove(bunmi, 2);

        printBoard();
    }

    public static void printBoard() {
        ticTac.printBoard();
    }

    public static Symbols[][] getBoard() {
        return ticTac.getBoard();
    }

    public static void updateMove(Tolani iPlayer, int move) {

        ticTac.updateBoard(iPlayer, move, getBoard());
    }
}
