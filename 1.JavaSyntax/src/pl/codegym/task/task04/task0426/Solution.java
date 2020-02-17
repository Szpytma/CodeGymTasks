package pl.codegym.task.task04.task0426;

/* 
Etykiety i liczby
*/


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        if (a > 0 && a % 2 == 0) {
            System.out.println("Dodatnia liczba parzysta");
        }else if (a % 2 == 1) {
            System.out.println("Dodatnia liczba nieparzysta");
        } else if (a < 0 && a % 2 == 0) {
            System.out.println("Ujemna  liczba parzysta");
        } else if (a == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Ujemna  liczba nieparzysta");
        }
    }
}
