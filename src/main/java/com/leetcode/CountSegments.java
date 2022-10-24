package com.leetcode;

public class CountSegments {
    public static void main(String[] args) {
        String s = " ";
        System.out.println(countSegments(s));
    }

    static int countSegments(String s){
        if(s.length() == 0) return 0;
        String [] splitted = s.split(" ");

        int count =0;
        for(String str: splitted){
            if (!str.equals("")) count++;
        }
        return count;
    }
}
