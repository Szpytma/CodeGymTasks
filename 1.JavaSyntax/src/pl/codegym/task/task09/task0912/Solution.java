package pl.codegym.task.task09.task0912;

/* 
Korzystanie z wyjątków przy pracy z liczbami
*/

public class Solution {
    public static void main(String[] args) throws NumberFormatException {

        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e.toString());

        }

    }
}
