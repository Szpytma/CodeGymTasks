package pl.codegym.task.task04.task0423;

/* 
Strategia ochroniarzy
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args)  {
        //tutaj wpisz swój kod
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.nextLine();
        int wiek = scanner.nextInt();

        if (wiek > 20) {
            System.out.println(imie + " wystarczy, że masz 18");
        }
    }
}
