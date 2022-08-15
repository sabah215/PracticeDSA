package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class DecodeTheMessage {
    public static void main(String[] args) {
        String decoded = decodeMessage("the quick brown fox jumps over the lazy dog",
                "vkbs bs t suepuv");
//        char ch = 'a';
        System.out.println(decoded);
    }
    static String decodeMessage(String key, String message) {
        Map<Character, Character> aMap = new HashMap<>();
        StringBuilder output = new StringBuilder();
        int j = 0;

        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (c == ' ') continue;
            if(!aMap.containsKey(c)){
                aMap.put(c, (char)('a' + j++));
            }
        }

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if(c == ' '){
                output.append(' ');
                continue;
            }
            output.append(aMap.get(c));
        }

        return output.toString();
    }

}
