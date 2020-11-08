package com.ik.sorting;

import com.ik.utils.Util;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] arr){

        for(int i=0; i<arr.length-1; i++){

            int minIndex = Util.findMinIndex(arr, i, arr.length);
            Util.swap(arr, minIndex, i);

        }

    }

    public static void testSelectionSort(int[] arr){

        System.out.println("***** SELECTION SORT *****");

        System.out.println("Original:");
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted:");
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
}
