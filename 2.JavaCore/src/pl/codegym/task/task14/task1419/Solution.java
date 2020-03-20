package pl.codegym.task.task14.task1419;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* 
Inwazja wyjątków
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // Pierwszy wyjątek
        try {
            float i = 1 / 0;
            System.out.println(i);

        } catch (ArithmeticException e) {
            exceptions.add(e);
        }

        try { // 9
            Class<?> testClass = Solution.class;
            Method method = testClass.getMethod("fooMethod", Solution.class);
        } catch (NoSuchMethodException e) {
            exceptions.add(e);
        }
        try {
            int[] array = new int[3];
            System.out.println(array[4]);

        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            int[] array = new int[-5];
            System.out.println(array[4]);

        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }
        try {
            new BufferedReader(new FileReader("file"));
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }
        try {
            Class test = Class.forName("pl.codegym.task.task14.task1419.Class;");
        } catch (ClassNotFoundException e) {
            exceptions.add(e);
        }
        try {
            int[] array = new int[3];
            array = null;
            System.out.println(array.length);

        } catch (NullPointerException e) {
            exceptions.add(e);
        }
        try {
            int n = Integer.parseInt("4.5");
            System.out.println(n);
        } catch (NumberFormatException  e) {
            exceptions.add(e);
        }
        try {
            Object object = Character.valueOf('a');
            System.out.println((Byte) object);

        } catch (ClassCastException  e) {
            exceptions.add(e);
        }
        try {
            String s = "ABC";
            System.out.println(s.charAt(15));
        } catch (StringIndexOutOfBoundsException  e) {
            exceptions.add(e);
        }

    }
}


