package com.geeksforgeeks;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(binaryToDecimal(10101001));
    }

    public static int binaryToDecimal(int n){
        int dec_val = 0;
        int num = n;

        int base = 1;
        int temp = num;

        while (temp > 0){
            int last_digit = temp % 10;
            temp = temp / 10;
            dec_val += last_digit * base;
            base = base * 2;
        }
        return dec_val;
    }
}
