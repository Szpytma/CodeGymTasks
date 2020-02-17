package pl.codegym.task.task04.task0418;

/* 
Mniejsza z dwóch liczb
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(Math.min(a, b));

    }
}