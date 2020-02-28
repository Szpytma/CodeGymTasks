package pl.codegym.task.task09.task0910;

import java.util.ArrayList;

/* 
Wyjątek podczas pracy z kolekcjami List
*/

public class Solution {
    public static void main(String[] args) throws IndexOutOfBoundsException {

        try {
            ArrayList<String> lista = new ArrayList<>();
            String s = lista.get(18);
            System.out.println(s);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
}