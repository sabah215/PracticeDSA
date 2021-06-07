
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList list = new SinglyLinkedList();
		list.createSinglyLinkedList(10);
		
		
//		list.insert(20, 1);
//		list.insert(30, 0);
//		list.insert(5, 100);
//		list.insert(25, 4);
//		list.insert(32, 3);
//		list.insert(21, 4);
//		list.insert(80, 2);
//		list.insert(70, 1);
//		
		list.traverseList();
		System.out.println();
//		list.searchNode(30);
		System.out.println();
		System.out.println(list.getSize());
//		list.deleteNode(10);
//		list.traverseList();
//		System.out.println();
//		System.out.println(list.getSize());
		
		list.deleteNode(5);
		list.traverseList();
		System.out.println();
		System.out.println(list.getSize());
		
		
		
	
		
		
	}
}
