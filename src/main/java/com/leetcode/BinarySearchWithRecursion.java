package com.leetcode;

public class BinarySearchWithRecursion {
    public static void main(String[] args) {

        int [] arr = {-1,0,3,5,9,12 };

        System.out.println(search(arr, 0, arr.length, 2));
    }

    public static int search(int [] arr, int s, int e, int target){

        int m = s + (e - s) / 2;

        // base case
        if (arr[m] == target)
            return m;

        if(s == m || e == m){
            return -1;
        }

        else if(target > arr[m]){
            return search(arr, m+1, e, target);
        }
        else {
            return search(arr, s, m-1, target);
        }

        //return -1;
    }
}
