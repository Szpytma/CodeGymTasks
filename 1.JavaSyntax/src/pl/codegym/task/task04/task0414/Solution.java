package pl.codegym.task.task04.task0414;

/* 
Liczba dni w roku
*/


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        String message = "Liczba dni w roku: ";
        int przestepny = 366;
        int niePrzestepny = 365;


        if (year % 400 == 0) {
            System.out.println(message + " " + przestepny);
        } else if (year % 100 == 0) {
            System.out.println(message + " " +niePrzestepny);
        } else if (year % 4 == 0) {
            System.out.println(message + " " +przestepny);
        } else {
            System.out.println(message + " " +niePrzestepny);
        }
    }
}