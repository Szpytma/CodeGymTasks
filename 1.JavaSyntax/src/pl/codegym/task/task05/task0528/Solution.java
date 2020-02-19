package pl.codegym.task.task05.task0528;

/* 
Wyświetl dzisiejszą datę
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        LocalDate today = LocalDate.now();
        String formattedDate = today.format(DateTimeFormatter.ofPattern("MM dd yyyy"));
        System.out.println(formattedDate);
    }
}
