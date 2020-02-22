package pl.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Minimum i maksimum w tablicach
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];
        for (int i = 0; i < list.length; i++) {
            list[i] = (Integer.parseInt(reader.readLine()));
        }
        int minimum = Integer.MAX_VALUE;
        int maksimum = Integer.MIN_VALUE;

        //tutaj wpisz swój kod
        for (int value : list) {
            if (value > maksimum) {
                maksimum = value;
            }
        }
        for (int value : list) {
            if (value < minimum) {
                minimum = value;
            }
        }

        System.out.print(maksimum + " " + minimum);
    }
}
