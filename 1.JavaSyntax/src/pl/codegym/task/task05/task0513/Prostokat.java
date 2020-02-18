package pl.codegym.task.task05.task0513;

/* 
Stwórzmy sobie prostokąt
*/

public class Prostokat {

  private int lewy;
  private int gora;
  private int szerokosc;
  private int wysokosc;

  public void inicjalizuj(int lewy, int gora, int szerokosc, int wysokosc) {
    this.lewy = lewy;
    this.gora = gora;
    this.szerokosc = szerokosc;
    this.wysokosc = wysokosc;
  }

  public void inicjalizuj(int lewy, int gora) {
    this.lewy = lewy;
    this.gora = gora;
    this.szerokosc = 5;
    this.wysokosc = 5;
  }
    public void inicjalizuj(int lewy) {
        this.lewy = lewy;
        this.gora = 5;
        this.szerokosc = 5;
        this.wysokosc = 5;
    }
    public void inicjalizuj() {
        this.lewy = 1;
        this.gora = 2;
        this.szerokosc = 5;
        this.wysokosc = 5;
    }
    public void inicjalizuj(int lewy, int gora, int szerokosc) {
        this.lewy = lewy;
        this.gora = gora;
        this.szerokosc = szerokosc;
        this.wysokosc = 5;
    }


  public static void main(String[] args) {

  }
}
