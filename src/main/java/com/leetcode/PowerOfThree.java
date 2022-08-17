package com.leetcode;

public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(81));
//         System.out.println(-16%2);
    }
    static boolean isPowerOfThree(int n) {

        if (n == 0) return false;
        if (n == 1) return true;

        if(n % 3 != 0) return false;
        return isPowerOfThree(n/3);
    }
}
