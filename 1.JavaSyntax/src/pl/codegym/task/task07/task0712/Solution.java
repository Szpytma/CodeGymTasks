package pl.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Najkrótszy czy najdłuższy
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
        }

        int maxLenght = list.get(0).length();
        int maxIndex = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > maxLenght) {
                maxLenght = list.get(i).length();
                maxIndex = i;
            }
        }
        int minLenght = list.get(0).length();
        int minIndex = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < minLenght) {
                minLenght = list.get(i).length();
                minIndex = i;
            }
        }
        if (minIndex < maxIndex) {
            System.out.println(list.get(minIndex));

        } else {
            System.out.println(list.get(maxIndex));
        }
    }
}
