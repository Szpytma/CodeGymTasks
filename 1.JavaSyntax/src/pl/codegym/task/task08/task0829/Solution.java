package pl.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Aktualizacja oprogramowania
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> cities = new ArrayList<>();
        List<String> families = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;
            families.add(family);

            String city = reader.readLine();
            cities.add(city);
        }


        String familyReq = reader.readLine();

        if (families.contains(familyReq)) {
            System.out.println(cities.get(families.indexOf(familyReq)));
        }
        else {
            System.out.println("Not on system");
        }
    }
}