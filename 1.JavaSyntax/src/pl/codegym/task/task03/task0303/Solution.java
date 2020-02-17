package pl.codegym.task.task03.task0303;

/* 
Wymiana walut
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        System.out.println(konwertujEurNaUsd(123, 435));
        System.out.println(konwertujEurNaUsd(300, 0.5));
    }

    public static double konwertujEurNaUsd(int eur, double kursWymiany) {
        return eur * kursWymiany;
        //tutaj wpisz swój kod
    }
}
