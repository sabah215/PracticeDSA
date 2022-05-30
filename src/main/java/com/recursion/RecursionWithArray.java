package com.recursion;

public class RecursionWithArray {

    public static void main(String[] args) {
        int [] arr = {1,2,4,8,9,12};


        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int[] arr){
       int i = 0;

       return check(arr, i);

    }
// Hi
    public static boolean check(int[] arr, int c){

        if(c < arr.length) {
            if (arr[c] > arr[c + 1])
                return false;


            check(arr, c + 1);
        }
        return true;
    }
}
