package pl.codegym.task.task09.task0926;

import java.util.ArrayList;

/*
List of arrays with numbers
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> lista = createList();
        printLista(lista);
    }

    public static ArrayList<int[]> createList() {
        //Method will create a 5 elements list of arrays with various number of elements
        ArrayList<int[]> arrayList = new ArrayList<>();//Creating arrayList which will store other arrays
        int[] array1 = {1, 2, 3, 4, 5}; //Declaring 5 element array
        int[] array2 = {60,15}; //Declaring 2 element array
        int[] array3 = {10,20,30,40}; //Declaring 4 element array
        int[] array4 = {7,6,5,4,3,2,1}; //Declaring 7 element array
        int[] array5 = {}; //Declaring empty array

        //adding all arrays to arrayList
        arrayList.add(array1);
        arrayList.add(array2);
        arrayList.add(array3);
        arrayList.add(array4);
        arrayList.add(array5);

        //returning all arrays
        return arrayList;
    }

    public static void printLista(ArrayList<int[]> lista) {
        for (int[] tablica : lista) {
            for (int x : tablica) {
                System.out.println(x);
            }
        }
    }
}
