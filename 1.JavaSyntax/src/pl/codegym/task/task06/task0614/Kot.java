package pl.codegym.task.task06.task0614;

import java.util.ArrayList;

/* 
Statyczne koty
*/

public class Kot {
    //tutaj wpisz swój kod
    public static ArrayList<Kot> koty = new ArrayList<>();


    public Kot() {
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Kot kot = new Kot();
            koty.add(kot);
        }

        //tutaj wpisz swój kod
        printKoty();
    }

    public static void printKoty() {
        //tutaj wpisz swój kod
        for (Kot kot : koty) {
            System.out.println(kot);
        }


    }
}
