package com.leetcode;

import java.util.Arrays;

public class KokoEatingBanana {
    public static void main(String[] args) {
        int [] piles = {30,11,23,4,20};
        System.out.println(minEatingSpeed(piles, 6));

    }

    static int minEatingSpeed(int[] piles, int h) {


        int length =  piles.length;
        int max = getMax(piles);
        int sum = 0;

        int s = 1;
        int e = max;

        while (s < e) {
            int k = s + (e - s) / 2;
            sum = getTotalHours(k,piles);
            if(sum <= h){
                e = k ;
            }
           else{
                s = k + 1;
            }
        }
        return e;
    }

    static int getTotalHours(int k, int[] piles){
        int sum = 0;

        for(int i=0;i<piles.length; i++){
            if(piles[i] % k == 0)
                sum += piles[i] / k;
            else
                sum += (piles[i] / k)+1;
        }
        return sum;
    }

    static int getMax(int [] piles){
        int max = Integer.MIN_VALUE;
        for(int pile : piles){
           max = Math.max(max,pile);
        }
        return max;
    }
}
