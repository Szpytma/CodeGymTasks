package pl.codegym.task.task04.task0415;

/* 
Zasada trójkąta
*/


import java.util.Scanner;

public class Solution {

  public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    if ((a >= b && a >= c && a < c + b) || (b >= a && b >= c && b < a + c) || (c >= a && c >= b
        && c < a + b)) {
      System.out.println("Da się zbudować trójkąt.");
    } else {
      System.out.println("Nie da się zbudować trójkąta.");
    }
  }

}