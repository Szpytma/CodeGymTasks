package pl.codegym.task.task05.task0517;

/* 
Tworzenie kotów
*/

public class Kot {

  //tutaj wpisz swój kod
  String imie;
  int wiek;
  int waga;
  String adres;
  String kolor;

  public Kot(String imie) {
    this.imie = imie;
    this.wiek = 5;
    this.waga = 5;
    this.kolor = "Black";
  }

  public Kot(String imie, int waga, int wiek) {
    this.imie = imie;
    this.wiek = wiek;
    this.waga = waga;
    this.kolor = "Black";
  }

  public Kot(String imie, int wiek) {
    this.imie = imie;
    this.wiek = wiek;
    this.waga = 5;
    this.kolor = "Black";
  }

  public Kot(int waga, String kolor) {

    this.wiek = 2;
    this.waga = waga;
    this.kolor = kolor;

  }

  public Kot(int waga,  String kolor, String adres) {

    this.waga = waga;
    this.adres = adres;
    this.kolor = kolor;
    this.wiek = 2;
  }

  public static void main(String[] args) {

  }
}
