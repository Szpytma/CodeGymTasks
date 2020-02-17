package pl.codegym.task.task04.task0442;


/* 
Dodawanie
*/


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int liczba = scanner.nextInt();
            sum += liczba;
            if (liczba == -1) {
                break;
            }
        }
        System.out.println(sum);

    }
}
