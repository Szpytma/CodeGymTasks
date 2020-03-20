package pl.codegym.task.task14.task1420;

/* 
NWD
*/

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        check(a, b);
        System.out.println(greatestCommonMeasure(a, b));
    }

    private static void check(int a, int b) {
        if ((a <= 0) || (b <= 0)) {
            throw new NumberFormatException();
        }
    }

    private static int greatestCommonMeasure(int a, int b) {

        if (b == 0) {
            return a;
        }
        return greatestCommonMeasure(b, a % b);
    }
}
