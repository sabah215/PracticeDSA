package com.leetcode;

import java.util.Arrays;
import java.util.Locale;

public class ValidPalindrome {

    public static void main(String[] args) {
        String str = "A man, a plan, a canal:_ Panama";

        System.out.println(isPalindrome(str));

        }
     public static boolean isPalindrome(String s){

        String lower = s.toLowerCase();

        String word = lower.replaceAll("[^a-z0-9]","");


        // le_v-el
         //l     r

         for (int i = 0; i < word.length()/2; i++) {
             if(word.charAt(i) != word.charAt(word.length() - i - 1))
                 return false;
         }

         return true;
     }

}
