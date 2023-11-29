package com.interview.apple;

import java.util.Stack;

public class CountZerosAndOnes {
    public static void main(String[] args) {
        String s = "1";
        System.out.println(count(s));
    }

    public static int count(String s){

        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (st.isEmpty() || st.peek() == '*' || st.peek() == s.charAt(i) || s.charAt(i) == '*') {
                st.push(s.charAt(i));
            } else {
                st.pop();
            }
        }
        return st.size();
    }
}
