package pl.codegym.task.task05.task0505;

/* 
Kocia jatka
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Kot cat1 = new Kot("Fatty", 3, 50, 50);
        Kot cat2 = new Kot("Fluffy", 2, 45, 40);
        Kot cat3 = new Kot("Kitty", 6, 10, 20);

        System.out.println(cat2.walka(cat1));
        System.out.println(cat1.walka(cat3));
        System.out.println(cat1.walka(cat2));
    }

    public static class Kot {
        protected String imie;
        protected int wiek;
        protected int waga;
        protected int sila;

        public Kot(String imie, int wiek, int waga, int sila) {
            this.imie = imie;
            this.wiek = wiek;
            this.waga = waga;
            this.sila = sila;
        }

        public boolean walka(Kot innyKot) {
            int wiekPrzewaga = this.wiek > innyKot.wiek ? 1 : 0;
            int wagaPrzewaga = this.waga > innyKot.waga ? 1 : 0;
            int silaPrzewaga = this.sila > innyKot.sila ? 1 : 0;

            int wynik = wiekPrzewaga + wagaPrzewaga + silaPrzewaga;
            return wynik > 2; // return wynik > 2 ? true : false;
        }
    }
}