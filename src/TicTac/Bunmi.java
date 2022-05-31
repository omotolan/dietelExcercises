package TicTac;

import Assignment.TicTacToe.IPlayer;

public class Bunmi implements IPlayer {
    Symbols symbols;// = Symbols.X;
    public Bunmi(Symbols symbols) {
        this.symbols = symbols;
    }
    public Symbols getSymbols() {
        return symbols;
    }
    @Override
    public int move(int move) {
        return move;
    }
}
