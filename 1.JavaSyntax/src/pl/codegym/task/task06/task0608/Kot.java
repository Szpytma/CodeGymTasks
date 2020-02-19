package pl.codegym.task.task06.task0608;

/* 
Metody statyczne dla kotów
*/

public class Kot {
    private static int licznikKotow = 0;

    public Kot() {
        licznikKotow++;
    }

    public static int getLicznikKotow() {
        return Kot.licznikKotow;
    }


    public static void setLicznikKotow(int licznikKotow) {
        //tutaj wpisz swój kod
        Kot.licznikKotow = licznikKotow;
    }

    public static void main(String[] args) {

    }
}
