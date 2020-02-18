package pl.codegym.task.task05.task0504;

/* 
Trzej Muszkoterowie
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Kot cat1 = new Kot("Kitty", 5, 10, 100);
        Kot cat2 = new Kot("Fatty", 2, 5, 15);
        Kot cat3 = new Kot("Fluffy", 1, 2, 5);
    }

    public static class Kot {
        public String imie;
        protected int wiek;
        int waga;
        private int sila;

        public Kot(String imie, int wiek, int waga, int sila) {
            this.imie = imie;
            this.wiek = wiek;
            this.waga = waga;
            this.sila = sila;
        }
    }
}