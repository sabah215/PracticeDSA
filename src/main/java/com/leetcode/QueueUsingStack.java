package com.leetcode;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> stk1;
    private Stack<Integer> stk2;

    public QueueUsingStack() {
        stk1 = new Stack<>();
        stk2 = new Stack<>();
    }

    public void push(int x) {
        while(!stk1.isEmpty()){
            stk2.push(stk1.pop());
        }
        stk1.push(x);
        while(!stk2.isEmpty()){
            stk1.push(stk2.pop());
        }
    }

    public int pop() {
        if (stk1.isEmpty()){
            return -1;
        }
        return stk1.pop();
    }

    public int peek() {
        if (stk1.isEmpty()){
            return -1;
        }
        return stk1.peek();
    }

    public boolean empty() {
        return stk1.isEmpty();
    }
}
