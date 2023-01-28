package com.algoexpert;

import java.util.Arrays;

public class SortedSquaredArray {
    public static void main(String[] args) {
        int [] arr  = {-4,-3,-2, 1,2,3};
        System.out.println(Arrays.toString(sortedSquaredArray(arr)));
    }

    public static int[] sortedSquaredArray(int [] arr){
        int size = arr.length;
        int [] sorted = new int[size];
        int i = size - 1;
        int start = 0;
        int end = size - 1;

        while(start <= end && i >= 0){
            if(Math.abs(arr[start]) < Math.abs(arr[end])){
                sorted[i] = Math.abs(arr[end]) * Math.abs(arr[end]);
                end--;

            }
            else{
                sorted[i] = Math.abs(arr[start]) * Math.abs(arr[start]);
                start++;
            }
            i--;
        }
        return sorted;
    }
}
