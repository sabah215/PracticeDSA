package com.geeksforgeeks;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Stack;

public class NonRepetitiveString {

    public static void main(String[] args) {
        String S = "AABBCCCC";
        System.out.println(nonRepetitiveWithStack(S));
    }

    public static boolean nonRepetitive(String S){
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<S.length();i++){
            set.add(S.charAt(i));
        }
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0; i<S.length()-1; i++){
            if(S.charAt(i) != S.charAt(i+1)){
                list.add(S.charAt(i));
            }
        }
        list.add(S.charAt(S.length() - 1));

        if(set.size() == list.size()) return true;
        return false;
    }

    public static boolean nonRepetitiveWithStack(String S){
        Stack<Character> st = new Stack<>();
        st.push(S.charAt(0));

        for(int i = 1; i < S.length(); i++){
            if(S.charAt(i) == st.peek()){
                st.push(S.charAt(i));
            } else if (st.contains(S.charAt(i))) {
                return false;
            }
            else{
                st.push(S.charAt(i));
            }
        }
        return true;
    }

}
