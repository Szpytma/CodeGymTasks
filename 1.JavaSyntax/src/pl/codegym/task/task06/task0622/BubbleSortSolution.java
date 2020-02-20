package pl.codegym.task.task06.task0622;

import java.util.Scanner;

public class BubbleSortSolution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[5];

    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
    }
    ascSort(array);
    printArray(array);
    descSort(array);
    printArray(array);
  }

  private static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);

    }
  }

  private static void ascSort(int[] array) {
    int tempNumber;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if (array[i] < array[j]) {
          tempNumber = array[i];
          array[i] = array[j];
          array[j] = tempNumber;
        }
      }
    }
  }

  private static void descSort(int[] array) {
    int tempNumber;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if (array[i] > array[j]) {
          tempNumber = array[i];
          array[i] = array[j];
          array[j] = tempNumber;
        }
      }
    }
  }
}
