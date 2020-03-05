package pl.codegym.task.task10.task1015;

import java.util.ArrayList;

/* 
Tablica z listami ciągów
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] tablicaCiagowList = utworzList();
        printList(tablicaCiagowList);
    }

    public static ArrayList<String>[] utworzList() {
        //tutaj wpisz swój kod
        ArrayList<String>[] list = new ArrayList[5];
        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
            list[i].add("String" + i);
        }


        return list;
    }

    public static void printList(ArrayList<String>[] tablicaCiagowList) {
        for (ArrayList<String> lista : tablicaCiagowList) {
            for (String s : lista) {
                System.out.println(s);
            }
        }
    }
}