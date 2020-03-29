package pl.codegym.task.task15.task1530;

public class TeaMaker extends DrinkMaker {
    @Override
    void getRightCup() {
        System.out.println("Use cup for tea");
    }

    @Override
    void addIngredients() {
        System.out.println("Add Tea");
    }

    @Override
    void pour() {
        System.out.println("Pour hot water");
    }

}
