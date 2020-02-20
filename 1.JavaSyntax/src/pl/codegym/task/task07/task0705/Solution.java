package pl.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Jedna wielka tablica i dwie małe
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    //tutaj wpisz swój kod
    Scanner scanner = new Scanner(System.in);

    int[] intArray = new int[20];
    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = scanner.nextInt();
    }
    int[] intArrayA = new int[10];
    int[] intArrayB = new int[10];

    //System.arraycopy(intArray, 0, intArrayA, 0, 10);
    for (int i = 0; i < 10; i++) {
      intArrayA[i] = intArray[i];
    }

    // System.arraycopy(intArray, 10, intArrayB, 0, 10)
    for (int i = 0; i < 10; i++) {
      intArrayB[i] = intArray[i + 10];
    }

    for (int i : intArrayB) {
      System.out.println(i);

    }

  }
}
