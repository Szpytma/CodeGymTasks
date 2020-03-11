package pl.codegym.task.task12.task1231;

/* 
Bezużyteczna abstrakcja
*/

public class Solution {

  public static void main(String[] args) {
    Horse horse = new Pegasus();
    horse.run();

  }

  public static interface CanFly {

    public abstract void fly();
  }

  public static interface CanSwim {

    public abstract void swim();
  }

  public static class Horse {

    public void run() {

    }
  }

  public static class Pegasus extends Horse implements CanFly {

    public void fly() {

    }
  }

  public abstract static class SwimmingPegasus extends Pegasus implements CanSwim {

    public abstract void swim();
  }
}


