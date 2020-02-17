package pl.codegym.task.task04.task0424;

/* 
Trzy liczby
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args)  {
        //tutaj wpisz swój kod
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b && a != c)
        {
            System.out.println(3);
        }
        if(a == c && a != b)
        {
            System.out.println(2);
        }
        if(c == b && a != c)
        {
            System.out.println(1);
        }
    }
}