package linkedList;
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

    
    class Node6 {
    
    int data ;
    Node next;
    
    Node6(int data)
    {
        this.data = data;
    }
}

class LinkedList6{
    
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
    
    
    
    public Node rotateLinkedList(Node n,int k)
    {
        Node current = n;
    for(int i =0;i<k-1;i++)
    {
        current= current.next;
        
    }
    
    Node rotated =current.next; 
    Node temp = rotated;

    current.next=null;
     
     while(rotated.next!=null)
     {
         rotated=rotated.next;
         
     }
     rotated.next=n;
     head=temp;
     return rotated;
        
    }
    
   
    
}   
public class RotateList
{    
	public static void main(String[] args) {
	System.out.println("Hello World");
	LinkedList6 list = new LinkedList6();
	list.insert(10);
    list.insert(20);
    list.insert(30);
	list.insert(40);
    list.insert(50);
	list.insert(60);
	list.show(list.head);
	list.rotateLinkedList(list.head, 3);
	list.show(list.head);
	}
}


