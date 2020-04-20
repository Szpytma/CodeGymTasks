package pl.codegym.task.task16.task1615;

/* 
Lotnisko
*/

public class Solution {
    public static volatile Runway RUNWAY = new Runway();   // 1 pas startowy

    public static void main(String[] args){
        new Plane("Plane #1");
        new Plane("Plane #2");
        new Plane("Plane #3");
    }

    private static void waitForTakeoff() throws InterruptedException {
        // tutaj wpisz swój kod
        Thread.sleep(100);

    }

    private static void takeOff() throws InterruptedException {
        Thread.sleep(100);

    }

    public static class Plane extends Thread {
        public Plane(String name) {
            super(name);
            start();
        }

        public void run() {
            boolean hasAlreadyTakenOff = false;
            while (!hasAlreadyTakenOff) {
                if (RUNWAY.trySetCurrentPlane(this)) {    // jeśli pas startowy jest dostępny, to go weźmiemy
                    System.out.println(getName() + " leci");
                    try {
                        takeOff();// leci
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + " na niebie");
                    hasAlreadyTakenOff = true;
                    RUNWAY.setCurrentPlane(null);
                } else if (!this.equals(RUNWAY.getCurrentPlane())) {  // jeśli pas startowy jest zajęty przez samolot
                    System.out.println(getName() + " czeka");
                    try {
                        waitForTakeoff(); // czeka
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static class Runway {
        private Thread t;

        public Thread getCurrentPlane() {
            return t;
        }

        public void setCurrentPlane(Thread t) {
            synchronized (this) {
                this.t = t;
            }
        }

        public boolean trySetCurrentPlane(Thread t) {
            synchronized (this) {
                if (this.t == null) {
                    this.t = t;
                    return true;
                }
                return false;
            }
        }
    }
}

