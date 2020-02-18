package pl.codegym.task.task05.task0511;

/* 
Utwórz klasę Pies
*/

public class Pies {

  //tutaj wpisz swój kod
  private String imie;
  private int wzrost;
  private String kolor;


  public void inicjalizuj(String imie) {
    this.imie = imie;
    this.wzrost = 5;
    this.kolor = "Brown";
  }

  public void inicjalizuj(String imie, int wzrost) {
    this.imie = imie;
    this.wzrost = wzrost;
    this.kolor = "Brown";
  }

  public void inicjalizuj(String imie, int wzrost, String kolor) {
    this.imie = imie;
    this.wzrost = wzrost;
    this.kolor = kolor;
  }

  public static void main(String[] args) {

  }
}
