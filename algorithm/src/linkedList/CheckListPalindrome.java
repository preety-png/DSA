package linkedList;

public class CheckListPalindrome {
	
	 public static Node reverse(Node n)
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

		public static void  show(Node n)
		{
			
			Node current = n;
				while(current!=null) {
					System.out.print(current.data+"->");
					
				current=current.next;
				}
				System.out.println();
	   }
			
	
	public static boolean checkPalindrome(Node head)
	{
		Node slow = head;
		Node fast = head;
		Node second_head = null;
		
		while(true)
		{
			
			fast=fast.next.next;
			//even
			if(fast==null) {
				second_head=slow.next;
				break;
				}
			//odd
			if(fast.next==null) {
				second_head=slow.next.next;
				break;
				}		
			slow=slow.next;
		   }
		slow.next=null;
//		System.out.println("list1=");
//		System.out.println(head.data);
//		System.out.println(slow.data);
//		
//		System.out.println("list2=");
//		System.out.println(second_head.data);
//		System.out.println(fast.data);

		second_head=reverse(second_head);
		//show(second_head);
		boolean status=true;
		
	while(head!=slow.next&&second_head!=null) {

		if(!(second_head.data==head.data))
		{
			status=false;
			break;
		}
		head=head.next;
		second_head=second_head.next;
		
		
	}
	System.out.println("Yes="+status);
	return status;
	}
	
	

	public static void main(String[] args) {
		LinkedList list = new  LinkedList();
		LinkedList list2 = new  LinkedList();
		list.insert(1);
		list.insert(3);
		list.insert(2);
		list.insert(3);
		list.insert(1);
		
		list2.insert(1);
		list2.insert(2);
		list2.insert(3);
		list2.insert(1);

		list.displayLinkedList(list.head);
	    checkPalindrome(list.head);
	    
	    list.displayLinkedList(list2.head);
	    checkPalindrome(list2.head);

		


	}

}
