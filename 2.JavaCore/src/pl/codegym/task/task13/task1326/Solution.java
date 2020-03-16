package pl.codegym.task.task13.task1326;

/* 
Sortowanie liczb parzystych z pliku
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> numberList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        BufferedReader input = new BufferedReader(new InputStreamReader( new FileInputStream(fileName)));
        String data;

        while ((data = input.readLine()) != null) {
            Integer number = Integer.parseInt(data);
            numberList.add(number);
        }
        Collections.sort(numberList);

        for (Integer i : numberList) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
        input.close();

    }
}
