package pl.codegym.task.task07.task0708;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Najdłuższy ciąg
*/

public class Solution {

  private static List<String> strings;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Solution.strings = new ArrayList<>();
      int maxsize = 0;

    for (int i = 0; i < 5; i++) {
      strings.add(scanner.nextLine());
    }
      for (String s : strings){
          maxsize = Math.max(maxsize,s.length());
      }
      for (String s: strings){
          if (s.length() == maxsize){
              System.out.println(s);
          }
      }
  }
}