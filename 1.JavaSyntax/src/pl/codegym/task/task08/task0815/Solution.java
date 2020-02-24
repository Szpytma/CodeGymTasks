package pl.codegym.task.task08.task0815;

import java.util.HashMap;

/* 
Spis ludności
*/

public class Solution {
  public static HashMap<String, String> createMap() {

    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("Kowalski", "Pawel");
    hashMap.put("Benedykt", "Pawel");
    hashMap.put("Smith", "Josh");
    hashMap.put("Gibson", "Danielle");
    hashMap.put("Deer", "Danielle");
    hashMap.put("Hesmer", "Hes");
    hashMap.put("Dasic", "Andrea");
    hashMap.put("Panker", "Beatrix");
    hashMap.put("Iness", "India");
    hashMap.put("Lucy", "Steph");

    return hashMap;
  }

  public static int countThisSameName(HashMap<String, String> map, String name) {
    //tutaj wpisz swój kod
    int count = 0;
    for (String s : map.values()) {
        if (s.equals(name)) {
            count++;
        }
    }
      return count;

  }


  public static int countThisSameSurname(HashMap<String, String> map, String surname) {
    //tutaj wpisz swój kod
      int count = 0;
      for (String s : map.keySet()) {
          if (s.equals(surname)) {
              count++;
          }
      }
      return count;
  }

  public static void main(String[] args) {

      System.out.println(countThisSameName(createMap(), "Pawel"));
      System.out.println(countThisSameSurname(createMap(), "Panker"));
  }
}
