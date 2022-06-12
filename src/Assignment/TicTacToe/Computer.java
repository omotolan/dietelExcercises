package Assignment.TicTacToe;

import java.util.Random;

public class Computer implements IPlayer {
    @Override
    public int move(int move) {
        Random random = new Random();
        return move;// random.nextInt(9) + 1;

    }
}
