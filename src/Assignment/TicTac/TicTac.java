package Assignment.TicTac;

public class TicTac {
    private static GameBoardChar gameBoardChar = new GameBoardChar();

    public void print() {
        gameBoardChar.printGameBoard();

    }

    public char[][] getGameBoard() {

        return gameBoardChar.getGameBoard();
    }

    private boolean isValidMove(int move, char[][] gameBoard) {
        switch (move) {
            case 1 -> {
                if (gameBoard[0][0] == '_') {
                    return true;
                }
            }
            case 2 -> {
                if (gameBoard[0][2] == '_') {
                    return true;
                }
            }
            case 3 -> {
                if (gameBoard[0][4] == '_') {
                    return true;
                }
            }
            case 4 -> {
                if (gameBoard[1][0] == '_') {
                    return true;
                }
            }
            case 5 -> {
                if (gameBoard[1][2] == '_') {
                    return true;
                }
            }
            case 6 -> {
                if (gameBoard[1][4] == '_') {
                    return true;
                }
            }
            case 7 -> {
                if (gameBoard[2][0] == ' ') {
                    return true;
                }
            }
            case 8 -> {
                if (gameBoard[2][2] == ' ') {
                    return true;
                }
            }
            case 9 -> {
                if (gameBoard[2][4] == ' ') {
                    return true;
                }
            }
        }
        return false;
    }


    public boolean isGameWon(char[][] gameBoard) {
        if (gameBoard[0][0] == 'X' && gameBoard[0][2] == 'X' && gameBoard[0][4] == 'X') {
            return true;
        } else if (gameBoard[1][0] == 'X' && gameBoard[1][2] == 'X' && gameBoard[1][4] == 'X') {
            return true;
        } else if (gameBoard[2][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[2][4] == 'X') {
            return true;
            // top to down
        } else if (gameBoard[0][0] == 'X' && gameBoard[1][0] == 'X' && gameBoard[2][0] == 'X') {
            return true;
        } else if (gameBoard[0][2] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][2] == 'X') {
            return true;
        } else if (gameBoard[0][4] == 'X' && gameBoard[1][4] == 'X' && gameBoard[2][4] == 'X') {
            return true;
            //diagonal
        } else if (gameBoard[0][0] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][4] == 'X') {
            return true;
        } else if (gameBoard[0][4] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][0] == 'X') {
            return true;
        } else if (gameBoard[0][0] == 'O' && gameBoard[0][2] == 'O' && gameBoard[0][4] == 'O') {
            return true;
        } else if (gameBoard[1][0] == 'O' && gameBoard[1][2] == 'O' && gameBoard[1][4] == 'O') {
            return true;
        } else if (gameBoard[2][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[2][4] == 'O') {
            return true;
        } else if (gameBoard[0][0] == 'O' && gameBoard[1][0] == 'O' && gameBoard[2][0] == 'O') {
            return true;
        } else if (gameBoard[0][2] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][2] == 'O') {
            return true;
        } else if (gameBoard[0][4] == 'O' && gameBoard[1][4] == 'O' && gameBoard[2][4] == 'O') {
            return true;
        } else if (gameBoard[0][0] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][4] == 'O') {
            return true;
        } else if (gameBoard[0][4] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][0] == 'O') {
            return true;
        }
        return false;
    }

    public boolean isTie(char[][] gameBoard) {
        if (gameBoard[0][0] != '_' && gameBoard[0][2] != '_' && gameBoard[0][4] != '_'
                && gameBoard[1][0] != '_' && gameBoard[1][2] != '_' && gameBoard[1][4] != '_'
                && gameBoard[2][0] != ' ' && gameBoard[2][2] != ' ' && gameBoard[2][4] != ' ') {
            System.out.println("tie");
            return true;
        }
        return false;
    }


    public void updateMoves(int player, char[][] gameBoards, int move) {

        char symbol = ' ';
        if (player == 1) {
            symbol = 'X';
        } else symbol = 'O';
        if (!isValidMove(move, gameBoards)) {
            System.out.println("try again");

        } else {
            switch (move) {
                case 1 -> {
                    gameBoards[0][0] = symbol;
                    print();
                }
                case 2 -> {
                    gameBoards[0][2] = symbol;
                    print();
                }
                case 3 -> {
                    gameBoards[0][4] = symbol;
                    print();
                }
                case 4 -> {
                    gameBoards[1][0] = symbol;
                    print();
                }
                case 5 -> {
                    gameBoards[1][2] = symbol;
                    print();
                }
                case 6 -> {
                    gameBoards[1][4] = symbol;
                    print();
                }
                case 7 -> {
                    gameBoards[2][0] = symbol;
                    print();
                }
                case 8 -> {
                    gameBoards[2][2] = symbol;
                    print();
                }
                case 9 -> {
                    gameBoards[2][4] = symbol;
                    print();
                }
                default -> {
                }
            }
        }

    }
}
