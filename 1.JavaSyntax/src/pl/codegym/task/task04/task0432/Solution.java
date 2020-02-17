package pl.codegym.task.task04.task0432;



/* 
Dobrego nigdy zbyt wiele
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = scanner.nextInt();
        int count = 0;

        while (count != i) {
            if (i < 0) {
                break;
            } else {
                count++;
                System.out.println(s);
            }

        }
    }
}
