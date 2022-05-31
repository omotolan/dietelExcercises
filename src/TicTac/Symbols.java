package TicTac;

public enum Symbols {
    X('X'),

    O('O'),
    E(' ');
    private final char symbols;

    Symbols(char x) {
        symbols = x;
    }

    public char getSymbols() {
        return symbols;
    }
}
