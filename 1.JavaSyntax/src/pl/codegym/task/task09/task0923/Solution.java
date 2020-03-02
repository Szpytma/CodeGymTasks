package pl.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Samogłoski i spółgłoski
*/

public class Solution {

  public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();
    char[] array = input.toCharArray();

    for (char symbol : array) {
      if (isVowel(symbol)) {
        System.out.print(symbol + " ");
      }
    }
    System.out.println();
    for (char symbol : array) {
      if (!isVowel(symbol) && (symbol != 32)) {
        System.out.print(symbol + " ");
      }
    }
  }

  // Ta metoda sprawdza, czy litera jest samogłoską
  public static boolean isVowel(char c) {
    c = Character.toLowerCase(c);  // Konwertuje na małe litery

    for (char d : vowels)   // Szuka samogłosek w tablicy
    {
        if (c == d) {
            return true;
        }
    }
    return false;
  }
}