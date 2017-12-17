package SameColorOnChessBoard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cell cell1 = new Cell();
        Cell cell2 = new Cell();

        System.out.println("Enter cells, first Letter, second Number. EXAMPLE A5");

        Scanner in = new Scanner(System.in);
        String firstCell = in.nextLine();
        if (firstCell.length() == 2) {
            cell1.setLet(firstCell.charAt(0));
            cell1.setNum(firstCell.charAt(1));
        } else
            System.out.println("You enter wrong cell 1.");


        String secondCell = in.nextLine();
        if (secondCell.length() == 2) {
            cell2.setLet(secondCell.charAt(0));
            cell2.setNum(secondCell.charAt(1));
        } else
            System.out.println("You enter wrong cell 2.");


        System.out.println(firstCell + " color is " + cell1.defineColor());
        System.out.println(secondCell + " color is " + cell2.defineColor());
        System.out.println(chessBoardCellColor(cell1, cell2));
    }

    private static String chessBoardCellColor (Cell cell1, Cell cell2) {
        if (cell1.defineColor().equals("White") && cell2.defineColor().equals("White"))
            return "True, they are White.";
        else if (cell1.defineColor().equals("Black") && cell2.defineColor().equals("Black"))
            return "True, they are Black";
        else if (cell1.defineColor().equals("White") && cell2.defineColor().equals("Black") ||
                 cell1.defineColor().equals("Black") && cell2.defineColor().equals("White"))
            return "False, they have different color.";
        else
            return "You enter wrong cell";
    }
}
