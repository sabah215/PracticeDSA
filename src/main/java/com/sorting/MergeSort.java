package com.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int [] mergeSort(int [] arr){
        if(arr.length == 1)
            return arr;

        int mid = arr.length / 2;

        int [] left = mergeSort(Arrays.copyOfRange(arr,0, mid));
        int [] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int [] merge(int [] left, int [] right){
        int i = 0;
        int j = 0;
        int k = 0;
        int [] sorted = new int [left.length + right.length];

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                sorted[k] = left[i];
                i++;
            }
            else {
                sorted[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length){
            sorted[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            sorted[k] = right[k];
            j++;
            k++;
        }
        return sorted;
    }
}
