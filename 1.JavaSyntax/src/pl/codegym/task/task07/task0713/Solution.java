package pl.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Granie w Javarellę
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    //tutaj wpisz swój kod
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> dividedBy3 = new ArrayList<>();
    ArrayList<Integer> dividedBy2 = new ArrayList<>();
    ArrayList<Integer> dividedByRest = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
        int input = scanner.nextInt();
        list.add(input);
      if (input % 3 == 0 && input % 2 == 0) {
        dividedBy3.add(input);
        dividedBy2.add(input);
      } else if (input % 3 == 0) {
        dividedBy3.add(input);
      } else if (input % 2 == 0) {
        dividedBy2.add(input);
      } else {
        dividedByRest.add(input);
      }

    }
    printLista(dividedBy3);
    printLista(dividedBy2);
    printLista(dividedByRest);
  }

  public static void printLista(List<Integer> lista) {
    //tutaj wpisz swój kod
    for (int i : lista) {
      System.out.println(i);
    }
  }
}
