package com.leetcode;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-16));
//         System.out.println(-16%2);
    }

    static boolean isPowerOfTwo(int n) {

            if (n == 0) return false;
            if (n == 1) return true;

            if(n % 2 != 0) return false;
            return isPowerOfTwo(n/2);
    }

}
