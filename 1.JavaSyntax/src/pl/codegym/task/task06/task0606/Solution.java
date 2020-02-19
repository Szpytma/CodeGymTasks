package pl.codegym.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Cyfry parzyste i nieparzyste
*/

public class Solution {

    public static int parzyste;
    public static int nieparzyste;

    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] array = input.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                parzyste++;
            }
            else if (array[i] % 2 == 1) {
                nieparzyste++;
            }
        }

        System.out.println("Parzyste: "+Solution.parzyste + " Nieparzyste: "+Solution.nieparzyste);
    }
}
