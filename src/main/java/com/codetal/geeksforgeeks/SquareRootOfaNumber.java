package com.codetal.geeksforgeeks;
/* Square root of a given number

Given an integer x, find the square root of x. If x is not a perfect square,
then return floor(√x).

* */
public class SquareRootOfaNumber {
    public static void main(String[] args) {
        long ans = floorSqrt(17);
        System.out.println(ans);
    }

    /* Steps:
     * 1. Notice that with the increasing sqrt values, perfect square values are also increasing
     * 2. The square root values are always <= x/2
     * */
    static long floorSqrt(long x)
    {
        // Your code here
        if(x==1) return 1;
        long s = 1;
        long e = x/2;
        long ans= 0;
        while(s <= e){
            long m = s+(e-s)/2;
            long sqr = m * m;
            if(sqr == x)
               return m;
            else if(sqr < x){
               ans = m;
               s = m+1;
            }
            else {
                e = m-1;
            }
        }
        return ans;

    }
}
