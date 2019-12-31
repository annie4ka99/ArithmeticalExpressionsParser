package exception;

public class ArithmeticExpressionException extends RuntimeException {
    public ArithmeticExpressionException(String message, int line) {
        super("error: " + message + " in line: " + line);
    }
}
