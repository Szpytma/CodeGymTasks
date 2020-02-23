package pl.codegym.task.task08.task0806;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
HashMap Obiektów
*/

public class Solution {
    public static void main(String[] args) {
        HashMap<String, Object> mapa = new HashMap<>();
        mapa.put("Sim", 5);
        mapa.put("Tom", 5.5);
        mapa.put("Arbus", false);
        mapa.put("Dzieciak", null);
        mapa.put("Kot", "Kot");
        mapa.put("Je", 56L);
        mapa.put("Jedzonko", '3');
        mapa.put("Gevey", '6');
        mapa.put("Przytulas", 111111111111L);
        mapa.put("Comp", (double) 123);


        for (Map.Entry<String, Object> entry : mapa.entrySet()) {
            System.out.println(entry.getKey()+ " - " + entry.getValue());

        }

    }
}
