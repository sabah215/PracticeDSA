package com.leetcode;

import java.util.Arrays;

public class ReverseStringWithRecursion {

    public static void main(String[] args) {
        char [] ch = {'h','e','l','l','o'};
        reverseString(ch);
        System.out.println(Arrays.toString(ch));
    }

    public static void reverseString(char[] s) {

        if(s == null || s.length <=1)
            return;

        reverse(s, 0, s.length-1);

    }

    public static void reverse(char [] chars, int i, int j){

        if(i >= j){
          return;
        }

        char temp = chars[j];
        chars[j] = chars[i];
        chars[i] = temp;
        reverse(chars, i+1, j-1);

    }
}
