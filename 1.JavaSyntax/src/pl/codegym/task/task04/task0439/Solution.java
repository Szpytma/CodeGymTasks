package pl.codegym.task.task04.task0439;

/* 
Łańcuszek
*/


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String s = " mnie kocha.";

        for (int i = 0; i < 10; i++) {
            System.out.println(name + s);
        }
    }
}
