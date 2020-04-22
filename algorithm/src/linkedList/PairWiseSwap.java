package linkedList;

public class PairWiseSwap {
	
	public static void pairWiseSwap(Node head)
	{
		Node current = head;
 
		  while(current!=null && current.next!=null){
	          
	          int temp = current.data;
	          current.data = current.next.data;
	          current.next.data = temp;
	          
	          current = current.next.next;
	          
	      }
		
	}

	public static void main(String[] args) {
		LinkedList list = new  LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(2);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.insert(8);
		list.displayLinkedList(list.head);
		pairWiseSwap(list.head);
		list.displayLinkedList(list.head);
		


	}

}
