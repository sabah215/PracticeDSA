package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {

        int [] candies = {0,0,0};

        System.out.println(kidsWithCandies(candies,1));

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();

        int max = getMax(candies);

        for (int i: candies){
            list.add(i + extraCandies >= max);
        }
        return list;
    }

    static int getMax(int [] A){
        int max = Integer.MIN_VALUE;
        for (int i: A){
            max = (i > max) ? i : max;
        }
        return max;
    }
}
