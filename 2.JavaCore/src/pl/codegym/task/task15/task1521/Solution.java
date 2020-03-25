package pl.codegym.task.task15.task1521;

import java.math.BigDecimal;

/* 
OOP: przeciążanie metod
*/

public class Solution {
    public static void main(String[] args) {
        // Blok 2.
        // Wywoływanie obiektów
        new Tree().info((Object) Integer.valueOf("4"));
        new Tree().info((Object) Short.valueOf("4"));
        new Tree().info((Object)new BigDecimal("4"));

        // Blok 3.
        // Wywoływanie liczb
        new Tree().info(Integer.valueOf("4"));
        new Tree().info(Short.valueOf("4"));
        new Tree().info(new BigDecimal("4"));

        // Blok 4.
        // Wywoływanie ciągów
        new Tree().info("4");
        new Tree().info(Integer.valueOf("4").toString());
        new Tree().info(Short.valueOf("4").toString());
        new Tree().info(new BigDecimal("4").toString());
    }
}
