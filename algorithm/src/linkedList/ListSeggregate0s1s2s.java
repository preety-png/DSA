package linkedList;

public class ListSeggregate0s1s2s {
	
	
	public static void seggregateFirstMethod(Node head)
	{
		Node current=head;
		Node zeros = null;
		Node ones=null;
		Node twos=null;
		
	 Node tail0 = null;
	 Node tail1=null;
	 Node tail2=null;
	 
	 
		while(current!=null)
		{
		if(current.data==0)	
		{
			if(zeros==null) {
				zeros=new Node(0);
				tail0=zeros;
			}
			else {
			tail0.next=new Node(0);
			tail0=tail0.next;
			}
			
		
		}
		
		if(current.data==1)
		{
			if(ones==null) {
				ones=new Node(1);
				tail1=ones;
			}
			else {
			tail1.next=new Node(1);
			tail1=tail1.next;
			}
		
		}
		
		if(current.data==2)
		{
			if(twos==null) {
				twos=new Node(2);
				tail2=twos;
			}
			else {
			tail2.next=new Node(2);
			tail2=tail2.next;
			}
		
		}
		current=current.next;
		}
		LinkedList l2 = new LinkedList();
//		l2.displayLinkedList(zeros);
//		l2.displayLinkedList(ones);
//	    l2.displayLinkedList(twos);
	    tail0.next=ones;
	    tail1.next=twos;
	    l2.displayLinkedList(zeros);
	    
	}

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.insert(1);
		l1.insert(2);
		l1.insert(2);
		l1.insert(1);
		l1.insert(2);
		l1.insert(0);
		l1.insert(2);
		l1.insert(2);
		l1.displayLinkedList(l1.head);
		System.out.println("seggreagate....");
		seggregateFirstMethod(l1.head);
	
		//1 2 2 1 2 0 2 2

	}

}
