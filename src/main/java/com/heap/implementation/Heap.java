package com.heap.implementation;

import java.util.Arrays;

public class Heap {
    public static void main(String[] args) {
        int MAX = 20;
        int [] arr = new int [MAX];
        arr[1] = 50;
        arr[2] = 30;
        arr[3] = 20;
        arr[4] = 15;
        arr[5] = 10;
        arr[6] = 8;
        arr[7] = 16;

        System.out.println(Arrays.toString(arr));
//        insert(arr, 7,60);
//        System.out.println("After insert");
//        System.out.println(Arrays.toString(arr));
//        insert(arr, 8,65);
//        System.out.println(Arrays.toString(arr));
        delete(arr, 7);
        System.out.println(Arrays.toString(arr));
    }



    static void delete(int [] A, int n){
        /*               50
                       /    \
                     30      20
                    /  \    /  \
                  15   10  8    16

               [50, 30, 20, 15, 10, 8, 16]
                1    2   3   4   5  6   7
        Only root can be deleted
     */
        // Replace the last element with the first element
        A[1] = A[n];
        A[n] = 0;
        // move the last pointer backward to maintain the heap size
        n = n - 1;

        int i = 1;
        while(i < n){
            int left = A[2 * i];
            int right = A[2 * i + 1];

            int larger = left > right ? 2 * i : 2 * i + 1;
            if(A[i] < A[larger]){
                swap(A, i, larger);
                i = larger;
            }   else   {
                return;
            }
        }
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
