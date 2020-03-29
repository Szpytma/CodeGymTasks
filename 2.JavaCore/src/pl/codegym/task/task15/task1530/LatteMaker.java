package pl.codegym.task.task15.task1530;

public class LatteMaker extends DrinkMaker {
    @Override
    void getRightCup() {
        System.out.println("Use cup for latte ");
    }

    @Override
    void addIngredients() {
        System.out.println("Make coffee");
    }

    @Override
    void pour() {
        System.out.println("Pour frothed milk");
    }

}
