package com.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    public static int factorial(int n){
//    int fact =0;

        if(n<=1)
            return 1;
        return n * factorial(n-1);
    }

    public static int sum(int n){
        if(n <= 1)
            return n;

        return n + sum(n-1);
    }
}
