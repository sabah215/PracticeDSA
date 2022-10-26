package com.leetcode;

import com.singlylinkedlist.Node;

public class ReorderList {

    private  Node head;
    private  Node tail;
    private  int size;

    static class Node {

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

    public Node createSinglyLinkedList(int data) {
//		The head node is created
        head = new Node();
//		Create another node
        Node node = new Node();
//		Set the value to the node
        node.setValue(data);

        head = node;
        node.setNext(null);
        tail = node;
        size = 1;
        return head;
    }

    public void insert(int data, int location) {

        Node node = new Node();
        node.setValue(data);

        // Check if Linked List exists
        if(!existsLinkedList()) {
            System.out.println("Linked List does not exist.");
        }

        else if(location == 0) {
            node.setNext(head);
            head = node;
        }

        else if(location >= getSize()){
            node.setNext(null);
            tail.setNext(node);
            tail = node;
        }
        else {
            Node temp = head;
            int index = 0;
            while(index < location-1) {
                temp = temp.getNext();
                index++;
            }
            Node nextNode = temp.getNext();
            temp.setNext(node);
            node.setNext(nextNode);
        }
        setSize(getSize() + 1);
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public boolean existsLinkedList() {
        return head != null;
    }

    public void traverseList() {
        if(!existsLinkedList()) {
            System.out.println("List does not exist.");
        }
        else {
           Node temp = head;

            for(int i=0; i < getSize(); i++) {
                System.out.print(temp.getValue());
                if(i != getSize() - 1)
                    System.out.print(" -> ");

                temp = temp.getNext();
            }
        }
    }
    public static void main(String[] args) {
        ReorderList linkedList = new ReorderList();
        Node head = linkedList.createSinglyLinkedList(1);
        linkedList.insert(2, linkedList.getSize());
        linkedList.insert(3, linkedList.getSize());
        linkedList.insert(4, linkedList.getSize());
//        linkedList.insert(5, linkedList.getSize());
        linkedList.traverseList();
        System.out.println();
        reorderList(head);

    }
    public static void reorderList(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        Node second = slow.next;
        slow.next = null;
        Node prev = reverse(second);
        Node first = head;
        second = prev;
        while( second != null){
            Node n1 = first.next;
            Node n2 = second.next;
            first.next = second;
            second.next = n1;
            first = n1;
            second = n2;
        }

        }

        static  Node reverse(Node head){
            Node next = null;
            Node curr = head;
            Node prev = null;

            if(head == null || head.next == null){
                return head;
            }
            else{
                while(curr != null){
                    next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                }
            }

            return prev;
        }
    }



