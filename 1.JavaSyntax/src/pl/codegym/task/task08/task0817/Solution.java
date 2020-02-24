package pl.codegym.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Powtórzenia nie są potrzebne
*/

public class Solution {

  public static HashMap<String, String> utworzMap() {
    //tutaj wpisz swój kod
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
  public static void usunPowtorzoneImiona(Map<String, String> mapa) {
      ArrayList<String> list =  new ArrayList<>(mapa.values());
      int count;
      for (String str : list) {
          count = 0;
          for (String str2 : list) {
              if (str.equals(str2))
                  count++;
              if (count==2) usunElementZMapPoWartosci (mapa, str);
          }
      }
  }

  public static void usunElementZMapPoWartosci(Map<String, String> mapa, String wartosc) {
    HashMap<String, String> kopia = new HashMap<>(mapa);
    for (Map.Entry<String, String> para : kopia.entrySet()) {
      if (para.getValue().equals(wartosc)) {
        mapa.remove(para.getKey());
      }
    }
  }

  public static void main(String[] args) {
      usunPowtorzoneImiona(utworzMap());

  }
}
