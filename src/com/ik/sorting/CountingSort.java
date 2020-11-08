package com.ik.sorting;

import com.ik.utils.Util;

import java.util.Arrays;

public class CountingSort {

    public static void sort(int[] arr){
        int min = arr[Util.findMinIndex(arr, 0, arr.length)],
                max = arr[Util.findMaxIndex(arr, 0, arr.length)],
                range = max-min+1;

        int[] aux = new int[range];

        for (int j : arr) {
            aux[j - min]++;
        }

        int index  = 0;
        for(int i=0; i<aux.length; i++){
            while(aux[i]>0){
                arr[index] = i+min;
                index++;
                aux[i]--;
            }
        }
    }


    public static void testCountingSort(int[] arr){

        System.out.println("***** Counting SORT *****");
        System.out.println("Original:");
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted:");
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
}
