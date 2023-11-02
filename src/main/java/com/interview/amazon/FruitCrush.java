package com.interview.amazon;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class FruitCrush {

    public static void main(String[] args) {
        Integer [] arr = {2, 2, 2, 5, 1, 2};

        List<Integer> fruits = Arrays.asList(arr);


        System.out.println(getMinimumFruits(fruits));

    }

    public static int getMinimumFruits(List<Integer> fruits){
        // [3, 3, 3, 2, 1 ]
        // | 3 |

        Stack<Integer> st = new Stack<>();

        /* push the first element initially */
        st.push(fruits.get(0));


        while(!st.empty()){

            for(int i = 1; i < fruits.size(); i++){
                /* if stack is empty then push the ith element */
                if (st.empty()){
                    st.push(fruits.get(i));
                }

                /* if top of stack is != ith element, then pop() */
                else if(st.peek() != fruits.get(i)){
                    st.pop();
                }
                else{
                    st.push(fruits.get(i));
                }
            }
            return st.size();
        }
        return 0;
    }
}
