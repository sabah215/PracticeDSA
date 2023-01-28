package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class HourGlassWithList {
    public static void main(String[] args) {


    }

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int i = 0;
        int j = arr.get(0).size() - 1;
        int max = 0;
        while(i < j -1){
            int sum = arr.get(i).get(i) + arr.get(i).get(i+1) + arr.get(i).get(i+2) +
                    arr.get(i+1).get(i +1) +
                    arr.get(i+2).get(i) + arr.get(i+2).get(i+1) + arr.get(i+2).get(i+2);
            max = Math.max(max,sum);
        }

        return max;
    }
}
