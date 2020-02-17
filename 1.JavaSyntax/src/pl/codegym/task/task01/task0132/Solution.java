package pl.codegym.task.task01.task0132;

/* 
Suma cyfr trzycyfrowej liczby
*/



public class Solution {
    public static void main(String[] args) {
        System.out.println(sumaCyfrLiczby(546));
    }

    public static int sumaCyfrLiczby(int liczba) {

        int cyfra1 = liczba / 100;
        int cyfra2 = (liczba / 10)%10;
        int cyfra3 = liczba % 10;

        return cyfra1+ cyfra2 + cyfra3;

        //tutaj wpisz swój kod
    }
}