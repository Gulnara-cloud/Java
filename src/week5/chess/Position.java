package week5.chess;

public class Position {
    private int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position(String input) {
        this.x = input.charAt(0) - 'A';
        this.y = input.charAt(1) - '0';
    }

    public int getX() {
         return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
         this.y = y;
    }
}
