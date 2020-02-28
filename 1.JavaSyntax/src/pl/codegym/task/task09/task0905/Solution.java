package pl.codegym.task.task09.task0905;

/* 
Krok po kroku po śladach stosu...
*/

public class Solution {
    public static void main(String[] args)  {
        int glebokosc = getGlebokoscStosu();


    }

    public static int getGlebokoscStosu() {

        int deep = Thread.currentThread().getStackTrace().length;
        System.out.println(deep);
        return  deep;
    }
}

