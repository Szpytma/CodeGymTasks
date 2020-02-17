package pl.codegym.task.task04.task0413;

/* 
Dzień tygodnia
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args)  {
        //tutaj wpisz swój kod
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Poniedziałek");
        } else if (number == 2) {
            System.out.println("Wtorek");
        }else if (number == 3) {
            System.out.println("Środa");
        }else if (number == 4) {
            System.out.println("Czwartek");
        }else if (number == 5) {
            System.out.println("Piątek");
        }else if (number == 6) {
            System.out.println("Sobota");
        } else if (number == 7) {
            System.out.println("Niedziela");
        } else {
            System.out.println("Nie ma takiego dnia tygodnia");
        }
    }
}