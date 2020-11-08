package com.ik.main;

import com.ik.sorting.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Sort Algorithms
        BubbleSort.testBubbleSort(new int[]{7,6,88,4,34,405,0,1,2,4,6});
        InsertionSort.testInsertionSortRecursion(new int[]{7,6,88,4,34,405,0,1,2,4,6});
        InsertionSort.testInsertionSortIteration(new int[]{7,6,88,4,34,405,0,1,2,4,6});
        SelectionSort.testSelectionSort(new int[]{7,6,88,4,34,405,0,1,2,4,6});
        MergeSort.testMergeSort(new int[]{7,6,88,4,34,405,0,1,2,4,6});
        QuickSort.testQuickSort(new int[]{7,6,88,4,34,405,0,1,2,4,6});
        HeapSort.testInplaceHeapSort(new int[]{7,6,88,4,34,405,0,1,2,4,6});
        CountingSort.testCountingSort(new int[]{7,6,88,4,34,405,0,1,2,4,6});

    }
}
