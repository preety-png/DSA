package linkedList;
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Node5{
    int data;
    Node next;
    
    Node5(int data)
    {
      this.data=data;
        
    }
}

class LinkedList5{
    
    Node head;
    
    
    public void insert(int data)
    {
    
        if(head==null) {
        Node newNode = new Node(data);
         head=newNode;
        }
    else{
        Node current=head;
        while(current.next!=null)
        {
           current= current.next;
        }
        
        Node newNode = new Node(data);
		current.next = newNode;
    
    }
    }
    
    
    
    public void printLinkedList(Node head)
    {
        
       Node current=head;
        while(current!=null)
        {
         System.out.print(current.data+"->");
           current= current.next;
             
        }  
        System.out.println();
    }
    
      
    public Node reverseLinkedListInGroup(Node n, int k)
    {
        Node current = n;
        Node temp =null;
        Node prev= null;
        int count =0;
        while(current!= null && count<k)
        {
             temp = current.next;
             current.next = prev;
             prev=current;
             current = temp;
           count++;  
            
        }
        
        if(temp!=null)
        
        {
        	n.next =
        	reverseLinkedListInGroup(temp,k);
        }
      
      return prev;
    }

}

public class ReverseListInGroup
{
	public static void main(String[] args) {
	    LinkedList5 list = new LinkedList5();
	     System.out.println("insert");
	    list.insert(10);
	    list.insert(20);
	    list.insert(30);
	    list.insert(40);	    
	    list.insert(50);	   
	    list.insert(60);
	    list.insert(70);	   
	    list.insert(80);
	    
	    list.printLinkedList(list.head);
	   System.out.println("reversed in group --\n");
	   
	   list.printLinkedList(list.reverseLinkedListInGroup(list.head,3));

	}
	
}



