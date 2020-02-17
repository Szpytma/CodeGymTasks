package pl.codegym.task.task04.task0409;

/* 
Najbliżej 10
*/

public class Solution {
    public static void main(String[] args) {
        wyswietlNajblizszaDziesiatce(8, 11);
        wyswietlNajblizszaDziesiatce(7, 14);
    }

    public static void wyswietlNajblizszaDziesiatce(int a, int b) {
        if (abs(10-a) < abs(10-b)) {
            System.out.println(a);
        } else if (abs(10 - a) > abs(10 - b)) {
            System.out.println(b);

        } else {
            System.out.println(a);

        }


    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}