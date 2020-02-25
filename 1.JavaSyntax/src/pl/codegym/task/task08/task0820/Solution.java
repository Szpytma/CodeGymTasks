package pl.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Zwierzęcy secik
*/

public class Solution {

  public static void main(String[] args) {
    Set<Cat> cats = createCats();
    Set<Dog> dogs = createDogs();

    Set<Object> animals = add(cats, dogs);
    printAnimals(animals);

    removeCats(animals, cats);
    printAnimals(animals);
  }

  public static Set<Cat> createCats() {
    HashSet<Cat> catHashSet = new HashSet<>();
    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
    Cat cat3 = new Cat();
    Cat cat4 = new Cat();

    catHashSet.add(cat1);
    catHashSet.add(cat2);
    catHashSet.add(cat3);
    catHashSet.add(cat4);

    return catHashSet;
  }

  public static Set<Dog> createDogs() {
    HashSet<Dog> dogHashSet = new HashSet<Dog>();
    Dog dog1 = new Dog();
    Dog dog2 = new Dog();
    Dog dog3 = new Dog();

    dogHashSet.add(dog1);
    dogHashSet.add(dog2);
    dogHashSet.add(dog3);

    return dogHashSet;
  }

  public static Set<Object> add(Set<Cat> cats, Set<Dog> dogs) {
    Set<Object> objectSet = new HashSet<>();
    objectSet.addAll(cats);
    objectSet.addAll(dogs);
    return objectSet;
  }

  public static void removeCats(Set<Object> animals, Set<Cat> cats) {
      animals.removeAll(cats);
    //tutaj wpisz swój kod
  }

  public static void printAnimals(Set<Object> animals) {
    for (Object o : animals) {
      System.out.println(o);
    }
  }

  public static class Cat {


  }

  public static class Dog {


  }


}
