package com.ik.utils;

import java.util.Random;

public class Util {
    public static void swap(int [] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static int getRandomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    public static int findMinIndex(int[] arr, int start, int end) {
        int min = Integer.MAX_VALUE, minIndex=start;

        for(int j=start; j<end; j++){
            if(min>arr[j]){
                min = arr[j];
                minIndex = j;
            }
        }

        return minIndex;
    }
    public static int findMaxIndex(int[] arr, int start, int end) {
        int max = Integer.MIN_VALUE, maxIndex=start;
        for(int j=start; j<end; j++){
            if(max<arr[j]){
                max = arr[j];
                maxIndex = j;
            }
        }
        return maxIndex;
    }
}
