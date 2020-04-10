package calc;

import java.util.Scanner;

public class CalculatorDemo {

    void demostrateCalculator() {
        Scanner scanner = new Scanner(System.in);
        Controler controler = new Controler(scanner);
        controler.menu();
    }
}
