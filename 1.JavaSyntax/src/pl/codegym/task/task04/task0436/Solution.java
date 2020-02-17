package pl.codegym.task.task04.task0436;


/*
*Drawing a rectangle by using 2 integers in Scanner and 2 for loops
*/


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <=b; j++) {
                System.out.print(8);
            }
            System.out.println();

        }
    }
}
