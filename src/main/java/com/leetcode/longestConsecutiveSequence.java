package com.leetcode;

import java.util.HashSet;

public class longestConsecutiveSequence {
    public static void main(String[] args) {
        int [] arr = {100,4,200,1,3,2};

        int longest = longestConsecutive(arr);
        System.out.println(longest);
    }

    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>() ;
        int ans = 1;
        for (int n: nums) set.add(n);
        for (int n: nums) {


            if (!set.contains(n - 1)){
                int count = 1;
            while (set.contains(n + 1)) {
                n++;
                count++;
            }
            ans = Math.max(count, ans);
        }
        }
        return ans;
    }
}
