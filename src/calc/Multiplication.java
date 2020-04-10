package calc;

public class Multiplication extends Calculation {


    Multiplication()
    {
        super("mnożenie");
    }

    public int result(int argument1, int argument2)
    {
        return argument1 * argument2;
    }

}
