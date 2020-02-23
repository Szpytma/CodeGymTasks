package pl.codegym.task.task08.task0802;

/* 
HashMap z 10 par
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        HashMap<String, String> plants = new HashMap<>();
        plants.put("Watermelon", "Fruit");
        plants.put("Banana", "Fruit");
        plants.put("Cherry", "Fruit");
        plants.put("Pear", "Fruit");
        plants.put("Cantaloupe", "Fruit");
        plants.put("Berry", "Fruit");
        plants.put("Ginseng", "rOOT");
        plants.put("Strawberry", "Fruit");
        plants.put("Fleur-de-lis", "Flower");
        plants.put("Potato", "Vegetable");

        for (Map.Entry<String, String> pair : plants.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
      /*  while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }*/

        /*for (HashMap.Entry<String, String> para : plants.entrySet()) {
            System.out.println(para);
        }*/
    }
}
