package pl.codegym.task.task14.task1412;

/* 
Zaimplementuj metodę printMainInfo
*/

public class Solution {
    public static void main(String[] args) {
        Movable obj = new Circle();
        Drawable drawable = new Rectangle();

        printMainInfo(drawable);
        printMainInfo(obj);
    }

    public static void printMainInfo(Object object) {
        //tutaj wpisz swój kod
        if (object instanceof Movable) {
            ((Movable) object).move();
        }
        if (object instanceof Drawable) {
            ((Drawable) object).draw();

        }
    }

    static interface Movable {

        void move();
    }

    static class Circle implements Movable {

        public void draw() {
            System.out.println("Coś, co można narysować");
        }

        public void move() {
            System.out.println("Coś, co można ruszyć");
        }

    }

    interface Drawable {
        void draw();
    }

    static class Rectangle implements Drawable {
        public void draw() {
            System.out.println("Coś, co można narysować");
        }

        public void move() {
            System.out.println("Coś, co można ruszyć");
        }
    }
}
