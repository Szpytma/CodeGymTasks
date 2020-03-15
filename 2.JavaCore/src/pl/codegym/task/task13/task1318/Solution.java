package pl.codegym.task.task13.task1318;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String fileName = sc.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        BufferedReader bf = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = bf.readLine()) != null) {
            System.out.println(line);
        }
        sc.close();
        inputStream.close();
        bf.close();
    }
}