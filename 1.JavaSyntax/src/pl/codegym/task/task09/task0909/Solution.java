package pl.codegym.task.task09.task0909;

/* 
Wyjątek podczas pracy z tablicami
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {

        try {
            int[] m = new int[2];
            m[8] = 5;
            System.out.println(Arrays.toString(m));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());

        }

    }
}
