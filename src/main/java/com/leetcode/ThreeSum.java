package com.leetcode;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int [] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> triplets = threeSum(arr);
        for(int i=0;i<triplets.size();i++){
            for (int j= 0; j<triplets.get(i).size(); j++){
                System.out.println(triplets.get(i).get(j)+", ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();
        List<Integer> triplet = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;
        for(int i= 0; i< n-2; i++){
            int j = i+1;
            int k= n-1;

            while(j < k){
                int target = nums[i] + nums[j] + nums[k];

                if(target < 0) j++;
                else if(target > 0) k--;

                else{

                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
