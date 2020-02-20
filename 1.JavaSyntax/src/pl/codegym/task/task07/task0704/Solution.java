package pl.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Odwróć tablicę
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    //tutaj wpisz swój kod
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[10];
    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
    }

    for (int i = array.length - 1; i >= 0; i--) {
      System.out.println(array[i]);
    }
  }
}

