package pl.codegym.task.task15.task1530;

/* 
Metoda szablonowa
*/

public class Solution {
    public static void main(String[] args) {

        DrinkMaker latteMaker = new LatteMaker();
        DrinkMaker teaMaker = new TeaMaker();

        latteMaker.makeDrink();
        teaMaker.makeDrink();
    }
}
