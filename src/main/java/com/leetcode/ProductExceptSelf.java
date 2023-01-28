package com.leetcode;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int [] ans = productExceptSelf(nums);
        System.out.print(Arrays.toString(ans));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] answer = new int [n];

        // Brute force
//        for (int i = 0; i < n; i++) {
//            int pro = 1;
//            for (int j = 0; j < n; j++) {
//                if(i == j)
//                    continue;
//                pro *= nums[j];
//            }
//            answer[i] =pro;
//        }

        // Dividing the product of array with the number
        // This has a problem i.e if nums[i] is 0 the value will not satisfy
        // so we want to avoid that
//        int pro = 1;
//        for(int i:nums){
//            pro *= nums[i];
//        }
//        for(int i=0; i< n;i++){
//            answer[i] = pro / nums[i];
//        }

//        int [] prefix = new int[n];
//        int [] postfix = new int[n];
//
//        prefix[0] = 1;
//        postfix[n-1] = 1;
//
//        for(int i = 1; i < n; i++){
//            prefix[i] = prefix[i-1] * nums[i-1];
//        }
//        for(int i=){
//
//        }

        return answer;
    }
}
