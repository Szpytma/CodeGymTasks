package pl.codegym.task.task04.task0419;

/* 
Największa z czterech liczb
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args)  {
        //tutaj wpisz swój kod
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int aa = Math.max(a, b);
        int bb = Math.max(c, d);

        System.out.println(Math.max(aa, bb));
    }
}
