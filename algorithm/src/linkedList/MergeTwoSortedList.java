package linkedList;

public class MergeTwoSortedList {
	
	static void displayList(Node n)
	{
		
		Node current = n;
			while(current!=null) {
				System.out.print(current.data+"->");
				
			current=current.next;
			}
			System.out.println();
   }
	
	static Node mergeList(Node h1,Node h2)
	{
		if(h1==null ) {
	
	    return h2;
		}
		
		if(h2==null)
		{	
			  return h1;
		}
		  if(h1.data<h2.data){
		        h1.next=mergeList(h1.next,h2);
		    }
		
		if(h1.data>h2.data)
		{
			Node temp = h2.next;
	        h2.next=h1;
	        h1=h2;
			h2=temp;
			h1.next= mergeList(h1.next,h2);
			
		}
		
		return h1;
	}

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		
		l1.insert(5);
		l1.insert(10);
		l1.insert(15);
		l1.insert(40);
		System.out.println("list1:-");
		l1.displayLinkedList(l1.head);
		
		l2.insert(2);
		l2.insert(3);
		l2.insert(20);
		System.out.println("list2:-");
		l2.displayLinkedList(l2.head);
		
		
		Node head=mergeList(l1.head,l2.head);
	     System.out.println("merged:-");displayList(head);
		

	}

}
