package week5.chess;

public class BoardCell {
    private Piece piece;

    public BoardCell() {
        this.piece = null;
    }

    public BoardCell(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    @Override
    public String toString() {
        return "BoardCell{" +
                "piece=" + piece +
                '}';
    }

    public String boardString() {
        if (getPiece() == null) {
            return " ";
        }
        return getPiece().name();
    }

    public boolean isEmpty() {
        return getPiece() == null;
    }
}
