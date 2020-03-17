package pl.codegym.task.task14.task1404;

/* 
Koty
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        //tutaj wpisz swój kod
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String key = scanner.nextLine();
            if (key.isEmpty()) {
                break;
            }
            Cat cat = CatFactory.getCatByKey(key);
            System.out.println(cat.toString());
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat;
            if ("szefu".equals(key)) {
                cat = new MaleCat("Duży chłopiec");
            } else if ("kocica".equals(key)) {
                cat = new FemaleCat("Mania");
            } else if ("kafel".equals(key)) {
                cat = new FemaleCat("Dachówka");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Jestem " + getName() + ", podwórkowy kocur";
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Jestem super kocur i nazywam się " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Jestem słodką kicią i na imię mi " + getName();
        }
    }
}
