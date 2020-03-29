package pl.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Parser żądań
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String[] params = url.substring(url.indexOf('?') + 1).split("&");

        String objValue = null;
        boolean flag = false;
        for (String s : params) {
            String[] search = s.split("=", 2);
            if (search[0].equals("obj")) {
                flag = true;
                if (search.length > 1) {
                    objValue = search[1];
                }
            }
            System.out.println(search[0]+ " ");
        }
        if(flag){
            System.out.println();
            try{
                double d = Double.parseDouble(objValue);
                alert(d);
            } catch (Exception e){
                alert(objValue);
            }
        }

    }


    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
