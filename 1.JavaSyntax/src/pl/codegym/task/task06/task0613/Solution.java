package pl.codegym.task.task06.task0613;

/* 
Kot i statyczne
*/

public class Solution {
    public static void main(String[] args) {
        // Tworzy 10 kotów
        for (int i = 0; i < 10; i++) {
            Kot kot = new Kot();
        }
        System.out.println(Kot.licznikKotow);

        // Wyświetla wartość zmiennej licznikKotow
    }

    public static class Kot {
        public static int licznikKotow;
        public Kot() {
            Kot.licznikKotow++;
        }

        // Tworzy zmienną statyczną licznikKotow


        // Deklaruje konstruktor
    }
}
