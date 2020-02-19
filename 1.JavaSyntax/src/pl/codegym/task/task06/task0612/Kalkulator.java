package pl.codegym.task.task06.task0612;

/* 
Kalkulator
*/

public class Kalkulator {

  public static int plus(int a, int b) {
    //tutaj wpisz swój kod
    return a + b;
  }

  public static int minus(int a, int b) {
    //tutaj wpisz swój kod
    return a - b;
  }

  public static int multiply(int a, int b) {
    //tutaj wpisz swój kod
    return a * b;
  }

  public static double divide(int a, int b) {
    //tutaj wpisz swój kod
      return (double) a / (double) b;
  }

  public static double percent(int a, int b) {
    //tutaj wpisz swój kod

      return (double) b * ((double) a / 100);

  }

  public static void main(String[] args) {
    System.out.println(percent(100, 20));
  }
}