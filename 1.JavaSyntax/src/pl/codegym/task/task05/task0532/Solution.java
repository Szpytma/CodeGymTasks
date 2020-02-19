package pl.codegym.task.task05.task0532;

import java.io.*;

/* 
Zadanie z algorytmami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maksimum = 0;
        int mininmum = Integer.MIN_VALUE;
        if (n != 0 && !(n < 0)){
            while (n > 0){
                int i = Integer.parseInt(reader.readLine());
                n--;
                maksimum = Math.max(mininmum,i);
                mininmum = maksimum;
            }
        }
        System.out.println(maksimum);


    }
}
