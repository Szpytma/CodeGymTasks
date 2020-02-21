package pl.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Więcej Ala ma kota
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    //tutaj wpisz swój kod
    ArrayList<String> list = new ArrayList<>();
      String as = "As";
    list.add("Ala");
    list.add("ma");
    list.add("kota");

      for (int i = 0; i < list.size(); i+=2) {
          list.add(i+1,as);
      }


    for (String s : list) {
        System.out.println(s);
    }

  }
}

