package pl.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Koci Set
*/

public class Solution {

  public static void main(String[] args) {
    Set<Cat> cats = createCat();

    Iterator<Cat> iterator = cats.iterator();
    cats.remove(iterator.next());

    printCats(cats);
  }

  public static Set<Cat> createCat() {
    Set<Cat> cats = new HashSet<>();
    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
    Cat cat3 = new Cat();
    cats.add(cat1);
    cats.add(cat2);
    cats.add(cat3);
    return cats;
  }

  public static void printCats(Set<Cat> cats) {
    for (Cat cat : cats) {
      System.out.println(cat);
    }

  }

  public static class Cat {

    public Cat() {
    }
  }
}
