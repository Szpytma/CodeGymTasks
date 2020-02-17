package pl.codegym.task.task04.task0428;

/* 
Liczba dodatnia
*/


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int count = 0;

        if (a > 0) {
            count++;
        }
        if (b > 0) {
            count++;
        }
        if (c > 0) {
            count++;
        }

        System.out.println(count);

    }
}
