package pl.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Zadanie z algorytmami
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> lista = new ArrayList<>();
    while (true) {
      String s = reader.readLine();
      if (s.isEmpty()) {
        break;
      }
      lista.add(s);
    }

    String[] tablica = lista.toArray(new String[lista.size()]);
    sortuj(tablica);

    for (String x : tablica) {
      System.out.println(x);
    }
  }

  public static void sortuj(String[] tablica) {

    for (int i = 0; i < tablica.length; i++) {
      if (isLiczba(tablica[i])) {
        for (int j = 0; j < i; j++) {
          if (isLiczba(tablica[j])) {
            if (Integer.parseInt(tablica[i]) > Integer.parseInt(tablica[j])) {
              String tmp = tablica[j];
              tablica[j] = tablica[i];
              tablica[i] = tmp;
            }
          }
        }
      } else {
        for (int j = 0; j < i; j++) {
          if (!isLiczba(tablica[j])) {
            if (isWiekszeOd(tablica[j], tablica[i])) {
              String tmp = tablica[j];
              tablica[j] = tablica[i];
              tablica[i] = tmp;
            }
          }
        }
      }
    }
  }


  // Metoda porównywania ciągów: 'a' jest większe niż 'b'
  public static boolean isWiekszeOd(String a, String b) {
    return a.compareTo(b) > 0;
  }


  // Czy przekazywany ciąg jest liczbą?
  public static boolean isLiczba(String s) {
    if (s.length() == 0) {
      return false;
    }

    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];
      if ((i != 0 && c == '-') // Ciąg zawiera łącznik
          || (!Character.isDigit(c) && c != '-') // lub nie jest liczbą i nie zaczyna się łącznikiem
          || (i == 0 && c == '-' && chars.length == 1)) // lub jest pojedynczym łącznikiem
      {
        return false;
      }
    }
    return true;
  }
}
