package com.geeksforgeeks;

public class CountSetBitsInInteger {
    public static void main(String[] args) {
        System.out.println(countSetBrianKernighans(8));
    }

    public static int countSetBits(int n){
        int count = 0;
         while (n > 0){
             count += n & 1;
             n >>= 1;
         }
         return count;
    }

    public static int countSetBitsRec(int n){
         if(n == 0) return 0;

         else return (n & 1) + countSetBitsRec(n >> 1);
    }

    public static int countSetBrianKernighans(int n){
        int count =0;
        while(n > 0){
            n &= (n - 1);
            count++;
        }
        return count;
    }
    public static int countSetBrianKernighansRec(int n){
        int count =0;
        while(n > 0){
            n &= (n - 1);
            count++;
        }
        return count;
    }
}
