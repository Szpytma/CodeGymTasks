package pl.codegym.task.task08.task0827;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Praca z datami
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDataNieparzysta("MAY 1 2013"));
        System.out.println(isDataNieparzysta("MAY 2 2013"));
    }

    public static boolean isDataNieparzysta(String date) {

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(new Date(date));
        return calendar.get(Calendar.DAY_OF_YEAR) % 2 != 0;
        }
    }
