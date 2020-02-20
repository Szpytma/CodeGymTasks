package pl.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Mów zwięźle
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> strings = new ArrayList<>();
      int minsize = Integer.MAX_VALUE;

    for (int i = 0; i < 5; i++) {
      strings.add(scanner.nextLine());
    }
    for (String s : strings) {
      minsize = Math.min(minsize, s.length());
    }
    for (String s : strings) {
      if (s.length() == minsize) {
        System.out.println(s);
      }
    }
  }
}