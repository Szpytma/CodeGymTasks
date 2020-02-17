package pl.codegym.task.task04.task0425;

/* 
Target niedostępny!
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args)  {
        //tutaj wpisz swój kod
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > 0 && b > 0) {
            System.out.println(1);
        } else if (a < 0 && b < 0) {
            System.out.println(3);
        } else if (a > 0 && b < 0) {
            System.out.println(4);
        } else {
            System.out.println(2);
        }
    }
}
