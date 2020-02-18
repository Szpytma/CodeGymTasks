package pl.codegym.task.task05.task0510;

/* 
Inicjalizowanie kotów
*/

public class Kot {

  private String imie;
  private int waga;
  private int wiek;
  private String kolor;
  private String adres;

  public void inicjalizuj(String imie) {
    this.imie = imie;
    this.waga = 5;
    this.wiek = 4;
    this.kolor = "blue";
  }

  public void inicjalizuj(String imie, int waga, int wiek) {
    this.imie = imie;
    this.waga = waga;
    this.wiek = wiek;
    this.kolor = "blue";
  }

  public void inicjalizuj(String imie, int wiek) {
    this.imie = imie;
    this.wiek = wiek;
    this.waga = 0;
  }

  public void inicjalizuj(int waga, String kolor) {
    this.waga = waga;
    this.kolor = kolor;
    this.wiek = 5;
  }

  public void inicjalizuj(int waga, String kolor, String adres) {
    this.waga = waga;
    this.kolor = kolor;
    this.adres = adres;
    this.wiek = 5;
  }


  public static void main(String[] args) {

  }
}
