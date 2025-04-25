package week4.chess;

public class Knight extends Piece {
    public Knight(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public boolean canMove(int nx, int ny) {
        int []dx = new int[]{1, 2, -1, -2, 1, 2, -1, -2}; //..
        int []dy = new int[]{2, 1, 2, 1, -2, -1, -2, -1}; //..

        for (int i = 0; i < dx.length; ++i) {
            int newPotentialX = x + dx[i];
            int newPotentialY = y + dy[i];
            if (newPotentialX == nx && newPotentialY == ny) {
                return true;
            }
        }
        return false;
    }

    public boolean canBeat(int nx, int ny) {
        return canMove(nx, ny);
    }
}

