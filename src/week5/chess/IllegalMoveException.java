package week5.chess;

public class IllegalMoveException extends GameException {
    public IllegalMoveException(String from, String to, Exception cause) {
        super("the move from " + from + " to " + to + " is illegal: ", cause);
    }
}
