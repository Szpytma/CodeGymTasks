package pl.codegym.task.task12.task1205;

/* 
Identyfikacja zwierząt
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {

        if (o instanceof Cow|| o instanceof Dog || o instanceof Whale) {
            //return  o.getClass().getSimpleName();
            return getClassName(o);
        }
     /*   if (o instanceof Dog) {
            return getClassName(o);
        }
        if (o instanceof Whale) {
            return getClassName(o);
        }*/
        return "Unknown Animal";
    }

    private static String getClassName(Object o) {
        return o.getClass().getSimpleName();
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
