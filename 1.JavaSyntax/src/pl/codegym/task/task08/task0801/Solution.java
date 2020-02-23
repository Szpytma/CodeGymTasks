package pl.codegym.task.task08.task0801;

/* 
Plants HashSet
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        HashSet<String> plants = new HashSet<>();
        plants.add("Watermelon");
        plants.add("Banana");
        plants.add("Cherry");
        plants.add("Pear");
        plants.add("Cantaloupe");
        plants.add("Berry");
        plants.add("Ginseng");
        plants.add("Strawberry");
        plants.add("Fleur-de-lis");
        plants.add("Potato");


        for (String s : plants) {
            System.out.println(s);

        }
    }
}
