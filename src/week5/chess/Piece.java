package week5.chess;

import java.util.Objects;

public abstract class Piece {
    protected int x, y;
    protected String color;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract boolean canMove(int nx, int ny);

    public abstract String name();

    public void move(int nx, int ny) {
        if (canMove(nx, ny)) {
            this.x = nx;
            this.y = ny;
        }
    }

    public abstract boolean canBeat(int nx, int ny);

    public abstract String getPieceName();

    public void beat(int nx, int ny) {
        if (canBeat(nx, ny)) {
            this.x = nx;
            this.y = ny;
        }
    }

    @Override
    public String toString() {
        return "x = " + this.x + "; " + "y= " + this.y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Piece piece = (Piece) o;
        return Objects.equals(getPieceName(), piece.getPieceName()) && Objects.equals(color, piece.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPieceName(), color);
    }
}

