package com.singlylinkedlist;

public class Node {
	
	private int data;
	private Node next;
	
	public int getValue() {
		return data;
	}
	public void setValue(int data) {
		this.data = data;
		}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
