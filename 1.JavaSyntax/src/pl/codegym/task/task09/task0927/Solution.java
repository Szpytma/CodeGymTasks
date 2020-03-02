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
    Map<String, Kot> mapa = utworzMap();
    Set<Kot> set = konwertujMapDoSet(mapa);
    printSetKotow(set);
  }

  public static Map<String, Kot> utworzMap() {
    Map<String, Kot> stringKotMap = new HashMap<>();
    stringKotMap.put("Filomon", new Kot("Filomon"));
    stringKotMap.put("Bonifacy", new Kot("Bonifacy"));
    stringKotMap.put("Andrzej", new Kot("Andrzej"));
    stringKotMap.put("Pawel", new Kot("Pawel"));
    stringKotMap.put("Mruczek", new Kot("Mruczek"));
    stringKotMap.put("Bury", new Kot("Bury"));
    stringKotMap.put("Rudy", new Kot("Rudy"));
    stringKotMap.put("Bialas", new Kot("Bialas"));
    stringKotMap.put("Smolarz", new Kot("Smolarz"));
    stringKotMap.put("Kotopies", new Kot("Kotopies"));

    return stringKotMap;
  }

  public static Set<Kot> konwertujMapDoSet(Map<String, Kot> mapa) {
    Set<Kot> catSet = new HashSet<>();
    Set<Map.Entry<String, Kot>> set = mapa.entrySet();
    for (Map.Entry<String, Kot> cat : set) {
      catSet.add(cat.getValue());
    }
    return catSet;
  }

  public static void printSetKotow(Set<Kot> set) {
    for (Kot kot : set) {
      System.out.println(kot);
    }
  }

  public static class Kot {

    private String imie;

    public Kot(String imie) {
      this.imie = imie;
    }

    public String toString() {
      return "Kot " + this.imie;
    }
  }


}
