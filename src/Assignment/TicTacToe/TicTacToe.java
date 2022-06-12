package Assignment.TicTacToe;


public class TicTacToe {
    private static final GameBoard gameBoard = new GameBoard();

    public void printBoard() {
        gameBoard.printBoard();
    }

    public Symbols[][] getBoard() {
        return gameBoard.getBoard();
    }

    public void updateMoves(int player, Symbols[][] gameBoard, int move) {

        Symbols symbol;
        if (player == 1) {
            symbol = Symbols.X;
        } else symbol = Symbols.O;
        if (!isValidMove(move, gameBoard)) {
            System.out.println("try again");

        } else {
            switch (move) {
                case 1 -> {
                    gameBoard[0][0] = symbol;
                    printBoard();
                }
                case 2 -> {
                    gameBoard[0][2] = symbol;
                    printBoard();
                }
                case 3 -> {
                    gameBoard[0][4] = symbol;
                    printBoard();
                }
                case 4 -> {
                    gameBoard[1][0] = symbol;
                    printBoard();
                }
                case 5 -> {
                    gameBoard[1][2] = symbol;
                    printBoard();
                }
                case 6 -> {
                    gameBoard[1][4] = symbol;
                    printBoard();
                }
                case 7 -> {
                    gameBoard[2][0] = symbol;
                    printBoard();
                }
                case 8 -> {
                    gameBoard[2][2] = symbol;
                    printBoard();
                }
                case 9 -> {
                    gameBoard[2][4] = symbol;
                    printBoard();
                }
                default -> {
                }
            }
        }

    }

    private boolean isValidMove(int move, Symbols[][] gameBoard) {
        switch (move) {
            case 1 -> {
                if (gameBoard[0][0] == Symbols.E) {
                    return true;
                }
            }
            case 2 -> {
                if (gameBoard[0][2] == Symbols.E) {
                    return true;
                }
            }
            case 3 -> {
                if (gameBoard[0][4] == Symbols.E) {
                    return true;
                }
            }
            case 4 -> {
                if (gameBoard[1][0] == Symbols.E) {
                    return true;
                }
            }
            case 5 -> {
                if (gameBoard[1][2] == Symbols.E) {
                    return true;
                }
            }
            case 6 -> {
                if (gameBoard[1][4] == Symbols.E) {
                    return true;
                }
            }
            case 7 -> {
                if (gameBoard[2][0] == Symbols.E) {
                    return true;
                }
            }
            case 8 -> {
                if (gameBoard[2][2] == Symbols.E) {
                    return true;
                }
            }
            case 9 -> {
                if (gameBoard[2][4] == Symbols.E) {
                    return true;
                }
            }
            default -> throw new IllegalStateException("Unexpected value: " + move);
        }
        return false;
    }


    public boolean isGameWon(Symbols[][] gameBoard) {
        //left to right
        if (gameBoard[0][0] == Symbols.X && gameBoard[0][1] == Symbols.X && gameBoard[0][2] == Symbols.X) {
            return true;
        } else if (gameBoard[1][0] == Symbols.X && gameBoard[1][1] == Symbols.X && gameBoard[1][2] == Symbols.X) {
            return true;
        } else if (gameBoard[2][0] == Symbols.X && gameBoard[2][1] == Symbols.X && gameBoard[2][2] == Symbols.X) {
            return true;
            // top to down
        } else if (gameBoard[0][0] == Symbols.X && gameBoard[1][0] == Symbols.X && gameBoard[2][0] == Symbols.X) {
            return true;
        } else if (gameBoard[0][1] == Symbols.X && gameBoard[1][1] == Symbols.X && gameBoard[2][1] == Symbols.X) {
            return true;
        } else if (gameBoard[0][2] == Symbols.X && gameBoard[1][2] == Symbols.X && gameBoard[2][2] == Symbols.X) {
            return true;
            //diagonal
        } else if (gameBoard[0][0] == Symbols.X && gameBoard[1][1] == Symbols.X && gameBoard[2][2] == Symbols.X) {
            return true;
        } else if (gameBoard[0][2] == Symbols.X && gameBoard[1][1] == Symbols.X && gameBoard[2][0] == Symbols.X) {
            return true;
            // left to right
        } else if (gameBoard[0][0] == Symbols.O && gameBoard[0][1] == Symbols.O && gameBoard[0][2] == Symbols.O) {
            return true;
        } else if (gameBoard[1][0] == Symbols.O && gameBoard[1][1] == Symbols.O && gameBoard[1][2] == Symbols.O) {
            return true;
        } else if (gameBoard[2][0] == Symbols.O && gameBoard[2][1] == Symbols.O && gameBoard[2][2] == Symbols.O) {
            return true;
            // top to bottom
        } else if (gameBoard[0][0] == Symbols.O && gameBoard[1][0] == Symbols.O && gameBoard[2][0] == Symbols.O) {
            return true;
        } else if (gameBoard[0][1] == Symbols.O && gameBoard[1][1] == Symbols.O && gameBoard[2][1] == Symbols.O) {
            return true;
        } else if (gameBoard[0][2] == Symbols.O && gameBoard[1][2] == Symbols.O && gameBoard[2][2] == Symbols.O) {
            return true;
            //diagonal
        } else if (gameBoard[0][0] == Symbols.O && gameBoard[1][1] == Symbols.O && gameBoard[2][2] == Symbols.O) {
            return true;
        } else if (gameBoard[0][2] == Symbols.O && gameBoard[1][1] == Symbols.O && gameBoard[2][0] == Symbols.O) {
            return true;
        }
        return false;
    }

    public boolean isTie(Symbols[][] gameBoard) {
        if (gameBoard[0][0] != Symbols.E && gameBoard[0][2] != Symbols.E && gameBoard[0][4] != Symbols.E
                && gameBoard[1][0] != Symbols.E && gameBoard[1][2] != Symbols.E && gameBoard[1][4] != Symbols.E
                && gameBoard[2][0] != Symbols.E && gameBoard[2][2] != Symbols.E && gameBoard[2][4] != Symbols.E) {
            System.out.println("tie");
            return true;
        }
        return false;
    }


}
