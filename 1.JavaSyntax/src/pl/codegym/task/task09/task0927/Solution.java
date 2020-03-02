package pl.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Dziesięć kotów
*/

public class Solution {

  public static void main(String[] args) {
    Map<String, Cat> map = createMap();
    Set<Cat> set = converMapToSet(map);
    printCatSet(set);
  }

  public static Map<String, Cat> createMap() {
    Map<String, Cat> catsMap = new HashMap<>();
    catsMap.put("Filomon", new Cat("Filomon"));
    catsMap.put("Bonifacy", new Cat("Bonifacy"));
    catsMap.put("Andrzej", new Cat("Andrzej"));
    catsMap.put("Pawel", new Cat("Pawel"));
    catsMap.put("Mruczek", new Cat("Mruczek"));
    catsMap.put("Bury", new Cat("Bury"));
    catsMap.put("Rudy", new Cat("Rudy"));
    catsMap.put("Bialas", new Cat("Bialas"));
    catsMap.put("Smolarz", new Cat("Smolarz"));
    catsMap.put("Kotopies", new Cat("Kotopies"));

    return catsMap;
  }

  public static Set<Cat> converMapToSet(Map<String, Cat> map) {
    Set<Cat> catSet = new HashSet<>();
    Set<Map.Entry<String, Cat>> set = map.entrySet();
    for (Map.Entry<String, Cat> cat : set) {
      catSet.add(cat.getValue());
    }
    return catSet;
  }

  public static void printCatSet(Set<Cat> set) {
    for (Cat cat : set) {
      System.out.println(cat);
    }
  }

  public static class Cat {

    private String imie;

    public Cat(String name) {
      this.imie = name;
    }

    public String toString() {
      return "Cat " + this.imie;
    }
  }


}
