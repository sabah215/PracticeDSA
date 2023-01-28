package com.leetcode;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {

        int[] arr = {3,0,3,0};
        System.out.println(Arrays.toString(topKFrequent(arr,1)));

    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> elements = new ArrayList<>();
        int count = 0;
        int size = 0;
        for (int n: nums){
            if(freq.containsKey(n)){
                int f = freq.get(n);
                freq.put(n,f++);
            }
            else{
                freq.put(n, ++count);
            }
        }
        for(Map.Entry<Integer,Integer> e: freq.entrySet()){
            if(e.getValue() <= k){
                elements.add(e.getKey());
                size++;
            }
        }
        int [] res = new int[size];
       for (int i=0; i< elements.size();i++){
           res[i]= elements.get(i);
       }
       return res;
    }
}
