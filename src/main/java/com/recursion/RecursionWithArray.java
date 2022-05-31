package com.recursion;

import javax.xml.transform.stax.StAXResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RecursionWithArray {

    public static void main(String[] args) {
        int [] arr = {1,2,4,8,9,9,12, 9};

        ArrayList<Integer> list =
                findIndexes(arr, 9,0,new ArrayList<>());

//        System.out.println(isSorted(arr,0));
//        System.out.println(search(arr,8,0));
//        System.out.println(findIndex(arr,8,0));
//        System.out.println(findIndexLast(arr,8,arr.length-1));
        System.out.println(list);

    }

    public static ArrayList<Integer> findIndexes(int[] arr, int val, int index, ArrayList<Integer> list){
         if(index == arr.length)
             return list;

         if (val == arr[index])
             list.add(index);

         return findIndexes(arr, val,index+1,list);
    }

    public static ArrayList<Integer> findIndexes2(int[] arr, int val, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length)
            return list;

        if (val == arr[index])
            list.add(index);

        return findIndexes(arr, val,index+1,list);
    }
    // check if sorted
    public static boolean isSorted(int[] arr, int index){
        if(index == arr.length - 1)
            return true;

        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);

    }
    // Linear Search

    public static boolean search(int [] arr, int val, int index){

        if(index == arr.length - 1){
            return false;
        }
        return arr[index] == val || search(arr, val,index + 1);
    }

    public static int findIndex(int[] arr, int val, int index){
        if(index == arr.length){
            return -1;
        }
       if(arr[index] == val) {
           return index;
       }
       else return findIndex(arr, val,index + 1);
    }

    public static int findIndexLast(int[] arr, int val, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == val) {
            return index;
        }
        else return findIndexLast(arr, val,index - 1);
    }

}
