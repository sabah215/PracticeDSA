package com.recursion;

public class SumOfDigits {
    static int sum = 0;
    static int count = 0;
    public static void main(String[] args) {
//        System.out.println(sumOfDigits(1342));
//        System.out.println(productOfDigit(331));
//        reverseANumber(1234);
//        System.out.println(sum);
//        System.out.println(isPalindrome(10));
//        countZeroes(0);
//        System.out.println(count);
        System.out.println(numberOfSteps(14));
    }

    public static int numberOfSteps(int num) {

//        return reduceToZero(num, 0);
        if (num <= 1)
            return num;
        return num % 2 + 1 + numberOfSteps(num / 2);

    }

    private static int reduceToZero(int n, int count){

        if(n == 0)
            return count;

        if(n % 2 == 0){
            reduceToZero(n/2, count+1);
        }
        return reduceToZero(n-1, count+1);
    }

    public static void countZeroes(int n){
        if(n==0)
            count = 1;
        if(n % 10 == n)
            return;

        if(n % 10 == 0)
            count++;
        countZeroes(n/10);
    }

    public static boolean isPalindrome(int n){
        return n == rev(n);
    }

    public static int sumOfDigits(int n){
        if (n == 0)
            return 0;
        int mod = n % 10;
        return mod + sumOfDigits(n / 10);
    }

    public static int productOfDigit(int n){
        if(n % 10 == n)
            return n;

        int mod = n % 10;
        return mod * productOfDigit(n/10);
    }

    public static int rev(int n){
        int digit = (int)Math.log10(n) + 1;

        int reverse = helper(n, digit);
        return reverse;
    }

    public static int helper(int n, int digit){
        if(n % 10 == n)
            return n;

        int mod = n % 10;

        return mod * (int)Math.pow(10,digit -1) + helper(n/10, digit-1);
    }

    public static void reverseANumber(int n){
        if( n == 0){
            return;
        }

        int unit = n % 10;

        sum = sum * 10 + unit;
       reverseANumber(n/10);
    }


}
