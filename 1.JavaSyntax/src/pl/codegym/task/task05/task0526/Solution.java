package pl.codegym.task.task05.task0526;

/* 
Mężczyzna i kobieta
*/

public class Solution {

  public static void main(String[] args) {
    Mezczyzna mezczyzna1 = new Mezczyzna("Andrzej", 19, "Rzeszow");
    Mezczyzna mezczyzna2 = new Mezczyzna("Pawel", 19, "Londyn");
    Kobieta kobieta1 = new Kobieta("Karolina", 19, "Londyn");
    Kobieta kobieta2 = new Kobieta("Paulina", 19, "Rzeszow");
      System.out.println(mezczyzna1.toString());
      System.out.println(mezczyzna2.toString());
      System.out.println(kobieta1.toString());
      System.out.println(kobieta2.toString());

  }

  //tutaj wpisz swój kod
  public static class Mezczyzna {

    private String imie;
    private int wiek;
    private String adres;

    @Override
    public String toString() {
      return imie + " " + wiek + " "
          + adres;
    }

    public Mezczyzna(String imie, int wiek, String adres) {
      this.imie = imie;
      this.wiek = wiek;
      this.adres = adres;


    }
  }

  public static class Kobieta {

    private String imie;
    private int wiek;
    private String adres;

      @Override
      public String toString() {
          return imie + " " + wiek + " "
              + adres;
      }

    public Kobieta(String imie, int wiek, String adres) {
      this.imie = imie;
      this.wiek = wiek;
      this.adres = adres;
    }
  }
}
