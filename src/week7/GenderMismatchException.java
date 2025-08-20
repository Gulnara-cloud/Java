package week7;

public class GenderMismatchException extends Exception {
    public GenderMismatchException() {
        super("Only males are allowed!");
    }
}
