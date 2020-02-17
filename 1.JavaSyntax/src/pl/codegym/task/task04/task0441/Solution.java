package pl.codegym.task.task04.task0441;


/* 
Jakiś taki przeciętny
*/


import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    //tutaj wpisz swój kod
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    if ((b >= a || c >= a) && (b <= a || c <= a)) {
      System.out.println(a);
    } else if ((a >= b || c >= b) && (a <= b || c <= b)) {
      System.out.println(b);
    } else {
      System.out.println(c);
    }

  }
}
