package com.heap.implementation;

import java.util.Arrays;

public class Heap {
    public static void main(String[] args) {
        int MAX = 20;
        int [] arr = new int [MAX];
        arr[1] = 50;
        arr[2] = 40;
        arr[3] = 45;
        arr[4] = 30;
        arr[5] = 20;
        arr[6] = 35;
        arr[7] = 10;

        System.out.println(Arrays.toString(arr));
        insert(arr, 7,60);
        System.out.println(Arrays.toString(arr));
        insert(arr, 8,65);
        System.out.println(Arrays.toString(arr));


    }

    static void insert(int [] A, int n, int value){
        n = n + 1;
        A[n] = value;
        int i = n;

        while(i > 1){
            int parent = i/2;
            if(A[parent]  < A[i]){
                swap(A, parent, i);
                i = parent;
            }
            else{ return; }
        }
    }

    static void swap(int [] A, int x, int y){
        int temp = A[y];
        A[y] = A[x];
        A[x] = temp;
    }
}
