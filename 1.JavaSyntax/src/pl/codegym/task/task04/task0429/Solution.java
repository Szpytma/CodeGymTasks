package pl.codegym.task.task04.task0429;

/* 
Liczby dodatnie i ujemne
*/


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int positiveCount = 0;
        int negativeCount = 0;

        if (a > 0) {
            positiveCount++;
        }
        if (a < 0) {
            negativeCount++;
        }
        if (b> 0) {
            positiveCount++;
        }
        if (b < 0) {
            negativeCount++;
        }
        if (c > 0) {
            positiveCount++;
        }
        if (c < 0) {
            negativeCount++;
        }

        System.out.println("Liczba liczb ujemnych: " + negativeCount);
        System.out.println("Liczba liczb dodatnich: " + positiveCount);
    }
}
