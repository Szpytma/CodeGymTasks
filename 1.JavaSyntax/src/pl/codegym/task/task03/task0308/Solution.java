package pl.codegym.task.task03.task0308;

/* 
Iloczyn 10 liczb
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        int wynik = 1;
        for (int i = 1; i <= 10; i++) {
            wynik *= i;
        }
        System.out.println(wynik);
    }
}
