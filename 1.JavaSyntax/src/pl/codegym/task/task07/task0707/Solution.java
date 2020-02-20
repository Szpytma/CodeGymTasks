package pl.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
Co to za rodzaj listy?
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    ArrayList<String> list = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      list.add(String.valueOf(i));
    }
    System.out.println(list.size());
    for (String i : list) {
      System.out.println(i);
    }
  }
}
