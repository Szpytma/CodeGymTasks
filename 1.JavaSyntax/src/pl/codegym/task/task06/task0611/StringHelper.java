package pl.codegym.task.task06.task0611;

/* 
Klasa StringHelper
*/

public class StringHelper {

  public static String multiply(String s) {
    return multiply(s, 5);
  }

  public static String multiply(String s, int licznik) {
    String wynik = "";
    //tutaj wpisz swój kod
      for (int i = 0; i < licznik; i++) {
          wynik += s;
      }
    return wynik;
  }

  public static void main(String[] args) {
      System.out.println(multiply("Paw"));
      System.out.println(multiply("Paw",3));
  }
}
