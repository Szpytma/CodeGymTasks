package pl.codegym.task.task10.task1013;

/* 
Konstruktory klasy Ludzie
*/

import java.awt.Color;

public class Solution {

  public static void main(String[] args) {
  }

  public static class Ludzie {

    private String name;
    private String surname;
    private int age;
    private char sex;
    private String eyeColour;
    private Ludzie parent;

    public Ludzie() {
    }

    public Ludzie(String name) {
      this.name = name;
    }

    public Ludzie(Ludzie parent) {
      this.parent = parent;
    }

    public Ludzie(char sex) {
      this.sex = sex;
    }

    public Ludzie(int age) {
      this.age = age;
    }

    public Ludzie(String name, String surname) {
      this.name = name;
      this.surname = surname;
    }

    public Ludzie(int age, char sex) {
      this.age = age;
      this.sex = sex;
    }

    public Ludzie(String eyeColour, Ludzie parent) {
      this.eyeColour = eyeColour;
      this.parent = parent;
    }

    public Ludzie(String name, String surname, int age, char sex, String eyeColour,
        Ludzie parent) {
      this.name = name;
      this.surname = surname;
      this.age = age;
      this.sex = sex;
      this.eyeColour = eyeColour;
      this.parent = parent;
    }


    public Ludzie(String name, String surname, String eyeColour) {
      this.name = name;
      this.surname = surname;
      this.eyeColour = eyeColour;
    }
  }
}
