package calc;

public class DividingByZeroException extends RuntimeException {
    public DividingByZeroException() {
        super("Nie możesz dzielić przez zero");
    }
}
