package linkedList;
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Node3 {
    
    int data ;
    Node next;
    
    Node3(int data)
    {
        this.data = data;
    }
}

class LinkedList3{
    
    Node head;
    
    public void insert(int data)
    {
        
        if (head==null)
        {
            Node newNode = new Node(data);
            head=newNode;
        }
        
        else {
            Node current = head;
            while(current.next!=null)
            {
                current = current.next;
            }
             Node newNode = new Node(data);
             current.next=newNode;
            
}
    }        

    
    public void show(Node start)
    {
        Node current = start;
        while(current!=null)
        {
           System.out.print(current.data+"->");
           current=current.next;
        }
         System.out.println();
    }
    
    
     public void intersectionLinkedList(Node l1, Node l2, Node newLL)
    {
        
        Node node1=l1;
        Node node2=l2;
        Node node3=newLL;
        
        while(node1.next!=null)
        {
            node1=node1.next;
        }
        node1.next=node3;
        
          while(node2.next!=null)
        {
            node2=node2.next;
        }
        node2.next=node3;
     
     
    }
    
    
      public void findIntersectionPoint(Node l1, Node l2)
    {
        
        Node node1=l1;
        Node node2=l2;
        int size1=0;
        int size2=0;
        int diff =0;
        Node big=l1;
        Node small=l2;
        
        while(node1!=null)
        {
            node1=node1.next;
            size1++;
        }
        
        	System.out.println("lis1 size ="+size1);
          while(node2!=null)
        {
            node2=node2.next;
            size2++;
        }
     
        	System.out.println("list2 size ="+size2);
        	diff=Math.abs(size1-size2);
           System.out.println("diff ="+diff);
        
        	
        	if(size2>size1)
        	{
        	    big=l2;
        	    small=l1;
        	}
     
     
     
          for(int i =0;i<diff;i++)
          {
             big=big.next; 
          }

               while(big!=null)
        {
            if(big.data==small.data)
            {
               System.out.println("intersection point :-" + small.data);  
               break;
            }
            
            big=big.next;
            small=small.next;
        }
     
     
    }
    
   
   
}

public class IntersectionPointOfList
{
   
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		LinkedList3 l1 = new LinkedList3();
	    LinkedList3 l2 = new LinkedList3();
	    LinkedList3 l3 = new LinkedList3();
	    
	    
	    l1.insert(10);
	    l1.insert(20);
	    l1.insert(30);
	    l1.insert(40);
	    l1.insert(50);
	   
	   
	    l2.insert(1);
	    l2.insert(2);
	    l2.insert(3);
	    
	    
	       
	    l3.insert(100);
	    l3.insert(200);
	    l3.insert(300);
	    
	 l1.intersectionLinkedList(l1.head,l2.head,l3.head);   
	    

 	l1.show(l1.head);	
	l2.show(l2.head);
	
	l1.findIntersectionPoint(l1.head,l2.head);
		
	}
}




