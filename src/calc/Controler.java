package calc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Controler {
    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVIDING = 4;
    private static final int ENDING = 5;

    private Scanner scanner;

    private Calculation calculation;
    private boolean endProgram = false;

    public Controler(Scanner scanner) {
        this.scanner = scanner;
    }

    public List<String> menuOptionsList() {
        List<String> options = new ArrayList<>();
        options.add("Jakie działąnie chcesz podjąć: ");
        options.add("1. Dodawanie");
        options.add("2. Odejmowanie");
        options.add("3. Mnożenie");
        options.add("4. Dzielenie");
        options.add("5. Wyjdź");

        // przepelnienie sterty a stosu

        return options;

    }

    private void displayOptions() {
//        for (String s : menuOptionsList()) {
////            System.out.println(s);
////        }
        List<String> options = menuOptionsList();
        for (String option : options) {
            System.out.println(option);
        }
    }

    public void menu() {
        do {
            menuHandling();
        } while (!endProgram);
    }

    private void menuHandling()
    {
        try {
            menuManager();
        }
        catch(RuntimeException e)
        {
            System.out.println(e.getMessage());
        }


    }

    private void menuManager() {
        displayOptions();
        menuSwitcher();
    }

    private void menuSwitcher() {
        switch (choice()) {
            case ADDITION:
                addittionOption();
                break;
            case SUBTRACTION:
                subtractionOption();
                break;
            case MULTIPLICATION:
                multiplicationOption();
                break;
            case DIVIDING:
                dividingOption();
                break;
            case ENDING:
                endingOption();
                break;
            default:
                defaultOption();
        }
    }

    private MenuOptions choice() {
        int userChoice = scanner.nextInt();

        int index = userChoice -1;    // Zrob S zasade

        if(index > MenuOptions.ENDING.getOptionNumber())
        {
            throw new ChoiceException();
        }


        return MenuOptions.values()[index];
    }

    private void defaultOption() {
        displayChose("Wybrano nieistniejącą opcję!");
    }

    private void endingOption() {
        displayChose("Wyjście z programu"); //Dekompozycja
        ending();
    }

    private void ending() {
        endProgram = true;
    }

    private void addittionOption() {
        Calculation addition = new Addition(); // tak samo postąp w każdym casie
        displayChose(addition.toString());
        int[] numbers = inputManager();
        displayResult(addition, numbers);


    }

    private void subtractionOption() {
        Calculation subtraction = new Subtraction();
        displayChose(subtraction.toString());
        int[] numbers = inputManager();
        displayResult(subtraction, numbers);

    }

    private void multiplicationOption() {
        Calculation multiplication = new Multiplication();
        displayChose(multiplication.toString());
        int[] numbers = inputManager();
        displayResult(multiplication, numbers);


    }

    private void dividingOption() {
        Calculation dividing = new Dividing();
        displayChose(dividing.toString());
        int[] numbers = inputManager();
        displayResult(dividing, numbers);

    }


    private int[] inputManager() {
        int[] tab = new int[2];
        System.out.println("Wprowadź 1 liczbę: ");
        tab[0] = scanner.nextInt();
        System.out.println("Wprowadź 2 liczbę: ");
        tab[1] = scanner.nextInt();
        return tab;
    }

    private void displayChose(String information) {
        System.out.println(
                information
        );
    }

    private void displayResult(Calculation calculation, int[] inputs) {
        System.out.printf("Twój wynik: %d ", calculation.result(inputs[0], inputs[1]));
    }


}
