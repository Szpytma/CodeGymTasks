package pl.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Samotne tablice oddziałują na siebie
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    String[] stringArray = new String[10];
    int[] intArray = new int[10];

    for (int i = 0; i < stringArray.length; i++) {
      stringArray[i] = scanner.nextLine();
      intArray[i] = stringArray[i].length();
    }

    for (int i : intArray) {
      System.out.println(i);
    }

  }
}
