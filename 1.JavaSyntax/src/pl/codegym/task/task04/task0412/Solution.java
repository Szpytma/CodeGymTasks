package pl.codegym.task.task04.task0412;

/* 
Liczby dodatnie i ujemne
*/


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Scanner scanner = new Scanner(System.in);

        int liczba = scanner.nextInt();
        if (liczba > 0) {
            System.out.println(liczba * 2);
        } else if (liczba < 0) {
            System.out.println(liczba + 1);
        } else {
            System.out.println(0);

        }
    }

}