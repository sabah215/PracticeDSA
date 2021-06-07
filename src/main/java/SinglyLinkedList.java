
public class SinglyLinkedList {
	
	private Node head;
	private Node tail;
	
	private int size;
	
	/**
	 *  Here a Single LInked List is created. 
	 *  It takes the value to be added to linked List as parameter.
	 *   
	 * */
	
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
	
	public void deleteNode(int loc) {
		
		
		if(!existsLinkedList()) {
			System.out.println("List does not exists");
			}
		
		/**
		 * Delete for 0 location 
		 * */
		else if(loc == 0){
			
			if(getSize() == 0) {
					tail = null;
				}
		
			head = head.getNext();
			setSize(getSize() - 1);
		}
		else if(loc >= getSize()-1) {
			Node temp = head;
			for(int i = 0; i < (getSize() - 1); i++) {
				temp = temp.getNext();			
			}
			
			if(temp == head) {
				tail = head =null;
				setSize(getSize() - 1);
				return;
				}
			temp.setNext(null);
			tail = temp;
			setSize(getSize() - 1);
			}
		else {
			Node temp = head;
			for(int i = 0; i<loc-1;i++) {
				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
			setSize(getSize()-1);
			
		}
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