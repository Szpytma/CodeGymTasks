package pl.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Usuń i wstaw
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    //tutaj wpisz swój kod
    Scanner scanner = new Scanner(System.in);

    ArrayList<String> list = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      list.add(scanner.nextLine());
    }

    for (int i = 0; i < 13; i++) {
      list.add(0, list.get(list.size() - 1));
      list.remove(list.size() - 1);
    }

    for (String s : list) {

      System.out.println(s);
    }
  }
}
