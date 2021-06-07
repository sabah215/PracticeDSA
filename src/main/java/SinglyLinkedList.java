
public class SinglyLinkedList {
	
	private Node head;
	private Node tail;
	
	private int size;
	
	public Node createSinglyLinkedList(int data) {
		head = new Node();
		Node node = new Node();
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
			System.out.println("Linked List just not exist.");
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
	public boolean searchNode(int value) {
		if(existsLinkedList()) {
			Node temp = head;
			for(int i = 0; i< getSize(); i++) {
				if(temp.getValue() == value) {
					System.out.println("Value found at " + i);
					return true;
				}
				
				temp = temp.getNext();
			
			}
			System.out.println("Value not found.");
			return false;
		}
	
		System.out.println("Value not found.");
		return false;
	}
	
	public void deleteNode() {
		//TODO
	}
	
	public void deleteList() {
			System.out.println("Deleting Linked List...");
		
			head = null;
			tail = null;
	
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
	
}