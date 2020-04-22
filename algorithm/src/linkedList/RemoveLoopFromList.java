package linkedList;
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class Node1 {
    
    int data ;
    Node next;
    
    Node1(int data)
    {
        this.data = data;
    }
}

class LinkedList1{
    
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
    
    public void createLoopList(Node node, int pos)
    {
      Node node1 =node;
       Node node2 =node;
      int count =0;
      while(node1!=null&& pos-1> count)
      {
      
          node1=node1.next;
          count++;
    
      }
      
         while(node2.next!=null)
      {  System.out.print( node2.data+"->");
      
          node2=node2.next;
      
    
      }
       System.out.print( node2.data+"->");
          node2.next=node1;
           System.out.println(node2.next.data + "->");
        
    }
    
    //floyd alogrithm slow and fast
    
   public int detectLoop(Node node)
    {
        int position =1;
        Node slow=node;
        Node fast=node;
        
        while(slow!=null && fast!=null&&fast.next!=null)
        {
              position++;
           slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
         
               System.out.println("looped detected is "+ fast.data);   
               break;
              
             
            }
         
        
            
        }
        
     return position;
    
    } 
    
   public void findFirstElementInloopAndRemove(Node head2 , int postitionOfLoopDetected)
    {
        Node temp1=head2;
        Node temp2=head2;
        int count =0;
        while(postitionOfLoopDetected-1>count)
        {
            count++;
            temp2=temp2.next;
        }
        
        //   System.out.println("data="+ temp2.data);   
           
           while(temp1!=null&&temp2!=null &&temp1.next!=temp2.next)
           {
               temp1=temp1.next;
               temp2=temp2.next;
           }
           
           System.out.println("fisrt Element in loop ="+ temp2.next.data);  
          temp2.next=null;
           
    }

}
public class RemoveLoopFromList
{
	public static void main(String[] args) {
	LinkedList1 list = new 	LinkedList1();
	list.insert(10);
    list.insert(20);
    list.insert(30);
	list.insert(40);
    list.insert(50);
	list.insert(60);
    list.insert(70);
    list.show(list.head);
  list.createLoopList(list.head,4);
  int loopPosition=list.detectLoop(list.head);
  if(loopPosition!=0){
  
       list.findFirstElementInloopAndRemove(list.head,loopPosition);
       	System.out.println("After Loop removed");
      	 list.show(list.head);
  }
  
  
    
 }
}








