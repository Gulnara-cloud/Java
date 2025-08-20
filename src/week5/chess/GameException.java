package week5.chess;

public class GameException extends Exception {
    public GameException(String s, Exception cause) {
        super(s, cause);
    }
    public GameException(String message) {
        super(message);
    }
}
