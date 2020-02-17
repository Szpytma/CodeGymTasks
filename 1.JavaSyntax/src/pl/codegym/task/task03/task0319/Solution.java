package pl.codegym.task.task03.task0319;

/* 
Prognozy
*/

import java.util.Scanner;

public class Solution {

  public static void main(String[] args)  {
    //tutaj wpisz swój kod

      Scanner scanner = new Scanner(System.in);
    String imie = scanner.nextLine();
    int liczba1 = scanner.nextInt();
    int liczba2 = scanner.nextInt();

    System.out.println(imie + " dostanie " + liczba1 + " za " + liczba2 + " lat.");
  }
}
