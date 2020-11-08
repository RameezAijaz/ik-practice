package com.ik.sorting;

import com.ik.utils.Util;

import java.util.Arrays;

public class InsertionSort {

    public static void sortIterative(int[] arr){
        //Sorting Bottom Up using Iteration
        for(int i=1; i<arr.length; i++){
            int ith = arr[i];
            int j;
            for(j=i; j>0 && arr[j-1]>ith; j--){
                arr[j] = arr[j-1];
            }
            arr[j] = ith;
        }
    }
    public static void sortRecursion(int[] arr){
        //Sorting Top Down using recursion
        sortRecursionUtil( arr, arr.length-1 );

    }

    private static void sortRecursionUtil(int[] arr, int n) {
        if(n<1)
            return;

        sortRecursionUtil(arr, n-1);

        int nthInt = arr[n];

        while(n>0 && arr[n-1] > nthInt){
            arr[n] = arr[n-1];
            n--;
        }
        arr[n] = nthInt;

    }

    public static void testInsertionSortRecursion(int[] arr){
        System.out.println("***** Insertion SORT (Iterative/Bottom Up) *****");
        System.out.println("Original:");
        System.out.println(Arrays.toString(arr));
        sortIterative(arr);
        System.out.println("Sorted:");
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void testInsertionSortIteration(int[] arr){
        System.out.println("***** Insertion SORT (Recursive/Top Down) *****");
        System.out.println("Original:");
        System.out.println(Arrays.toString(arr));
        sortRecursion(arr);
        System.out.println("Sorted:");
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
}
