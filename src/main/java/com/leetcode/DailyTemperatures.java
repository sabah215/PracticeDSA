package com.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {

    public static void main(String[] args) {

        int [] temperatures = {73,74,75,71,69,72,76,73};

        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }

    static int[] dailyTemperatures(int[] temperatures) {
        /* In this problem the stack used is a monotonous stack.
           We need to check if the stack is decreasing.
            */

        int n = temperatures.length;
        int [] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {

            while(!stack.empty() && temperatures[stack.peek()] < temperatures[i]){
                int prev = stack.pop();
                answer[prev] = i - prev;
            }
            stack.push(i);
        }

        return answer;
    }
}
