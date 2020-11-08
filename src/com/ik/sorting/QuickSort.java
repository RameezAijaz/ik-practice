package com.ik.sorting;

import com.ik.utils.Util;

import java.util.Arrays;

public class QuickSort {

    private static void sortRecurseHelper(int[] arr, int start, int end){

        if(start>=end)
            return;

        int random = Util.getRandomNumberInRange(start, end+1);
        int pivot = arr[random];
        Util.swap(arr, start, random);
        int i=start, j;

        for(j=start+1; j<=end; j++){
            if(arr[j]>pivot){
                continue;
            }
            ++i;
            if(i<j)
                Util.swap(arr, i, j);
        }
        Util.swap(arr, i, start);

        sortRecurseHelper(arr, start, i-1);
        sortRecurseHelper(arr, i+1, end);
    }
    public static void sort(int [] arr){
        sortRecurseHelper(arr, 0, arr.length-1);
    }


    public static void testQuickSort(int[] arr){
        System.out.println("***** Quick SORT *****");
        System.out.println("Original:");
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted:");
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }


}
