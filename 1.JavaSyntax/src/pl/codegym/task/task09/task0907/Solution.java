package pl.codegym.task.task09.task0907;

/* 
Korzystanie z wyjątków przy pracy z liczbami
*/

public class Solution {
    public static void main(String[] args) {

        try {
            int a = 42 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }

    }
}
