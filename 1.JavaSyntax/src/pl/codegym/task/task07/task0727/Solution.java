package pl.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Zmiana funkcjonalności
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            lista.add(s);
        }

      /*  ArrayList<String> listaWielkimiLiterami = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            String s = lista.get(i);
            listaWielkimiLiterami.add(s.toUpperCase());
        }

        for (int i = 0; i < listaWielkimiLiterami.size(); i++) {
            System.out.println(listaWielkimiLiterami.get(i));
        }*/

        ArrayList<String> newList = new ArrayList<>();
        for (String value : lista) {
            if (value.length() % 2 == 0) {
                newList.add(value + " " + value);
            } else
                newList.add(value + " " + value + " " + value);
        }


        for (String s : newList) {
            System.out.println(s);

        }
    }
}
