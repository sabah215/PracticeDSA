package com.codetal.geeksforgeeks;

/*
* https://practice.geeksforgeeks.org/problems/who-will-win-1587115621/1
* Given an array arr[] sorted in ascending order of size N and an integer K.
* Check if K is present in the array or not.
* */

public class SearchFromSortedArray {
    public static void main(String[] args) {
        int [] arr = {1,2,4,6,8};

        System.out.println(searchInSorted(arr,arr.length,10));
//        System.out.println(searchWithRec(arr,arr.length,10));


    }

    static int searchInSorted(int arr[], int N, int K)
    {

        // Your code here
        int s = 0;
        int e = N-1;
        int m = 0;

        while(s <= e){

            m= s + (e-s)/2;

            if(arr[m] > K){
               e = m-1;
            }else if(arr[m] < K){
                s = m+1;
            }else {
                return 1;
            }
        }
        return -1;
    }

    static int searchWithRec(int arr[], int N, int K){
        int s = 0;
        int e = N-1;
        return search(arr,s, e, K);
    }

    static int search(int[] arr,int s, int e, int K){

        if(s <= e && e <= arr.length-1){
            int mid = s +(e-s)/2;

            if(arr[mid] == K)
                return 1;
            else if(arr[mid] > K)
                search(arr, s,mid-1, K);

            return search(arr, mid + 1, e, K);
        }
        return -1;
    }
}
