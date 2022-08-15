package com.leetcode;
/*
* Given a sorted array of distinct integers and a target value, return the index if the target is found.
* If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.


* */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] nums = {-1, 1,3,5,6};
        int index = searchInsert(nums, -2);
        System.out.println(index);
    }
    static int searchInsert(int[] nums, int target) {
        int s= 0;
        int e= nums.length - 1;
        int index = 0;
        while (s <= e){
             int mid= s+(e-s)/2;

             if(nums[mid] == target){
                 index = mid;
                 return index;
             }
             else if(nums[mid] > target){
                 e = mid - 1;
             }
             else{
                 index = mid+1;
                 s = mid+1;
             }
        }
        return index;
    }

}
