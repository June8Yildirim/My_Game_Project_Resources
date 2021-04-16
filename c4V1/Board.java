package c4V1;

public class Board {
    private final int  rows = 6;
    private final int columns = 7;
    Piece[][] ourBoard = new Piece[rows][columns];

    public Board() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                ourBoard[row][col] = null;
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }


    public boolean checkForWinner(int col, String winningColor) {
        boolean someoneWon = false;
// check downwards
        for (int row = 0; row < rows; row++) {
            if (ourBoard[row][col] != null) {
                int winningStreak = 3;
                for (int winRow = row + 1; winRow < rows; winRow++) {
                    if (ourBoard[winRow][col].getColor().equals(winningColor)) {
                        winningStreak--;
                        if (winningStreak == 0) {
                            someoneWon = true;
                        }
                    } else {
                        winningStreak = 4;
                    }
                }

                winningStreak = 4;
                //horizontal
                for (int winCol = col - 3; winCol < col + 3; winCol++) {
                    if (winCol < 0) continue;
                    if (winCol >= columns) break;
                    if (ourBoard[row][winCol] != null && ourBoard[row][winCol].getColor() == winningColor) {
                        winningStreak--;
                        if (winningStreak == 0) {
                            someoneWon = true;
                        }
                    } else {
                        winningStreak = 4;
                    }
                }
                break;
            }
        }
        return someoneWon;
    }

    public boolean addPiece(int colToAdd, String color) {
        if (colToAdd >= 0 && colToAdd < rows) {
            if (ourBoard[0][colToAdd] == null) {
                boolean addedThePeice = false;
                for (int row = rows - 1; row >= 0; row--) {
                    if (ourBoard[row][colToAdd] == null) {
                        ourBoard[row][colToAdd] = new Piece();
                        ourBoard[row][colToAdd].setColor(color);
                        addedThePeice = true;
                        break;
                    }
                }
                return addedThePeice;
            } else {
                System.out.println("This column is full, please choose another,");
                return false;
            }
        } else {
            System.out.println("You are trying to add somewhere thata is not supported");
            return false;
        }
    }

    public void printBoard() {
        for (int col = 0; col < columns; col++) {
            System.out.print("-");
        }
        for (int row = 0; row < rows; row++) {
            System.out.println("|");
            for (int col = 0; col < columns; col++) {
                if (ourBoard[rows][col] == null) {
                    System.out.print("_");
                } else {
                    System.out.print(ourBoard[row][col].getColor());
                }
                System.out.println("|");
            }
            System.out.println();
        }
    }
}
