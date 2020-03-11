package pl.codegym.task.task12.task1233;

/* 
Nadchodzą izomorfy
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

    Pair<Integer, Integer> result = getMinimumAndIndex(data);

    System.out.println("Minimum is  " + result.x);
    System.out.println("Index of minimum element is " + result.y);
  }

  public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {

    if (array == null || array.length == 0) {
      return new Pair<>(null, null);
    }
    int min = array[0];
    int x = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
        x = i;
      }

    }

    //tutaj wpisz swój kod

    return new Pair<>(min, x);
  }

  public static class Pair<X, Y> {

    public X x;
    public Y y;

    public Pair(X x, Y y) {
      this.x = x;
      this.y = y;
    }
  }
}
