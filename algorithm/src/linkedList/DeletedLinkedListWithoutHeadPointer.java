package linkedList;
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class Nodes {
    
    int data ;
    Node next;
    
    Nodes(int data)
    {
        this.data = data;
    }
}

class LinkedLists{
    
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
    
    Node getNode(Node head1,int k)
    {
        Node current=head;
        int count=1;
          while(current!=null&&count<k)
        {
           current=current.next;
           count++;
        }
        
        return current;
    }
    
    
    public void deleteNode(Node n)
    {
       	System.out.println("data"+n.data);
       	System.out.println("data"+n.next.data);
       	while(n!=null && n.next!=null){
       	     n.data=n.next.data;
       	      if(n.next.next==null){
              n.next=null;
            }
            n=n.next;
    }

}

}
public class DeletedLinkedListWithoutHeadPointer
{
	public static void main(String[] args) {
		System.out.println("Hello World");
			LinkedLists list = new 	LinkedLists();
	list.insert(10);
    list.insert(20);
    list.insert(30);
	list.insert(40);
    list.insert(50);
	list.insert(60);
    list.insert(70);
    list.show(list.head);
    Node n = list.getNode(list.head,4);
    list.deleteNode(n);
    
    list.show(list.head);
	}
}

