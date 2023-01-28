package com.algoexpert;

import java.util.*;


public class ThreeNumberSum {
    public static void main(String[] args) {
        int [] arr  = {12, 3, 1, 2, -6, 5, -8, 6};
        System.out.println(threeNumberSum(arr, 0));
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        List <Integer []> triplets = new ArrayList<>();
        int size = array.length;
        for(int num : array){
            int start = 0;
            int end = size - 1;
            Integer [] triplet = new Integer[size];

            while(start <= end){
                int sum = num + array[start] + array[end];
                if(sum == targetSum){
                    triplet[0] = num;
                    triplet[1] = array[start];
                    triplet[2] = array[end];
                }
                if(sum < targetSum){
                    start++;
                }
                else{
                    end--;
                }
            }
            triplets.add(triplet);
        }
        return triplets;
    }
}
