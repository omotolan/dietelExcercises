package Assignment.TicTacToe;

public enum Symbols {
    O('O'),
    X('X'),
    E(' ');

    private final char symbols;

    Symbols(char symbols) {
        this.symbols = symbols;
    }

    public char getSymbols() {
        return symbols;
    }
}
