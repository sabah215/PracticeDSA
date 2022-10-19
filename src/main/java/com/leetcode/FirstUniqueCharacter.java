package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "aabb";

        System.out.println(firstUniqChar(s));
    }

    static int firstUniqChar(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()){
            if(!freq.containsKey(c)){
                freq.put(c,1);
            }
            else {
                int occurance = freq.get(c);
                freq.put(c,++occurance);
            }
        }

        for(int i = 0; i < s.length(); i++ ) {
            if(freq.get(s.charAt(i)) == 1)
                return i;
        }


        return -1;
    }


}
