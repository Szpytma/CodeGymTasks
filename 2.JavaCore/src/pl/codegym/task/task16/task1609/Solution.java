package pl.codegym.task.task16.task1609;

/* 
Sprawiedliwość
*/

public class Solution {
    public static void main(String[] args)  {
        new Mouse("#1");
        new Mouse("#2");
        new Mouse("#3");
    }

    private static void eat() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignored) {
        }
    }

    public static class Mouse extends Thread {
        public Mouse(String name) {
            super(name);
            start();
        }

        public void run() {
            System.out.println(getName() + " zaczyna jeść");
            eat();
            System.out.println(getName() + " skończył jeść");
        }
    }
}
