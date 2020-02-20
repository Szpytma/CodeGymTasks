package pl.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Ulice i domy
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    //tutaj wpisz swój kod
    Scanner scanner = new Scanner(System.in);
    int[] intArray = new int[15];
    int nieparzyste = 0;
    int parzyste = 0;

    for (int i = 0; i < intArray.length; i++) {
        intArray[i] = scanner.nextInt();

        if (i % 2 == 0) {
            parzyste += intArray[i];
        } else {
            nieparzyste += intArray[i];
        }
    }
      if (nieparzyste > parzyste) {
          System.out.println("Więcej ludzi mieszka w domach o nieparzystych numerach.");

      } else {
          System.out.println("Więcej ludzi mieszka w domach o parzystych numerach.");
      }

  }


}
