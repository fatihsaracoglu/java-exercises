import java.io.IOException;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

        printBoard(board);

        int player = 0;

        while (!isFull(board)) {
            System.out.print("Player " + (player + 1) + " enter row number:");
            int row = reader.nextInt();
            System.out.print("Player " + (player + 1) + " enter column number:");
            int col = reader.nextInt();
            if (row <= 3 && col <= 3 && board[row - 1][col - 1] == ' ') {
                board[row - 1][col - 1] = player == 0 ? 'X' : 'O';
                printBoard(board);
                if (checkBoard(board, row-1, col-1) == true) {
                    System.out.println("Player" + (player + 1) + " won!");
                    break;
                }
                player = (player + 1) % 2;

            } else {
                System.out.println("Enter a valid coordinate!");
            }
        }

        reader.close();
    }

    public static boolean isFull(char[][] board) {
        boolean isFull = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    isFull = false;
                    return isFull;
                }
            }
        }
        return isFull;
    }

    public static boolean checkBoard(char[][] board, int lastRow, int lastCol) {
        char c = board[lastRow][lastCol];

        // rows
        boolean win = true;
        for (int i = 0; i < 3; i++) {
            if (board[lastRow][i] != c) {
                win = false;
                break;
            }
        }

        if (win)
            return true;

        // columns
        win = true;
        for (int i = 0; i < 3; i++) {
            if (board[i][lastCol] != c) {
                win = false;
                break;
            }

        }

        if (win)
            return true;

        // diagonal (left top to right bottom)
        win = true;
        if(lastRow == lastCol) {
            for(int i = 0; i < 3; i++) {
                if (board[i][i] != c) {
                    win = false;
                    break;
                }
            }

            if (win)
                return true;
        }

        // diagonal (right top to left bottom)
        win = true;
        if(lastRow + lastCol == 2) {
            for(int row= 0; row < 3; row++) {
                if (board[row][2-row] != c) {
                    win = false;
                    break;
                }
            }

            if(win) {
                return true;
            }
        }

        return false;
    }

    public static void printBoard(char[][] board) {
        System.out.println("    1   2   3");
        System.out.println("   -----------");
        for (int row = 0; row < 3; ++row) {
            System.out.print(row + 1 + " ");
            for (int col = 0; col < 3; ++col) {
                System.out.print("|");
                System.out.print(" " + board[row][col] + " ");
                if (col == 2)
                    System.out.print("|");

            }
            System.out.println();
            System.out.println("   -----------");

        }

    }

}
