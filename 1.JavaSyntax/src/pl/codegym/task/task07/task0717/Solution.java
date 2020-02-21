package pl.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Duplikowanie słów
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    // Czyta ciągi z konsoli i deklaruje tutaj ArrayList

    ArrayList<String> lista = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
      lista.add(scanner.nextLine());
    }
    ArrayList<String> wynik = doubleValues(lista);

    for (String s : wynik) {
      System.out.println(s);

    }

    // Wyświetla wynik
  }

  public static ArrayList<String> doubleValues(ArrayList<String> lista) {
    //tutaj wpisz swój kod
    for (int i = 0; i < lista.size(); i += 2) {
      lista.add(i, lista.get(i));
    }
    return lista;
  }
}
