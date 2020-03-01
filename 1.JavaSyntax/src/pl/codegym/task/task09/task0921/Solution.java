package pl.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Metoda w try-catch
*/

public class Solution {
    public static void main(String[] args) {
        czytajDane();
    }

    public static void czytajDane() {
        //tutaj wpisz swój kod
        Scanner scanner = new Scanner(System.in);
        List<Integer> arrayList = new ArrayList<>();
        try {
            while (true) {
                arrayList.add(Integer.parseInt(scanner.nextLine()));
            }

        } catch (InputMismatchException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));

        } finally {
            for (int i : arrayList) {
                System.out.println(i);
            }
        }

    }
}
