package calc;

public enum MenuOptions {

//  Sprobuj stworzyc ocpje defualt, ktora bedzie 0 elementem tablicy enumowej
        ADDITION(1),
        SUBTRACTION(2),
        MULTIPLICATION(3),
        DIVIDING(4),
        ENDING(5);

        private int optionNumber;

        MenuOptions(int oN)
        {
            this.optionNumber = oN;
        }

        public int getOptionNumber()
        {
            return optionNumber;
        }



}
