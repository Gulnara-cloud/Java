package week5.chess;

public class IllegalPositionException extends GameException {
    public IllegalPositionException(String position) {
        super(position + " is illegal");
    }
}
