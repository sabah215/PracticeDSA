package com.leetcode;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int [] nums = {2,3,4};

        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }

    static int [] twoSum(int [] nums, int target){
        int n = nums.length;
        for(int i=0, j = n - 1; i < j;){
            if(nums[i] + nums[j] > target){
                j--;
            }
            else if(nums[i] + nums[j] < target){
                i++;
            }
            else return new int [] {i+1, j+1};
        }
        return new int [] {-1,-1};
    }
}
