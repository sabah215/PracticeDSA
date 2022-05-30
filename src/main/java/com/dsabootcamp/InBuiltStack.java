package com.dsabootcamp;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Stack<Integer> stack = new Stack<>();
		
//		stack.push(4);
//		stack.push(34);
//		stack.push(41);
//		stack.push(45);
//		stack.push(24);
//		
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(3);
		queue.add(6);
		queue.add(5);
		queue.add(19);
		queue.add(25);
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		
		Deque<Integer> deque = new ArrayDeque<>();
		deque.add(8);
		deque.addLast(10);
		deque.addFirst(12);
		deque.removeFirst();
		

	}
	

}
