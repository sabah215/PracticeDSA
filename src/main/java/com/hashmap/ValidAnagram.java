package com.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "a";
        String t = "ab";

//        System.out.println(isValidAnagram(s,t));
        boolean b = isValidAnagram(s,t);
        System.out.println(b);
    }

    public static boolean isValidAnagram(String s, String t){
        char [] s_chars = s.toCharArray();
        char [] t_chars = t.toCharArray();

        Map<Character, Integer> sMap = insert(s_chars);
        Map<Character, Integer> tMap = insert(t_chars);

        if(sMap.size() != tMap.size()) return false;
        if (s.equals(t)) return true;

        if(tMap.equals(sMap))
            return true;

        return false;
        
      
    }

    public static Map<Character, Integer> insert(char[] chars){
        Map<Character, Integer> map = new HashMap<>();
        int freq = 0;
        for (int i = 0; i < chars.length; i++) {
            if(map.containsKey(chars[i])){
                freq = map.get(chars[i]) + 1;
                map.put(chars[i], freq);
            }
            else{
                map.put(chars[i],1);
            }
        }
        return map;
    }
}
