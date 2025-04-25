package week4.chess;

public class Main {
    public static void main(String[] args) {
        Piece p1 = new Knight(2, 1, "white");
        Piece p2 = new Pawn(3, 3,"black");

        p1.beat(p2.getX(), p2.getY());
        System.out.println(p1);
    }
}
