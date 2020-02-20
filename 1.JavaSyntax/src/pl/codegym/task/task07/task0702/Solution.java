package pl.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Tablica z ciągami w odwrotnej kolejności
*/

public class Solution {

  public static void main(String[] args) throws Exception {
      //tutaj wpisz swój kod
      Scanner scanner = new Scanner(System.in);
    String[] array = new String[10];
      for (int i = 0; i < 8; i++) {
    array[i] = scanner.nextLine();
    }

    for(int i = 9; i >= 0; i--)
    System.out.println(array[i]);
    }

    }

