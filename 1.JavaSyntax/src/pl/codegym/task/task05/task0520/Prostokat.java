package pl.codegym.task.task05.task0520;

/* 
Utwórz klasę Prostokat
*/

public class Prostokat {
    int gora, lewy, szerokosc, wysokosc;

      public Prostokat(int gora) {
        this.gora = gora;
    }

    public Prostokat(int gora, int lewy) {
        this.gora = gora;
        this.lewy = lewy;
    }

    public Prostokat(int gora, int lewy, int szerokosc) {
        this(gora, lewy);
        this.szerokosc = szerokosc;

    }
    public Prostokat(int gora, int lewy, int szerokosc, int wysokosc) {
        this(gora, lewy, szerokosc);
        this.wysokosc = wysokosc;
    }

    public static void main(String[] args) {

    }
}
