package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {

        System.out.println(generateParenthesis(2));

    }

    static List<String> generateParenthesis(int n) {

        List<String> parenthesis = new ArrayList<>();

        generate( parenthesis,0,0,n, "");
        return parenthesis;
    }
    // @TODO: Need to understand backtracking to solve this
    static void generate( List<String> parenthesis, int open, int close,int n, String p){

        if(p.length() == n*2){
            parenthesis.add(p);
            return;
        }

        if(open < n){
            generate(parenthesis, open + 1 , close, n,p +"(");
        }

        //check if  close < open
        if(close < open){
            generate(parenthesis, open,close +1,n, p +")");

        }
        //generate(parenthesis,);
    }
}
