package linkedList;
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Node2 {
    
    int data ;
    Node next;
    
    Node2(int data)
    {
        this.data = data;
    }
}

class LinkedList2{
    
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
    
    
    public void findMiddle(Node start)
{
    Node current = start;
    int count=0;
    int mid =0;
     while(current!=null)
        {
           current=current.next;
           count++;
        }
        
        	System.out.println(count);
        if(count%2==0)
        {
            mid = count/2;
        }
        
        else {
            mid = 1 + count/2; 
        }
        	System.out.println(mid);
        
        count=1;
        current = start;
         while(current!=null && count<mid)
        {
           
           current=current.next;
            count++;
            
         
        }
        	System.out.println(current.data);
}

    
}


public class FindMidOfList
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	LinkedList2 list = new 	LinkedList2();
	list.insert(10);
    list.insert(20);
    list.insert(30);
	list.insert(40);
    list.insert(50);
	list.insert(60);
    //list.insert(70);
    list.show(list.head);
    list.findMiddle(list.head);
		
	}
}

