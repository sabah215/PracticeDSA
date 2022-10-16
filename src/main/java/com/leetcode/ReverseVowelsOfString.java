package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ReverseVowelsOfString {

    public static void main(String[] args) {
        String s = "Sore was I ere I saw Eros.";
        String reverse =  reverseVowels(s);
        System.out.println(reverse);
    }

    static String reverseVowels(String s){

        List<Character> list= Arrays.asList('a', 'e', 'i','o','u','A','E','I','O','U');
        char [] ch = s.toCharArray();
        int i = 0, j = ch.length - 1;
        while(i < j) {
            if (list.contains(ch[i]) && list.contains(ch[j])) {
                char temp = ch[j];
                ch[j] = ch[i];
                ch[i] = temp;
                i++;
                j--;
            }
            if (list.contains(ch[i]) && !list.contains(ch[j])) {
                j--;
            }
            if (list.contains(ch[j]) && !list.contains(ch[i])) {
                i++;
            } else if(!list.contains(ch[i]) && !list.contains(ch[j])){
                i++;
                j--;
            }
        }
        return String.valueOf(ch);
    }
}
