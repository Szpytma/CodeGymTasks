package pl.codegym.task.task08.task0824;

/* 
Załóż rodzinę
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Solution {

  public static void main(String[] args) {
    ArrayList<Human> grandparentsChildren1 = new ArrayList<>();
    ArrayList<Human> grandparentsChildren2 = new ArrayList<>();
    ArrayList<Human> parentsChildrens = new ArrayList<>();

    Human grandfather1 = new Human("Jan", true, 89, grandparentsChildren1);
    Human grandmother1 = new Human("Zofia", false, 89, grandparentsChildren1);
    Human grandfather2 = new Human("Bolek", true, 89, grandparentsChildren2);
    Human grandmother2 = new Human("Lesia", false, 89, grandparentsChildren2);
    Human father = new Human("Jacek", true, 54, parentsChildrens);
    grandparentsChildren1.add(father);
    Human mother = new Human("Bozenka", false, 54, parentsChildrens);
    grandparentsChildren2.add(mother);
    Human child1 = new Human("Pawel", true, 27,new ArrayList<>());
    Human child2 = new Human("Andrzej", true, 25,new ArrayList<>());
    Human child3 = new Human("Jurek", true, 29,new ArrayList<>());
    parentsChildrens.add(child1);
    parentsChildrens.add(child2);
    parentsChildrens.add(child3);

      HashSet<Human> family = new HashSet<>();
      Collections.addAll(family, child1, child2, child3, father, mother, grandfather1, grandmother1, grandfather2, grandmother2);
      for (Human member : family) {
          System.out.println(member);
      }


  }

  public static class Human {

     String name;
     boolean sex;
     int age;
     ArrayList<Human> childrens;

    public Human(String name, boolean sex, int age,
        ArrayList<Human> childrens) {
      this.name = name;
      this.sex = sex;
      this.age = age;
      this.childrens = childrens;
    }

      public Human(String name, boolean sex, int age) {
          this.name = name;
          this.sex = sex;
          this.age = age;
      }

      public String toString() {
      String text = "";
      text += "Name: " + this.name;
      text += ", sex: " + (this.sex ? "man" : "woman");
      text += ", age: " + this.age;

      int childrenCounter = this.childrens.size();
      if (childrenCounter > 0) {
        text += ", childrens: " + this.childrens.get(0).name;

        for (int i = 1; i < childrenCounter; i++) {
          Human children = this.childrens.get(i);
          text += ", " + children.name;
        }
      }
      return text;
    }
  }

}
