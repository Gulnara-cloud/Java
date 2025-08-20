package week5.chess;

import java.util.HashMap;
import java.util.Map;

public class Game {
    private BoardCell[][] board;
    private Map<Piece, Integer> piecesCount;

    Game() {
        this.board = new BoardCell[8][8];
        this.piecesCount = new HashMap<>();

        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                this.board[i][j] = new BoardCell(null);
            }
        }

        for (int j = 0; j < 8; ++j) {
            Piece black = new Pawn(1, j, "black");
            Piece white = new Pawn(6, j, "white");
            this.board[1][j].setPiece(black);
            this.board[6][j].setPiece(white);

            piecesCount.put(black, piecesCount.getOrDefault(black, 0) + 1);
            piecesCount.put(white, piecesCount.getOrDefault(white, 0) + 1);
        }
    }

    BoardCell getCell(int x, int y) {
        return board[x][y];
    }

    private void moveCell(BoardCell from, BoardCell to) {
        from.getPiece().move(to.getPiece().getX(), to.getPiece().getY());
        to.setPiece(from.getPiece());
        from.setPiece(null);
    }

    /*
     * makeMove - makes a move, moves the piece from (x1, y1) to (x2, y2).
     * All coordinates must be 0 based.
     */
    public void makeMove(int x1, int y1, int x2, int y2) {
        BoardCell from = getCell(x1, y1);
        BoardCell to = getCell(x2, y2);
        if (from.isEmpty()) {
            return;
        }
        if (to.isEmpty()) {
            if (!from.getPiece().canMove(x2, y2)) {
                return;
            }
            this.moveCell(from, to);
        } else {
            if (!from.getPiece().canBeat(x2, y2)) {
                return;
            }
            this.moveCell(from, to);
        }
    }

    void printBoard() {
        System.out.print('\t');
        String line = "----";
        for (char c = 65; c <= 72; ++c) {
            System.out.print("|" + c + "" + '\t');
            line += "----";
        }
        System.out.println();
        System.out.println(line);
        for (int i = 0; i < 8; ++i) {
            System.out.print((i + 1) + "" + '\t');
            for (int j = 0; j < 8; ++j) {
                System.out.print("|" + board[i][j].boardString() + '\t');
            }
            System.out.println();
            System.out.println(line);
        }
        System.out.println();
        for (Piece piece : this.piecesCount.keySet()) {
            System.out.println(this.piecesCount.get(piece) + " " + piece.color + " " + piece.getPieceName());
        }
    }

    public Position convertStringToPosition(String input) throws IllegalPositionException {
        if (input.length() != 2) {
            throw new IllegalPositionException(input);
        }
        if ('A' > input.charAt(0) || input.charAt(0) > 'H' || '1' > input.charAt(1) || input.charAt(1) > '8') {
            throw new IllegalPositionException(input);
        }
        return new Position(input);
    }

    public void validateMoves(String from, String to) throws IllegalMoveException {
        try {
            Position fromPosition = convertStringToPosition(from);
            Position toPosition = convertStringToPosition(to);
        } catch (IllegalPositionException e) {
            throw new IllegalMoveException(from, to, e);
        }
    }
}




