package pl.codegym.task.task09.task0908;

/* 
Wyjątki przy pracy z ciągami
*/

public class Solution {
    public static void main(String[] args) throws NullPointerException {

        try {
            String s = null;
            String m = s.toLowerCase();
            System.out.println(m);

        } catch (NullPointerException e) {
            System.out.println(e.toString());

        }

    }
}
