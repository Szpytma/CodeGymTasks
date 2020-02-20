package pl.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/* 
Liczby w kolejności rosnącej
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
      for (int i = 0; i < 5; i++) {
          int input = scanner.nextInt();
          list.add(input);
      }
      Collections.sort(list);

      for (int i = 0; i < 5; i++) {

          System.out.println(list.get(i));
      }

  }
}
