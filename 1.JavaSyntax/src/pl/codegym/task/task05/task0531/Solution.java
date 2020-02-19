package pl.codegym.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Poprawianie funkcjonalności
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b);
        int minimum2 = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
        System.out.println("Minimum = " + minimum2);
    }


    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int min(int a, int b, int c, int d, int e) {

        int minimuma = min(a, b);
        int minimumb = min(c, d);
        int minimumc = min(minimuma, minimumb);
        return  min(minimumc, e);

    }
}