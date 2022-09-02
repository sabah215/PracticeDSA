package com.leetcodeContest.contest308;
/*
* 6160. Longest Subsequence With Limited Sum

You are given an integer array nums of length n, and an integer array queries of length m.

Return an array answer of length m where answer[i] is the maximum size of a subsequence that you can take
* from nums such that the sum of its elements is less than or equal to queries[i].

A subsequence is an array that can be derived from another array by deleting some or no elements without
* changing the order of the remaining elements.
*
* Input: nums = [4,5,2,1], queries = [3,10,21]
  Output: [2,3,4]
Explanation: We answer the queries as follows:
- The subsequence [2,1] has a sum less than or equal to 3. It can be proven that 2 is the maximum size of
   such a subsequence, so answer[0] = 2.
- The subsequence [4,5,1] has a sum less than or equal to 10. It can be proven that 3 is the maximum size
 of such a subsequence, so answer[1] = 3.
- The subsequence [4,5,2,1] has a sum less than or equal to 21. It can be proven that 4 is the maximum
  size of such a subsequence, so answer[2] = 4.
  *
  *
  * Constraints:
        n == nums.length
        m == queries.length
        1 <= n, m <= 1000
        1 <= nums[i], queries[i] <= 106

* */
import java.util.*;

public class LongestSubsequenceWithLimitedSum {
    public static void main(String[] args) {

    }
    static int[] answerQueries(int[] nums, int[] queries) {

        int [] result = new int[queries.length];

        Arrays.sort(nums);  // [1, 2, 4, 5]

        Map<Integer, List<Integer>> map = new HashMap<>();

        List<Integer> list = new ArrayList<>();

        int n = nums.length;
        int s = 0, e = n-1;
        for(int q: queries){
            while(s <= e){
                int m = s + (e - s)/2;

                if(nums[m] == q){
                    list.add(nums[m]);
                    break;
                }

                if(nums[m] > q){
                    e = m - 1;
                }
                else if(nums[m] < q){

                }
            }
        }




        return result;
    }
}
