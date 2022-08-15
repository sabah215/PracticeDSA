package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int [] nums = {1,2,5,2,2,10,2,4,2,3};
        List<Integer> indices = targetIndices(nums, 8);

        System.out.println(indices);
    }
    static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> indices = new ArrayList<>();
        int [] arr = new int[2];
        arr[0] = search(nums, target,true);
        arr[1] = search(nums, target,false);

        for (int i = arr[0]; i <= arr[1]; i++) {
            if(i != -1)
                indices.add(i);
        }
        return indices;
    }
    static int search(int[] nums, int target,  boolean isFirst){
        // start index and end index
        int s = 0, e = nums.length-1;

        int  ans = -1;
        while(s <= e && e <= nums.length-1){

            int m = s + (e-s)/2;

            if(nums[m] > target){
                e = m - 1;
            }
            else if(nums[m] < target){
                s = m + 1;
            }
            else{
                if(isFirst){
                    e = m-1;
                }
                else {
                    s = m+1;
                }
                ans = m;
            }
        }
        return ans;
    }
}
