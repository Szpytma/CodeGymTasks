package pl.codegym.task.task16.task1610;

/* 
Przyporządkowywanie wywołań do join()
*/


public class Solution {
    public static void main(String[] args) {
        new Cat("Misia");
        new Cat("Coco");
    }

    private static void investigateWorld() throws InterruptedException {
        Thread.sleep(200);
    }

    public static class Cat extends Thread {
        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) {
            super(name);
            kitten1 = new Kitten("Kociak 1 (matka - " + getName() + ")");
            kitten2 = new Kitten("Kociak 2 (matka - " + getName() + ")");
            start();
        }

        public void run() {
            System.out.println(getName() + " urodziła 2 kocięta");
            try {
                initAllKittens();
            } catch (InterruptedException ignored) {
            }
            System.out.println(getName() + ": Wszystkie kocięta są w koszyku. " + getName() + " przyniosła je z powrotem");
        }

        private void initAllKittens() throws InterruptedException {
            kitten1.start();
            kitten1.join();
            kitten2.start();
            kitten2.join();
        }
    }

    public static class Kitten extends Thread {
        public Kitten(String name) {
            super(name);
        }

        public void run() {
            System.out.println(getName() + " wyszedł z koszyka");
            try {
                investigateWorld();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
