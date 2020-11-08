package com.ik.sorting;

import com.ik.utils.Util;

import java.util.Arrays;

public class HeapSort {
    private static int size = 0;

    private static int getParent(int i){
        return (i+1)/2;
    }
    private static int getLeftChild(int i){
        return (i*2) + 1;
    }
    private static int getRightChild(int i){
        return (i*2)+2;
    }
    private static void heapifyDown(int[] arr, int i){

        int leftInd = getLeftChild(i);
        int rightInd = getRightChild(i);

        while(leftInd < size && rightInd<size && (arr[i]<arr[leftInd] || arr[i]<arr[rightInd])){

            int left = arr[leftInd];
            int right = arr[rightInd];

            if(arr[i]<left && arr[i]<right){
                Util.swap(arr, i, left<right?rightInd:leftInd);
                i=left<right?rightInd:leftInd;
            }
            else if(arr[i]<left){
                Util.swap(arr, i, leftInd);
                i=leftInd;
            }
            else {
                Util.swap(arr, i, rightInd);
                i=rightInd;
            }

            leftInd = getLeftChild(i);
            rightInd = getRightChild(i);
        }
        while (leftInd<size && arr[i]<arr[leftInd]){
            Util.swap(arr, i, leftInd);
            i=leftInd;
            leftInd = getLeftChild(i);
        }

    }
    private static int extractMax(int[] arr){
        int max = arr[0];
        Util.swap(arr, 0, size-1);
        size--;
        heapifyDown(arr, 0);
        return max;
    }
    private static void buildHeap(int[] arr){
        for(int i=arr.length-1; i>=0; i--){
            heapifyDown(arr,i);
        }
    }
    public static void inPlaceSort(int[] arr){
        HeapSort.size =  arr.length;
        buildHeap(arr);
        while(size>0){
            extractMax(arr);
        }
    }

    public static void testInplaceHeapSort(int[] arr){
        System.out.println("***** HEAP SORT INPLACE *****");
        System.out.println("Original:");
        System.out.println(Arrays.toString(arr));
        inPlaceSort(arr);
        System.out.println("Sorted:");
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
}
