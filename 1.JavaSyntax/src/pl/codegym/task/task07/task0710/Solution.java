package pl.codegym.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Na szczycie listy
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    //tutaj wpisz swój kod
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(0, scanner.nextLine());
    }
    for (String s : list) {
        System.out.println(s);
    }

  }
}
