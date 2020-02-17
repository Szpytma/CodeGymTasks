package pl.codegym.task.task04.task0406;

/* 
Rejestr imion
*/

public class Kot {
    private String imieInazwisko;

    public void setImie(String imie, String nazwisko) {

        //tutaj wpisz swój kod
        this.imieInazwisko = imie + " " + nazwisko;

    }


    public static void main(String[] args) {
        Kot kot = new Kot();
        kot.setImie("Bartek","Miau");
        System.out.println(kot.imieInazwisko);
    }
}
