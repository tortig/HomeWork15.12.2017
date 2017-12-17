package Minesweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter vertical size (2<=Y<=5) ");
        int Y = in.nextInt();    // vertical size

        System.out.print("Enter horizontal size (2<=X<=5) ");
        int X = in.nextInt();    // horizontal size

        System.out.print("Enter bomb count : ");
        int bombCount = in.nextInt();  // bomb count

        System.out.println();

        if ((bombCount > X * Y) || (X < 2 || X > 5) || (Y < 2 || Y > 5))   // wrong enters
            System.out.println("Please enter less bombs, or right X and Y");

        boolean[][] gameBoard = gameBoardCreator(Y, X, bombCount);  // create game board

        gameBoardPrinter(gameBoard);        // print game board

        int[][] result = cellNeighborBombsCounter(gameBoard);  // create result board

        resultBoardPrinter(result);     // print result board
    }

    //-----------------------Game Board Creator----------------------------------

    private static boolean[][] gameBoardCreator(int Y, int X, int bombCount) {
        boolean[][] gameBoard = new boolean[Y][X];
        int x ;  // x coordinate for random bomb
        int y ;  // y coordinate for random bomb

        for (int i = 0; i < Y - 1; i++) {     // initializing of empty gameBoard
            for (int j = 0; j < X - 1; j++)
                gameBoard[i][j] = false;
        }

        for (int i = 0; i < bombCount; i++) {  // adding bombs in random cell(x, y)
            x = (int) (Math.random() * X);
            y = (int) (Math.random() * Y);

            if (!gameBoard[y][x])           // if cell(y, x) is empty add bomb
                gameBoard[y][x] = true;
            else                            // if cell(y, x) is not empty, try again
                i--;
        }
        return gameBoard;
    }

    //--------------------------- Cell Neighbor Bombs Counter------------------------------

    private static int[][] cellNeighborBombsCounter(boolean[][] gameBoard) {
        int Y = gameBoard.length;
        int X = gameBoard[0].length;
        int[][] result = new int[Y][X];

        for (int i = 0; i < Y; i++) {       // for all cells in gameBoard
            for (int j = 0; j < X; j++) {

                int counter = 0;
                for (int inY = i - 1; inY <= i + 1; inY++) {    // for neighbor cells
                    for (int inX = j - 1; inX <= j + 1; inX++) {

                        if (inX < 0 || inY < 0 || inX >= X || inY >= Y || (inX == j && inY == i)) {
                            continue;                           // if neighbor cell out of boarder
                        } else if (gameBoard[inY][inX]) // bomb in neighbor cell
                            counter++;
                    }
                }

                result[i][j] = counter;
            }
        }
        return result;
    }

    //--------------------------------Game Board Printer--------------------------
    private static void gameBoardPrinter (boolean[][] gameBoard) {
        for (boolean[] line : gameBoard) {   // printing game board
            System.out.print("[ ");
            for (boolean cell : line) {
                if (cell == true)
                    System.out.print(cell + "  ");
                else
                    System.out.print(cell + " ");
            }
            System.out.println("]");
        }
        System.out.println();
    }

    //------------------------------Result Board Printer-------------------------
    private static void resultBoardPrinter (int[][] result) {
        for (int[] line : result) {     // printing result board
            System.out.print("[ ");
            for (int cell : line)
                System.out.print(cell + " ");
            System.out.println("]");
        }
    }
}
