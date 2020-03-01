package pl.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Jaka dzisiaj jest data?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String scannerDate = scanner.nextLine();

        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(scannerDate);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy",new Locale("pl"));

        System.out.println(simpleDateFormat.format(date).toUpperCase());
    }
}
