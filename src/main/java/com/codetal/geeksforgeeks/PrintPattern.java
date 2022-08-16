package com.codetal.geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintPattern {
    public static void main(String[] args) {
        System.out.println(pattern(16));
    }

    static List<Integer> pattern(int N){
        // code here
        List<Integer> seq = new ArrayList<>();
        helper(N, seq);
        return seq;
    }

    static void helper(int N, List<Integer> seq){

        //Base condition
        if(N <= 0){
            seq.add(N);
            return;
        }

        seq.add(N);
        helper(N-5, seq);
        seq.add(N);

    }

}
