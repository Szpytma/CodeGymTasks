package pl.codegym.task.task05.task0507;

/* 
Średnia arytmetyczna
*/

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) throws Exception {
    //tutaj wpisz swój kod
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int count = 0;

    while (true) {
      int number = scanner.nextInt();
      if (number == -1) {
        break;
      } else {
        sum += number;
        count++;
      }

    }

    System.out.println((double) sum / count);
  }
}

