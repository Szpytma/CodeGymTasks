package pl.codegym.task.task09.task0905;

/* 
Krok po kroku po śladach stosu...
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int glebokosc = getGlebokoscStosu();


    }

    public static int getGlebokoscStosu() {
        // tutaj wpisz swój kod
        int deep = Thread.currentThread().getStackTrace().length;
        System.out.println(deep);
        return  deep;
    }
}

