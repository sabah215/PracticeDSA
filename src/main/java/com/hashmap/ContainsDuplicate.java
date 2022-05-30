package com.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int [] nums = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(containsDuplicate(nums));


    }

    public static boolean containsDuplicate(int [] nums){

        HashSet<Integer> aSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(aSet.contains(nums[i])) return true;
            aSet.add(nums[i]);
        }

        return false;


//        Map<Integer, Integer> aMap = new HashMap();
//
//        for (int i = 0; i < nums.length; i++) {
//            if(aMap.containsKey(nums[i])){
//                int freq = aMap.get(nums[i]) + 1;
//                aMap.put(nums[i], freq);
//            }
//            else{
//                aMap.put(nums[i], 1);
//            }
//        }
//
//        if(aMap.size()!= nums.length){
//            return true;
//        }
//        return false;
    }
}
