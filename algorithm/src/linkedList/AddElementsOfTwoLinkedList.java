package linkedList;

public  class AddElementsOfTwoLinkedList {
	
	
	public static Node  reverse(Node n)
	{
		
		Node current = n;
		Node prev=null;
		Node nextE ;
			while(current!=null) {
				nextE=current.next;
				current.next=prev;
				prev=current;
				current=nextE;
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
		

	
	public static int getSize(Node head)
	{
		int size=0;
		Node current = head;
		while(current!=null)
		{
			size++;
			current=current.next;	
		}
		//System.out.println("size="+size);
		return size;
	}
	
 public static void addElementOfTwoLinkedList(Node head1, Node head2)
    {
	 int size1=getSize(head1);
	 int size2=getSize(head2);
	 Node small=head1;
	 Node greater=head2;
	
	 int diff =Math.abs(size1-size2);
	 
	 if(size2<size1)
	 {
		 small=head2;
		 greater=head1;
		 
	 }
	 
	 if(diff!=0)
	 {    
		
		 int i=0;
		   while(i<diff)
		 {
			 Node n = new Node(0);
			 Node temp=small;
			 small=n;
			 small.next=temp;
			 i++;
		 }
	     } 

		small=reverse(small);
		greater=reverse(greater);
		System.out.println("reversed :");
		show(small);
		show(greater);
		
		int sum=0;
		int rem=0;
		int carry=0;
		//int data = 0; 
		Node head = null;
		Node end=null;
		while(small!=null&&greater!=null)
		{
		
			sum = small.data+greater.data;
			if(carry!=0)
			{
				sum=sum+carry;
				carry=0;
			}
			if(sum>9)
			{
				carry=sum/10;
				rem=sum%10;
				sum=rem;
			
			}
			
			 Node n=new Node(sum);
				if(head==null) {  
					head=n;
					end=n;
				}
				else 
				{
					end.next=n;
					end=n;
				}
			    
				small=small.next;
				greater=greater.next;
				
		}
	  System.out.println("sum result:");
		show(head);
		head=reverse(head);
	System.out.println("reversed sum result:");
		show(head);
    }

	public static void main(String[] args) {
	LinkedList l1 = new LinkedList();
	LinkedList l2 = new LinkedList();
	l1.insert(4);
	l1.insert(5);
	
	l2.insert(3);
	l2.insert(4);
	l2.insert(5);
	System.out.println("two list to be sum:");
	l1.displayLinkedList(l1.head);
	l2.displayLinkedList(l2.head);
	addElementOfTwoLinkedList(l1.head,l2.head);

	

	}

}
