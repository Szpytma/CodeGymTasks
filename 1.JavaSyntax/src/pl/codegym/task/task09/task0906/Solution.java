package pl.codegym.task.task09.task0906;

/* 
Logowanie śladów stosu
*/

public class Solution {

  public static void main(String[] args) {
    log("W metodzie main");
  }

  public static void log(String s) {

    StackTraceElement[] stack = Thread.currentThread().getStackTrace();
    String className = stack[2].getClassName();
    String methodName = stack[2].getMethodName();

    System.out.println(className + ": " + methodName + ": " + s);
  }
}
