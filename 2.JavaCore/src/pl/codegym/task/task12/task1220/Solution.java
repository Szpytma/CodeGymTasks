package pl.codegym.task.task12.task1220;

/* 
Klasa Human i interfejsy CanRun i CanSwim
*/

public class Solution {

  public static void main(String[] args) {

  }

  // Add public interfaces and a public class here
  public abstract class Human implements CanRun, CanSwim {

  }

  public interface CanRun {

    public void run();

  }

  public interface CanSwim {

    public void swim();
  }
}
