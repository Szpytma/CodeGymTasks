package pl.codegym.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Zapisywanie do pliku z konsoli
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // create input stream
        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        //enter filename
        String fileName = bufferedReader.readLine();

        //create string list
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String string = bufferedReader.readLine();
            list.add(string);
            if (string.equals("exit")) break;
        }

        //create file writer
        FileWriter writer = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        //write strings to file
        for (String string : list) {
            bufferedWriter.write(string);
            bufferedWriter.newLine();
        }
        //close streams
        inputStream.close();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
