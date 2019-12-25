package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        int[] A = {1, 10, 9};
        int[] res = obj.insertionSort(A);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }

    public int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int valueToInsert = arr[i];
            int j = i;
            while (j > 0 && arr[j-1] > valueToInsert) {
                arr[j] = arr[j-1];
                j = j-1;
            }
            arr[j] = valueToInsert;
        }
        return arr;
    }

}
