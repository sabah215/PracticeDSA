/**
 * Author: Sabah Ummie
 * Date: 04/30/22
 *
 * */
// Implemented this from Neetcode.io

package com.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int [] arr, int target){
        // returns the indices of the numbers
        int [] result = new int[2];

        // contains the value and the corresponding indices
        Map<Integer, Integer> aMap = new HashMap();


        for (int i = 0; i < arr.length; i++) {
            // holds the difference between the target and array element
            int num = target - arr[i];

            // check if the map contains the
            if(aMap.containsKey(num)){
                //do sth
                result[0] = aMap.get(num);
                result[1] = i ;
                return result;
            }
            else{
                aMap.put(arr[i],i);
            }
        }

        // if no operands exist return {-1,-1}
        return new int[]{-1, -1};
    }
}
