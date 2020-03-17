package pl.codegym.task.task14.task1405;

/* 
Jedzonko
*/

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();


        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food) {
        //tutaj wpisz swój kod
        food.onEat();
        food.onSelect();
    }

    public static void selectableMethods(Selectable selectable) {
        //tutaj wpisz swój kod
        selectable.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable {
        public void onEat() {
            System.out.println("Jedzonko zostało zjedzone");
        }

        @Override
        public void onSelect() {
            System.out.println("Jedzonko zostało wybrane");
        }
    }
}