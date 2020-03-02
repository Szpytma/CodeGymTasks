package pl.codegym.task.task09.task0929;

import java.io.*;

/* 
Sprawmy, by kod robił coś pożytecznego!
*/

public class Solution {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String plikZrodlowyNazwa = reader.readLine();

    InputStream plikStrumienWejsciowy;
    OutputStream plikStrumienWyjsciowy;
    int dane;
    try {
      plikStrumienWejsciowy = getInputStream(plikZrodlowyNazwa);
    } catch (IOException e) {
      System.out.println("Plik nie istnieje.");
      plikZrodlowyNazwa = reader.readLine();
      plikStrumienWejsciowy = getInputStream(plikZrodlowyNazwa);
    }
    String plikDocelowyNazwa = reader.readLine();
    plikStrumienWyjsciowy = getOutputStream(plikDocelowyNazwa);
    while (plikStrumienWejsciowy.available() > 0) {
      dane = plikStrumienWejsciowy.read();
      plikStrumienWyjsciowy.write(dane);
    }

    plikStrumienWejsciowy.close();
    plikStrumienWyjsciowy.close();

  }

  public static InputStream getInputStream(String nazwaPliku) throws IOException {
    return new FileInputStream(nazwaPliku);
  }

  public static OutputStream getOutputStream(String nazwaPliku) throws IOException {
    return new FileOutputStream(nazwaPliku);
  }
}

