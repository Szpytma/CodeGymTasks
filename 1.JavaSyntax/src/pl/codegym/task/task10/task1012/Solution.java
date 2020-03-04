package pl.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Liczba liter
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // Polish Alphabet
    String alphabet = "aąbcćdeęfghijklłmnńoóprsśtuwyzźż";
    char[] alphabetArray = alphabet.toCharArray();

    ArrayList<Character> alphabetList = new ArrayList<>();
    for (char letter : alphabetArray) {
      alphabetList.add(letter);
    }

    // Read strings
    ArrayList<String> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      String s = reader.readLine();
      list.add(s.toLowerCase());
    }

    int[] arrayRepeat = new int[alphabetArray.length];
    for (String s : list) {
        for (int i = 0; i < s.length(); i++) {
            if (alphabetList.contains(s.charAt(i))) {
                arrayRepeat[alphabetList.indexOf(s.charAt(i))] += 1;
            }
        }
    }

    for (int i = 0; i < alphabetArray.length; i++) {
      System.out.println(alphabetList.get(i) + " " + arrayRepeat[i]);
    }
  }

}
