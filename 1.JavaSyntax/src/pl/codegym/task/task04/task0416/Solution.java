package pl.codegym.task.task04.task0416;

/* 
Przejście przez ulicę na oślep
*/


import java.util.Scanner;

public class Solution {

  public static void main(String[] args)  {
    Scanner input = new Scanner(System.in);
    double t = input.nextDouble();
    double a = Math.floor(t);
    if (a % 5 >= 0 && a % 5 < 3) {
      System.out.println("zielone");
    }
   else if (a % 5 >= 3 && a % 5 < 4) {
      System.out.println("żółte");
    } else {
      System.out.println("czerwone");
    }
  }
}