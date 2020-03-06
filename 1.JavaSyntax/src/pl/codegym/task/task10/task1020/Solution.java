package pl.codegym.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Zadanie z algorytmami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = 30;
        int[] tablica = new int[size];
        for (int i = 0; i < size; i++) {
            tablica[i] = Integer.parseInt(reader.readLine());
        }

        sortuj(tablica);

        System.out.println(tablica[9]);
        System.out.println(tablica[10]);
    }

    public static void sortuj(int[] tablica) {

        Arrays.sort(tablica);
       /* for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length-1; j++) {
                if (tablica[j]>tablica[j+1])
                {
                    int temp = tablica[j+1];
                    tablica[j+1] = tablica[j];
                    tablica[j] = temp;
                }
            }
        }*/
    }
}