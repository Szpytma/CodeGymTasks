package pl.codegym.task.task15.task1507;

/* 
OOP: przeciążanie metod
*/

import java.time.DayOfWeek;

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
        printMatrix(2, 3, 8.0);
        printMatrix(2, 3, (short)1);
        printMatrix(2, 3, 1);
        printMatrix(2, 3, 'c');
        printMatrix(2, 3, true);
        printMatrix(2, 3, 500f);
        printMatrix(2, 3, DayOfWeek.SATURDAY);
        printMatrix(2, 3, (Double) 5.4);
        printMatrix(2, 3, (Integer)5);

    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Wypełnianie obiektami typu String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        System.out.println("Wypełnianie obiektami typu Object");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, int n, double value) {
        System.out.println("Wypełnianie obiektami typu Double");
        System.out.println(m + n + value);
    }
    public static void printMatrix(int m, int n, short value) {
        System.out.println("Wypełnianie obiektami typu Short");
        System.out.println(m + n + value);
    }
    public static void printMatrix(int m, int n, int value) {
        System.out.println("Wypełnianie obiektami typu integer");
        System.out.println(m + n + value);
    }
    public static void printMatrix(int m, int n, char value) {
        System.out.println("Wypełnianie obiektami typu Char");
        System.out.println(m + n + value);
    }
    public static void printMatrix(int m, int n, boolean value) {
        System.out.println("Wypełnianie obiektami typu Boolean");
        if (value) {
            System.out.println(m+n);
        } else {
            System.out.println(m-n);

        }
    }
    public static void printMatrix(int m, int n, float value) {
        System.out.println("Wypełnianie obiektami typu Float");
        System.out.println(m + n + value);
    }
    public static void printMatrix(int m, int n, Enum<DayOfWeek> value) {
        System.out.println("Wypełnianie obiektami typu Enum");
        System.out.println(m + n +" " +value.name());
    }

    public static void printMatrix(int m, int n, Integer value) {
        System.out.println("Wypełnianie obiektami typu Integer");
        System.out.println(m * n / value);
    }

}
