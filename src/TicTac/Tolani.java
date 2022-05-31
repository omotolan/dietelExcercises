package TicTac;

import Assignment.TicTacToe.IPlayer;

public class Tolani implements IPlayer {




    Symbols symbols;// = Symbols.X;
    public Tolani(Symbols symbols) {
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
