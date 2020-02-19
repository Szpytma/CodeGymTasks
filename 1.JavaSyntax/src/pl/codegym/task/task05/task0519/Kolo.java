package pl.codegym.task.task05.task0519;

/* 
Chodzenie w kółko
*/

public class Kolo {

    int srodekX, srodekY, promien, szerokosc, kolor;

    public Kolo(int srodekX, int srodekY, int promien) {
        this.srodekX = srodekX;
        this.srodekY = srodekY;
        this.promien = promien;
        this.szerokosc = 2;
        this.kolor = 2;
    }

    public Kolo(int srodekX, int srodekY, int promien, int szerokosc) {
        this.srodekX = srodekX;
        this.srodekY = srodekY;
        this.promien = promien;
        this.szerokosc = szerokosc;
        this.kolor = 2;
    }

    public Kolo(int srodekX, int srodekY, int promien, int szerokosc, int kolor) {
        this.srodekX = srodekX;
        this.srodekY = srodekY;
        this.promien = promien;
        this.szerokosc = szerokosc;
        this.kolor = kolor;
    }

    public static void main(String[] args) {

    }
}
