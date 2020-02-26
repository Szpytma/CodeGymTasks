package pl.codegym.task.task08.task0828;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/* 
Numer miesiąca
*/

public class Solution {

  public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);
      String monthName = scanner.nextLine();

    /*Map<String, Integer> mapMonth = new HashMap<>();
    mapMonth.put("Styczeń", 1);
    mapMonth.put("Luty", 2);
    mapMonth.put("Marzec", 3);
    mapMonth.put("Kwiecień", 4);
    mapMonth.put("Maj", 5);
    mapMonth.put("Czerwiec", 6);
    mapMonth.put("Lipiec", 7);
    mapMonth.put("Sierpień", 8);
    mapMonth.put("Wrzesień", 9);
    mapMonth.put("Październk", 10);
    mapMonth.put("Listopad", 11);
    mapMonth.put("Grudzień", 12);
*/

    /*for (Map.Entry<String, Integer> pair : mapMonth.entrySet()) {
      String key = pair.getKey();
      Integer value = pair.getValue();
      if (key.equals(monthName)) {
        System.out.println(key + " to miesiąc nr " + value);
      }
    }*/

    ArrayList<String> ar = new ArrayList<>();
    ar.add("Styczeń");
    ar.add("Luty");
    ar.add("Marzec");
    ar.add("Kwiecień");
    ar.add("Maj");
    ar.add("Czerwiec");
    ar.add("Lipiec");
    ar.add("Sierpień");
    ar.add("Wrzesień");
    ar.add("Październik");
    ar.add("Listopad");
    ar.add("Grudzień");
    for (int i = 0; i < ar.size(); i++) {
      if (ar.get(i).toUpperCase().equals(monthName.toUpperCase())) {
        String text = ar.get(i) + " to miesiąc nr " + (i + 1);
        System.out.println(text);
        break;
      }
    }
    /*List<String> months = Arrays
        .asList("Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec", "Lipiec", "Sierpień",
            "Wrzesień", "Październk", "Listopad", "Grudzień");
    System.out.println(monthName + "to miesiąc o nr " + (months.indexOf(monthName) + 1));*/
  }
}