package pl.codegym.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Praktyka z blokami statycznymi
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        if (string.equals("helikopter")) {
            result = new Helicopter();
        } else if (string.equals("samolot")) {
            int passengersCount = Integer.parseInt(br.readLine());
            result = new Plane(passengersCount);
        }
        br.close();
    }
}

