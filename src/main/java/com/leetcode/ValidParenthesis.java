package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        String  s = "(((((";
        boolean b = isValid(s);
        System.out.println(b);
    }

    public static boolean isValid(String s){
        Stack<Character> st = new Stack();
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        for (char c : s.toCharArray()) {
                if (map.containsKey(c)) {
                    if (!st.isEmpty() && st.peek() == map.get(c)){
                        st.pop();
                    }
                    else return false;
                }
                else{
                    st.push(c);
                }
        }

        return st.isEmpty();
    }
}
