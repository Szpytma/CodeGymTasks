package pl.codegym.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Plik w bloku statycznym
*/

public class Solution {
    public static List<String> lines = new ArrayList<>();

    static {
        try (BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME))) {
            String s;
            while ((s = reader.readLine()) != null) {
                lines.add(s);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
