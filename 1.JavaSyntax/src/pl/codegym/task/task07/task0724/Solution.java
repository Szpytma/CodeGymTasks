package pl.codegym.task.task07.task0724;

/* 
Spis członków rodziny
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Human> list = new ArrayList<>();

        // tutaj wpisz swój kod
        Human fFather = new Human("Jan", true, 16);
        Human fMother = new Human("Zofia", false, 14);
        Human mFather = new Human("Bolek", true, 25);
        Human mMother = new Human("Lesia", false, 29);
        Human father = new Human("Jacek", true, 5, fFather, fMother);
        Human mother = new Human("Bozenka", false, 3, mMother, mFather);
        Human brother = new Human("Pawel", true, 14, father, mother);
        Human sister = new Human("Kasia", false, 8, father, mother);
        Human me = new Human("Gosia", false, 5, father, mother);
        list.add(fFather);
        list.add(fMother);
        list.add(mFather);
        list.add(mMother);
        list.add(father);
        list.add(mother);
        list.add(brother);
        list.add(sister);
        list.add(me);
        for (Human l :
                list) {
            System.out.println(l.toString());
        }
    }

    public static class Human {
        String imie;
        boolean plec;
        int wiek;
        Human ojciec;
        Human matka;

        public Human(String imie, boolean plec, int wiek) {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
        }

        public Human(String imie, boolean plec, int wiek, Human ojciec, Human matka) {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
            this.ojciec = ojciec;
            this.matka = matka;
        }

// tutaj wpisz swój kod

        public String toString() {
            String tekst = "";
            tekst += "Imię: " + this.imie;
            tekst += ", płeć: " + (this.plec ? "mężczyzna" : "kobieta");
            tekst += ", wiek: " + this.wiek;

            if (this.ojciec != null)
                tekst += ", ojciec: " + this.ojciec.imie;

            if (this.matka != null)
                tekst += ", matka: " + this.matka.imie;

            return tekst;
        }
    }
}