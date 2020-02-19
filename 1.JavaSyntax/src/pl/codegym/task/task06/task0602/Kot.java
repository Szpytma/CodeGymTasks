package pl.codegym.task.task06.task0602;

/* 
Koty zombie, psy zombie
*/

public class Kot {
    public static void main(String[] args) {

    }
    protected void finalize() {
        System.out.println("Kot został zniszczony");
    }

    //tutaj wpisz swój kod

}

class Pies {
    //tutaj wpisz swój kod
    protected void finalize() {
        System.out.println("Pies został zniszczony");
    }
}
