package com.ik.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void sortRecurseUtil(int [] arr, int start, int end){
        if(start>=end)
            return;

        int mid = (start+end)/2;

        sortRecurseUtil(arr, start, mid);
        sortRecurseUtil(arr, mid+1, end);

        int i=start, j=mid+1, index = 0;
        int[] aux = new int[end-start+1];

        while (i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                aux[index++] = arr[i++];
            }
            else {
                aux[index++] = arr[j++];
            }
        }
        while (i<=mid){
            aux[index++] = arr[i++];
        }
        while (j<=end){
            aux[index++] = arr[j++];
        }

        for(index=0; index<aux.length; index++){
            arr[start++] = aux[index];
        }
    }
    public static void sort(int [] arr){
        sortRecurseUtil(arr, 0, arr.length-1);
    }


    public static void testMergeSort(int[] arr){

        System.out.println("***** Merge SORT *****");
        System.out.println("Original:");
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted:");
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
}
