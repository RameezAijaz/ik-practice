package com.ik.sorting;

import java.util.Arrays;

import static com.ik.utils.Util.swap;

public class BubbleSort {
    public static void sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            boolean isSwap = false;
            for(int j=arr.length-1; j>i; j--){
                if(arr[j]<arr[j-1]){
                    isSwap = true;
                    swap(arr, j, j-1);
                }
            }
            if(!isSwap)
                break;
        }
    }
    public static void testBubbleSort(int[] arr){

        System.out.println("***** BUBBLE SORT *****");
        System.out.println("Original:");
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted:");
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
}

