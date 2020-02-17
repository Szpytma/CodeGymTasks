package pl.codegym.task.task04.task0402;

/* 
Cena jabłek
*/
public class Solution {

  public static void main(String[] args) {

    Jablko.podniesCene(50);
    Jablko.podniesCene(100);
    System.out.println("Koszt jabłek to " + Jablko.cenaJablek);
  }

  public static class Jablko {

    public static int cenaJablek = 0;

    public static void podniesCene(int cenaJablek) {
        Jablko.cenaJablek +=cenaJablek;
    }
  }
}
