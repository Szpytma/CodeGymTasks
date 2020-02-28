package pl.codegym.task.task09.task0911;

import java.util.HashMap;

/* 
Wyjątek podczas pracy z kolekcjami Map
*/

public class Solution {
    public static void main(String[] args) throws NullPointerException {

        try {

            HashMap<String, String> mapa = new HashMap<>(null);
            mapa.put(null, null);
            mapa.remove(null);
            System.out.println(mapa);
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}
