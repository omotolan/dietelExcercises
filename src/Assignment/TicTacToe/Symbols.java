package Assignment.TicTacToe;

public enum Symbols {
    O('O'),
    X('X'),
    E(' ');

private char symbols;
    Symbols(char o) {
        symbols = o;
    }
    public char getSymbol(){
        return symbols;
    }
}
