package com.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ReversePolishNotation {

//    List<Character> list = new LinkedList<Character>();

    public static void main(String[] args) {
       String [] arr = {"4","3","-"};

       System.out.println(evalRPN(arr));


    }

    /*
    * @TODO: Try recursive solution of the same problem
    *
    * */
    public static int evalRPN(String [] tokens){
        int result = 0;

        Stack<Integer> st = new Stack<>();
            for (String s : tokens) {
                if (s.equals("+")) {
                    result = st.pop() + st.pop() ;
                    st.push(result);
                }

                else if (s.equals("-")) {
                    int a = st.pop();
                    int b = st.pop();
                    result =  b - a ;

                    st.push(result);
                }
                else if (s.equals("*")) {
                    result = st.pop() *st.pop();
                    st.push(result);
                }

                else if (s.equals("/")) {
                    int a = st.pop();
                    int b = st.pop();
                    result = (int) b / a;

                    st.push(result);
                } else {
                    st.push(Integer.valueOf(s));
                }

            }
        result = st.pop();
        return result;
    }


}
