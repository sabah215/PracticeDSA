package com.hackerrank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DiagonalDifference {
    public static void main(String[] args) {

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sum1 =0;
        int sum2 =0;

        for(int i=0; i<arr.size(); i++){
            for(int j=i; j<=i; j++){
                sum1 += arr.get(i).get(j);
            }
        }
        int index = arr.size()-1;
        for(int i=0; i<arr.size(); i++){
            for(int j = i; j<=i; j++){
                sum2 += arr.get(i).get(index);
                index--;
            }
        }

        return Math.abs(sum1 - sum2);

    }
}
