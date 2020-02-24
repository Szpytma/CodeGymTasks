package pl.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Najdłuższa sekwencja
*/
public class Solution {

  public static void main(String[] args) throws IOException {
    //tutaj wpisz swój kod
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    int sequence = 1;

    for (int i = 0; i < 10; i++) {
      list.add(scanner.nextInt());
    }

    for (int i = 0; i < list.size() - 1; i++) {
      int count = 1;
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(i).equals(list.get(j))) {
          count++;
        } else {
          break;
        }
      }
      if (sequence < count) {
        sequence = count;
      }
    }

    System.out.println(sequence);
  }
}