package pl.codegym.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Pięciu wygranych
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] array = new int[20];
    for (int i = 0; i < array.length; i++) {
      array[i] = Integer.parseInt(reader.readLine());
    }

    sort(array);

    System.out.println(array[0]);
    System.out.println(array[1]);
    System.out.println(array[2]);
    System.out.println(array[3]);
    System.out.println(array[4]);
  }

  public static void sort(int[] arr) {
      {
          int i, j, temp;
          boolean swapped;
          for (i = 0; i < arr.length - 1; i++)
          {
              swapped = false;
              for (j = 0; j < arr.length  - i - 1; j++)
              {
                  if (arr[j] < arr[j + 1])
                  {
                      // swap arr[j] and arr[j+1]
                      temp = arr[j];
                      arr[j] = arr[j + 1];
                      arr[j + 1] = temp;
                      swapped = true;
                  }
              }
              // IF no two elements were
              // swapped by inner loop, then break
              if (!swapped)
                  break;
          }
      }

  }
}
