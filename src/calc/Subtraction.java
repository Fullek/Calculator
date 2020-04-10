package calc;

public class Subtraction extends Calculation {


    Subtraction()
    {
        super("odejmowanie");
    }

    @Override
    public int result(int argument1, int argument2)
    {
        return argument1 - argument2;
    }
}
