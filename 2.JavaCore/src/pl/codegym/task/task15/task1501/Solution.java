package pl.codegym.task.task15.task1501;

/* 
OOP: Utwórz interfejsy
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Discountable, Sellable, Movable{
        @Override
        public Object getAllowedAction(String name) {
            return null;
        }

        @Override
        public Object getAllowedAction() {
            return null;
        }

        @Override
        public boolean isMovable() {
            return false;
        }
    }
}
