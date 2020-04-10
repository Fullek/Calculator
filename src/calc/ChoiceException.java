package calc;

public class ChoiceException extends RuntimeException {

    ChoiceException()
    {
        super("Chcesz wybrać nieistiejącą opcję, taka opcja nieistnieje.");
    }
}
