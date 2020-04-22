package linkedList;

public class LinkedList {
 
	Node head;

	public boolean isEmpty()
	{
		boolean status=false;
		if(head==null)
		{
			status=true ;
		}
		return status;
		
	}
	
	public int getSize() {
		int count = 0;
		Node current = head;
		while(current!=null)
		{
			current=current.next;
		}
		return count;
	}

	
	void insert(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head ;
			while(current.next!=null)
			{
				current= current.next;
			}
			current.next=newNode;
		}

	}
	
	void insertAtPosition(int data,int element)
	{
		Node current=head;
		while(current!=null)
		{
			if(current.data==element)
			{
				Node newNode = new Node(data);
				Node temp=current.next;
				current.next=newNode;
				newNode.next=temp;
			}
				current=current.next;
			
			
		}
	}

	void displayLinkedList(Node n)
	{
		
		Node current = n;
			while(current!=null) {
				System.out.print(current.data+"->");
				
			current=current.next;
			}
			System.out.println();
   }
		

	 public Node reverse(Node n)
	 { Node current =n;
	   Node prev=null;
	   Node after;
	   while(current!=null)
	   {
		   after=current.next;
		   current.next=prev;
		   prev=current;
		   current=after;
	   }
		 
	   return prev;
	 }

	 public static void main(String args[])
	 {
		 LinkedList list = new LinkedList();
		 list.insert(10);
		 list.insert(20);
		 list.insert(30);
		 list.insert(40);
		 list.insert(50);
		 list.displayLinkedList(list.head);
		 list.insertAtPosition(35,30);
		 System.out.println();
		 list.displayLinkedList(list.head);
	 }
	
}
