package pl.codegym.task.task04.task0443;


/* 
Imię to imię
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Please enter year of your birth");
        int year = scanner.nextInt();
        System.out.println("Please enter month of your birth");
        int month = scanner.nextInt();
        System.out.println("Please enter day of your birth");
        int day = scanner.nextInt();

        System.out.println("My name is " + name+".");
        System.out.println("I was born " + month +"/"+day+"/"+year);

    }
}
