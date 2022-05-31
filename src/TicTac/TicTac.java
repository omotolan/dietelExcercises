package TicTac;

import Assignment.TicTacToe.IPlayer;
import Assignment.TicTacToe.PlayerOne;
import Assignment.TicTacToe.PlayerTwo;

public class TicTac {

    Board board = new Board();

    PlayerOne playerOne = new PlayerOne();
    PlayerTwo playerTwo = new PlayerTwo();
    Symbols turn;// = Symbols.X;
   static Symbols tt = Symbols.X;
   static Symbols bb = Symbols.O;
    static Tolani tolani = new Tolani(tt);
  static   Tolani bunmi = new Tolani(bb);
   // Symbols oTurn;// = Symbols.O;

    public Symbols[][] getBoard(){
        return board.getBoard();
    }
    public void printBoard(){
        board.printBoard();
    }
    public void updateBoard(Tolani iPlayer, int move, Symbols[][] board){

        if (iPlayer == tolani ) {
            turn = bunmi.getSymbols();
        }
            else
                turn = tolani.getSymbols();

            switch (move) {
                case 1 -> board[0][0] = turn ;
                case 2 -> board[0][1] = turn;
                case 3 -> board[0][2] = turn;
                case 4 -> board[1][0] = turn;
                case 5 -> board[1][1] = turn;
                case 6 -> board[1][2] = turn;
                case 7 -> board[2][0] = turn;
                case 8 -> board[2][1] = turn;
                case 9 -> board[2][2] = turn;
            }
        }

//           else {
//              //  turn = Symbols.O;
//
//                switch (move) {
//                    case 1 -> board[0][0] = bunmi.getSymbols();
//                    case 2 -> board[0][1] =  bunmi.getSymbols();
//                    case 3 -> board[0][2] =  bunmi.getSymbols();
//                    case 4 -> board[1][0] =  bunmi.getSymbols();
//                    case 5 -> board[1][1] = turn;
//                    case 6 -> board[1][2] = turn;
//                    case 7 -> board[2][0] = turn;
//                    case 8 -> board[2][1] = turn;
//                    case 9 -> board[2][2] = turn;
//                }
           // }





    public static void main(String[] args) {
        TicTac ticTac = new TicTac();
        ticTac.getBoard();
        ticTac.updateBoard(tolani, 1, ticTac.getBoard());
        ticTac.updateBoard(bunmi, 4, ticTac.getBoard());
        ticTac.printBoard();
    }

}