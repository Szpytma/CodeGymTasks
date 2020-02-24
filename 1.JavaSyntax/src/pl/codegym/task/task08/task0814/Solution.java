package pl.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Większa niż 10? Wcale do nas nie pasujesz!
*/

public class Solution {

  public static HashSet<Integer> utworzSet() {
    // tutaj wpisz swój kod
    HashSet<Integer> stringSet = new HashSet<>();
    for (int i = 0; i < 20; i++) {
      stringSet.add(i);
    }
    return stringSet;

  }

  public static HashSet<Integer> usunLiczbyWiekszeNiz10(HashSet<Integer> set) {
    // tutaj wpisz swój kod
    Iterator<Integer> iterator = set.iterator();
    while (iterator.hasNext()) {
      if (iterator.next() > 10) {
        iterator.remove();
      }
    }


    /*set.removeIf(integer -> integer > 10);*/

    return set;

  }

  public static void main(String[] args) {

  }
}
