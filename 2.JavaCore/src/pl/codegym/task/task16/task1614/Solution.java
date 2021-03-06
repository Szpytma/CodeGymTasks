package pl.codegym.task.task16.task1614;

import java.util.ArrayList;
import java.util.List;

/* 
Odliczanie
*/

public class Solution {
    public static volatile List<String> list = new ArrayList<>(5);

    static {
        for (int i = 0; i < 5; i++) {
            list.add("Linia " + i);
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Countdown(3), "Odliczanie");
        t.start();
    }

    public static class Countdown implements Runnable {
        private int countFrom;

        public Countdown(int countFrom) {
            this.countFrom = countFrom;
        }

        public void run() {
            try {
                while (countFrom > 0) {
                    printCountdown();
                }
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }

        public void printCountdown() throws InterruptedException {
            //tutaj wpisz swój kod
            Thread.sleep(500);
            countFrom--;
            System.out.println(list.get(countFrom));

        }
    }
}
