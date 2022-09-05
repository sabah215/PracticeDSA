package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class BuildStackUsingQueue {

    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {

        BuildStackUsingQueue stack = new BuildStackUsingQueue();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());
        System.out.println(stack.pop());
//        System.out.println(stack.empty());


    }

    static void printStack(){

    }

    static void push(int val){
        queue.add(val);

        for (int i = 0; i < queue.size()-1 ; i++) {
            queue.add(queue.poll());
        }
    }

    static int pop(){
//        int len = queue.size();
//
//        for (int i = 0; i < len-1; i++) {
//            queue.add(queue.poll());
//        }
        return queue.remove();
    }

    static int top(){

        return queue.peek();

    }

    static boolean empty(){
        return queue.isEmpty();
    }

}
