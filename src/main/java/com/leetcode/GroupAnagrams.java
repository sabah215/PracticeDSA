package com.leetcode;

import java.lang.reflect.Array;
import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
//        String [] strs = {"eat","tea","tan","ate","nat","bat"};
//        List<List<String>> groups = groupAnagrams(strs);
//        System.out.println(groups);

        String s = "cat";
        char[] hash = new char[3];
        hash[0] = 1;

        System.out.println(new String(hash));

    }

    public static List<List<String>> groupAnagrams(String [] strs){

        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> groups = new HashMap<>();
        for(String s : strs){
            char[] hash = new char[26];
            for(char c: s.toCharArray()){
                hash[c - 'a']++;
            }
            String key = new String(hash);
            System.out.println(key);
            groups.computeIfAbsent(key,  k -> new ArrayList<String>());
            groups.get(key).add(s);
        }
        res.addAll(groups.values());
        return res;
    }


}
