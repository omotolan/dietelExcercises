package Assignment.TicTac;

public class GameBoardChar {

    public char[][] getGameBoard() {
        return gameBoard;
    }

    public char[][] gameBoard = {
            {'_', '|', '_', '|', '_'},
            {'_', '|', '_', '|', '_'},
            {' ', '|', ' ', '|', ' '}
    };

    public void printGameBoard() {
        for (char[] chars : gameBoard) {
            for (char c : chars) {
                System.out.print(c);

            }
            System.out.println();
        }
    }


}
