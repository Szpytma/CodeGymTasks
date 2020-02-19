package pl.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Bank-świnka na bazie konsoli
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    //tutaj wpisz swój kod
    InputStream in;
    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    int sum = 0;
    while (true) {
      String s = buffer.readLine();
        if (s.equals("sumuj")) {
            break;
        } else {
            int a = Integer.parseInt(s);
            sum += a;
        }
    }
      System.out.println(sum);
  }
}
