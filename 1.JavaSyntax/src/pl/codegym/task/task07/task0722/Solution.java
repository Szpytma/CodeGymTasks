package pl.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Koniec
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        boolean isEnd = false;
        while (!isEnd) {
            String s = reader.readLine();
            if (s.equals("end"))
                isEnd = true;
            else
                list.add(s);
        }
        for (String s : list) System.out.println(s);
    }
}
