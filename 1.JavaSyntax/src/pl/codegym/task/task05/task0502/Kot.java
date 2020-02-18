package pl.codegym.task.task05.task0502;

/* 
Zaimplementuj metodę walka
*/

public class Kot {

  public int wiek;
  public int waga;
  public int sila;

  public Kot() {
  }

  public boolean walka(Kot innyKot) {

    return this.sila >= innyKot.sila && this.waga >= innyKot.waga && this.wiek >= innyKot.wiek;
  }

  public static void main(String[] args) {
    Kot kot1 = new Kot();
    kot1.wiek = 10;
    kot1.waga = 10;
    kot1.sila = 15;
    Kot kot2 = new Kot();
    kot2.wiek = 15;
    kot2.waga = 10;
    kot2.sila = 10;

      System.out.println(kot1.walka(kot2));

  }
}
