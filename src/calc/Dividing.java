package calc;

public class Dividing extends  Calculation {


    Dividing()
    {
        super("dzielenie");
    }

    @Override
    public int result(int argument1, int argument2)
    {
        if(argument1  == 0 || argument2 ==0)
        {
            throw new DividingByZeroException();
        }

        return argument1 / argument2;
    }
}
