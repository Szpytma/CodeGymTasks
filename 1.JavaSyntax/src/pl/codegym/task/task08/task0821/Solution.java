package pl.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Współdzielone nazwiska i imiona
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> mapa = utworzListLudzi();
        printListLudzi(mapa);
    }

    public static Map<String, String> utworzListLudzi() {
        Map<String, String> map = new HashMap<>();
        //tutaj wpisz swój kod
        map.put("Szpytma", "Pawel");
        map.put("Hesmer", "Alex");
        map.put("Panker", "Beatrix");
        map.put("Dasic", "Andrea");
        map.put("Dasic", "Keno");
        map.put("Trice", "Anton");
        map.put("Sage", "Molly");
        map.put("Second", "Molly");
        map.put("Bearman", "Alex");
        map.put("Grumpy", "Andrzej");

        return map;
    }

    public static void printListLudzi(Map<String, String> mapa) {
        for (Map.Entry<String, String> s : mapa.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
