package SameColorOnChessBoard;

public class Cell {
    private char let;
    private char num;

    public Cell() {
    }

    public Cell(char let, char num) {
        this.let = let;
        this.num = num;
    }

    public char getLet() {
        return let;
    }

    public void setLet(char let) {
        this.let = let;
    }

    public char getNum() {
        return num;
    }

    public void setNum(char num) {
        this.num = num;
    }

    String defineColor() {
        if((this.let == 'A' || this.let == 'C' || this.let == 'E' || this.let == 'G') &&
                (this.num == '1' || this.num == '3' || this.num == '5' || this.num == '7') ||
                (this.let == 'B' || this.let == 'D' || this.let == 'F' || this.let == 'H') &&
                        (this.num == '2' || this.num == '4' || this.num == '6' || this.num == '8'))
        return "Black";
        else
            if ((this.let == 'A' || this.let == 'C' || this.let == 'E' || this.let == 'G') &&
                    (this.num == '2' || this.num == '4' || this.num == '6' || this.num == '8') ||
                    (this.let == 'B' || this.let == 'D' || this.let == 'F' || this.let == 'H') &&
                            (this.num == '1' || this.num == '3' || this.num == '5' || this.num == '7'))
                return "White";
        else
            return "You enter wrong cell";
    }

    @Override
    public String toString() {
        return "Cell{" +
                "let=" + let +
                ", num=" + num +
                '}';
    }
}
