package pl.codegym.task.task06.task0620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Naprawianie błędów młodości
*/

public class Solution {

    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String tekst = "Maksimum to ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int max = Math.max(a, b);

        System.out.println(tekst + max);
    }
}
