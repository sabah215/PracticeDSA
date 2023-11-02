package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestValidSubstring {

    public static void main(String[] args) {
        String word = "cbaaaabc";
        List<String> forbidden = new ArrayList<>();
        forbidden.add("aaa");
        forbidden.add("cb");
//        forbidden.add("e");
        System.out.println(longestValidSubstring(word, forbidden));
    }

    public static int longestValidSubstring(String word, List<String> forbidden) {
        Set<String> set = new HashSet<>();
        int max = 0;
        for(String s : forbidden){
            max = Math.max(max , s.length());
            set.add(s);
        }
        int ans = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < word.length() ; i++){
            char ch = word.charAt(i);
            sb.append(ch +"");
            int len = sb.length();
            for(int j = len - 1 ; j >= Math.max(0 , len - max); j--){
                String s = sb.substring(j);
                if(set.contains(s)){
                    sb.delete(0 , j + 1);
                    break;

                }
            }
            ans = Math.max(sb.length() , ans);
        }
        return ans;
    }
}
