package com.heap.implementation;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int [] arr = {10, 20, 15, 30, 40};
        sort(arr, arr.length);
    }

    static void sort(int [] A, int n){
        int [] sorted;
        int []heap = createHeap(A, A.length);
//        sorted = sortHeap(A, A.length);
//        return sorted;
        System.out.println(Arrays.toString(heap));
    }
    // THIS IS VERY TRICKY
    // MESSING UP WITH THE INDEXING
    static int[] createHeap(int [] A, int n){
       // n = n + 1;
//
       int i = n-1;

       while (i > 0){
           int parent = i/2;
             if( A[parent] < A[i] ) {
                 swap(A, parent,i);
                 i = parent;
             }
           }

        return A;
    }

    static int [] sortHeap(int [] A, int n){
        return A;
    }

    static void swap(int [] a, int i, int j){
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
}
