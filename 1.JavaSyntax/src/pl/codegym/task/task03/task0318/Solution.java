package pl.codegym.task.task03.task0318;

/* 
Plan podboju świata
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String liczba = reader.readLine();
        String imie = reader.readLine();

        System.out.println( imie + " przejmie władzę nad światem za " + liczba+ " lat. Mua ha ha!");
    }
}
