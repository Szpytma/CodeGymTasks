package pl.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Słowa na odwrót
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }
        list.remove(2);
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.println(list.get(i));
        }
    }
}


