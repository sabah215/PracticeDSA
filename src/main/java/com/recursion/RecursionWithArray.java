package com.recursion;

import javax.xml.transform.stax.StAXResult;
import java.util.ArrayList;

public class RecursionWithArray {

    public static void main(String[] args) {
        int [] arr = {1,2,4,8,8,9,12};
    ArrayList<Integer> list = new ArrayList<>();

//        System.out.println(isSorted(arr,0));
//        System.out.println(search(arr,8,0));
//        System.out.println(findIndex(arr,8,0));
//        System.out.println(findIndexLast(arr,8,arr.length-1));
        System.out.println(findIndexes(arr, 8,0,list));
    }

    public ArrayList<Integer> findIndexes(int[] arr, int val, int index, ArrayList<Integer> list){
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
