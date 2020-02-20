package pl.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Maksimum w tablicy
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    int[] tablica = inicjalizujTablice();
    int max = max(tablica);
    System.out.println(max);
  }

  public static int[] inicjalizujTablice() throws IOException {
    // Tworzy i zapełnia tablicę
    Scanner scanner = new Scanner(System.in);
    int[] tablica = new int[20];
    for (int i = 0; i < tablica.length; i++) {
      tablica[i] = scanner.nextInt();
    }
    return tablica;
  }

  public static int max(int[] tablica) {
    int max = tablica[0];
    for (int i = 0; i < tablica.length; i++) {
      if (tablica[i] > max) {
        max = tablica[i];
      }
    }
    return max;

  }
  // Znajduje maksimum

}
