package pl.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Różne metody dla różnych typów
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.equals("exit")) {
                break;
            }
            try {
                if (s.contains(".")) {
                    print(Double.parseDouble(s));
                } else if (Integer.parseInt(s) <= 0 || Integer.parseInt(s) >= 128) {
                    print(Integer.parseInt(s));
                } else if (Short.parseShort(s) > 0 && Short.parseShort(s) < 128) {
                    print(Short.parseShort(s));
                }
            } catch (Exception e) {
                print(s);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("To jest Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("To jest String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("To jest liczba całkowita typu short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("To jest liczba całkowita typu Integer. Value: " + value);
    }
}
