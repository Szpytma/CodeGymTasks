package pl.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Tylko dla bogaczy
*/

public class Solution {

  public static HashMap<String, Integer> utworzMap() {
    //tutaj wpisz swój kod
    HashMap<String, Integer> hashMap = new HashMap<>();
    hashMap.put("Szpytma", 19000);
    hashMap.put("Deer", 38000);
    hashMap.put("Hesmer", 400);
    hashMap.put("Worcester", 100);
    hashMap.put("Panker", 23000);
    hashMap.put("Dacis", 19000);
    hashMap.put("Gulan", 500);
    hashMap.put("Ward", 500);
    hashMap.put("Meh", 500);
    hashMap.put("Towers", 500);
      return hashMap;
  }

  public static void usunPozycjeZmap(HashMap<String, Integer> map) {
    //tutaj wpisz swój kod
      Iterator<Map.Entry<String, Integer>> entryIterator = map.entrySet().iterator();

      while (entryIterator.hasNext()) {
          HashMap.Entry<String, Integer> pair = entryIterator.next();
          if ((Integer)pair.getValue() < 500) {
              entryIterator.remove();

          }
      }

  }

  public static void main(String[] args) {

      HashMap<String, Integer> map = utworzMap();
      System.out.println(map);
      System.out.println();
      usunPozycjeZmap(map);
      System.out.println(map);
  }
}