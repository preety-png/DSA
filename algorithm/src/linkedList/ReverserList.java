package linkedList;
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
  class Node4 {
    int data;
    Node next;
    Node4(int data){
    this.data=data;
    }
}

class LinkedList4{
  
    Node head;
    
	
    public  void insert(int data)
   {
       
       if(head==null)
       {
         Node newNode = new Node(data);
          head= newNode;
       }
       else{
		Node current = head;
		while (current.next != null) {
			current = current.next; // we'll loop until current.next is null
		}
		Node newNode = new Node(data);
		current.next = newNode;
       }
	}
    
   
   public void printLinkedList(Node head) {
		System.out.println("Printing LinkedList (head --> last) ");
		Node current = head;
		while (current != null) {
				System.out.print(current.data+"->");
			current = current.next;
		}
		System.out.println();
	}
	   Node prev=null;
	public void reverseLinkedList()
    {
        Node current=head;
   //  Node after=null;
     //Node prev=null;
     while(current!=null){
     Node after=current.next;
     current.next=prev;
     prev=current;
     
     current=after;
     // return prev; 
     head=prev;
     } 
    }
}


public class ReverserList
{

	public static void main(String[] args) {
	   LinkedList4 list = new LinkedList4();
	    
	    System.out.println("start");
	    list.insert(10);
	     list.insert(20);
	      list.insert(30);
	       list.insert(40);
	        list.insert(50);
	      list.printLinkedList(list.head);
	      
	      list.reverseLinkedList();
	      list.printLinkedList(list.head);

		
	}
}



