package com.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PreviousSmaller {

    public static void main(String[] args) {

        int[] arr = {3, 2, 1};
        ArrayList<Integer> l = new ArrayList<>();

        for(int i: arr){
            l.add(i);
        }
        System.out.println(l.toString());
        System.out.println(prevSmaller(l));
    }

    static ArrayList<Integer> prevSmaller(ArrayList<Integer> A){

        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < A.size(); i++) {

            if(stack.empty()){
                stack.push(A.get(i));
                result.add(-1);
            }
            else if(stack.peek() > A.get(i)) {
                stack.pop();
                result.add(-1);
                stack.push(A.get(i));
            }
            else if(stack.peek() < A.get(i)){
                result.add(stack.peek());
            }
        }
        return result;
    }


}
