package com.leetcode;

import java.util.Stack;

public class RemoveOutermostParanthesis {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        String pd = removeOuterParenthesesNoStack(s);
        System.out.println(pd);
    }

    public static String removeOuterParentheses(String s) {

        String p = "";

        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        while(!st.empty()){
            for(int i = 1; i < s.length(); i++){
                if(st.empty()){
                    st.push(s.charAt(i));
                }
                else if(st.peek() == s.charAt(i)){
                    st.push(s.charAt(i));
                    p+=s.charAt(i);
                }
                else {
                    st.pop();
                    if(!st.empty()){
                        p += s.charAt(i);
                    }
                }
            }
        }
        return p;
    }

    public static String removeOuterParenthesesNoStack(String s){
         int count = 0;
         StringBuilder result = new StringBuilder();

         for (char c : s.toCharArray()) {
             if (c == '(') {
                 if (count != 0) {
                     result.append(c);
                 }
                 count++;
             } else {
                 if (count != 1) {
                     result.append(c);
                 }
                 count--;
             }
         }

         return result.toString();
    }
}
