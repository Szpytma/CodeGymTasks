package pl.codegym.task.task04.task0421;

/* 
Jola czy Jola?
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();

        if (name1.equals(name2)) {
            System.out.println("Imiona są identyczne");
        } else if (name1.length() == name2.length()) {
            System.out.println("Imiona są takiej samej długości");
        }

    }
}
