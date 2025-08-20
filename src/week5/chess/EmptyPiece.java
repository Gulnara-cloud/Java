package week5.chess;

public class EmptyPiece extends Piece {

    @Override
    public boolean canMove(int nx, int ny) {
        return false;
    }

    @Override
    public String name() {
        return " ";
    }

    @Override
    public boolean canBeat(int nx, int ny) {
        return false;
    }

    @Override
    public String getPieceName() {
        return "";
    }
}
