package pl.codegym.task.task15.task1515;

import java.util.Scanner;

/* 
Modyfikatory statyczne: część 2
*/

public class Solution {
    public static Scanner scanner = new Scanner(System.in);
    public static int A = scanner.nextInt();
    public static int B = scanner.nextInt();
/*    public static int A;
      public static int B;

    static {
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        B = scanner.nextInt();
        scanner.close();
    }*/

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }
}
