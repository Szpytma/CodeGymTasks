package pl.codegym.task.task04.task0420;

/* 
Sortowanie trzech liczb
*/


import java.util.Scanner;

public class Solution {

  public static void main(String[] args)  {
    //tutaj wpisz swój kod
    Scanner scanner = new Scanner(System.in);

      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();


    if(a>=b && a>=c && b>=c )
      System.out.print(a+" "+b+" "+c);

    else if(a >= c && c >= b)
      System.out.print(a+" "+c+" "+b);

    else if(b>=a && b>=c && a>=c)
      System.out.print(b+" "+a+" "+c);

    else if(b >= c)
      System.out.print(b+" "+c+" "+a);

    else if(b >= a)
      System.out.print(c+" "+b+" "+a);

    else
      System.out.print(c+" "+a+" "+b);


  }
}


