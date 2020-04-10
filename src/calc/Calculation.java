package calc;

abstract class Calculation {
    private String calculationType;


    Calculation(String calculationType) {
        this.calculationType = calculationType;
    }

        public abstract int result(int argument1, int argument2);




    @Override
    public String toString() {
        return "Wybrano " + calculationType;
    }


}
