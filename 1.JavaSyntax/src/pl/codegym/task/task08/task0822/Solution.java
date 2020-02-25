package pl.codegym.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/* 
Najmniejsza z N liczb
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    List<Integer> listaLiczbCalkowitych = getListaLiczbCalkowitych();
    System.out.println(getMinimum(listaLiczbCalkowitych));
  }

  public static int getMinimum(List<Integer> array) {

    return Collections.min(array);
  }

  public static List<Integer> getListaLiczbCalkowitych() throws IOException {
      List<Integer> integerList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
      int size = scanner.nextInt();
      for (int i = 0; i < size; i++) {
          integerList.add(scanner.nextInt());
      }
    // Tworzy i inicjalizuje listę
    return integerList;
  }
}
