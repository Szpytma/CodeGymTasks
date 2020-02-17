package pl.codegym.task.task04.task0427;

/* 
Za pomocą klawiatury wprowadź liczbę całkowitą z przedziału 1 - 999. Wyświetl opis ciągu, jak poniżej:
„parzysta liczba jednocyfrowa” – jeśli liczba jest parzysta i ma jedną cyfrę,
„nieparzysta liczba jednocyfrowa” – jeśli liczba jest nieparzysta i ma jedną cyfrę,
„parzysta liczba dwucyfrowa” – jeśli liczba jest parzysta i ma dwie cyfry,
„nieparzysta liczba dwucyfrowa” – jeśli liczba jest nieparzysta i ma dwie cyfry,
„parzysta liczba trzycyfrowa” – jeśli liczba jest parzysta i ma trzy cyfry,
„nieparzysta liczba trzycyfrowa” – jeśli liczba jest nieparzysta i ma trzy cyfry.
Jeśli wprowadzona liczba znajduje się poza przedziałem 1 - 999, nie wyświetlaj niczego.

*/


import java.util.Scanner;

public class Solution {
    public static void main(String[] args)  {
        //tutaj wpisz swój kod
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a > 0 && a < 10) {
            if (a % 2 == 0) {
                System.out.println("parzysta liczba jednocyfrowa");
            } else {
                System.out.println("nieparzysta liczba jednocyfrowa");
            }
        }
        if (a >= 10 && a < 100) {
            if (a % 2 == 0) {
                System.out.println("parzysta liczba dwucyfrowa");
            } else {
                System.out.println("nieparzysta liczba dwucyfrowa");
            }
        }
        if (a >= 100 && a < 1000) {
            if (a % 2 == 0) {
                System.out.println("parzysta liczba trzycyfrowa");
            } else {
                System.out.println("nieparzysta liczba trzycyfrowa");
            }
        }

    }
}
