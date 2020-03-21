package pl.codegym.task.task15.task1502;

/* 
OOP: dziedziczenie w królestwie zwierząt
*/


public class Solution {
    // Dodaj tutaj klasy Goose i Dragon

    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        Goose goose = new Goose();
        System.out.println(dragon.getSize());
        System.out.println(goose.getSize());

    }

    public static class BigAnimal {
        protected String getSize() {
            return "jak dinozaur";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "jak kot";
        }
    }

    public static class Dragon extends BigAnimal {
        @Override
        public String getSize() {
            return "Smok jest duży, " + super.getSize();
        }
    }

    public static class Goose extends SmallAnimal {
        @Override
        public String getSize() {
            return "Gęś jest mała, " + super.getSize();
        }
    }
}
