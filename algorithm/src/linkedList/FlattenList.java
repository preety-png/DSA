package linkedList;


class Node2d{

int data;
Node2d next=null;
Node2d bottom=null;
public Node2d(int data) {
 this.data =data;
}


}

class LinkedList2d{

Node head;

void insert(Node2d h,int data)	
{
	Node2d newNode = new Node2d(data);
	
	newNode.bottom=h;
	h=newNode;
}


void printList(Node2d n)
{
	
	
	while(n!=null)
	{
		System.out.print(n.data +"->");
		n=n.bottom;
	}
	System.out.println();
}
}

public class FlattenList {
	
   // 5 -> 10 -> 19 -> 28
   // |    |     |     |
   // V    V     V     V
   // 7    20    22    35
   // |          |     |
   // V          V     V
   // 8          50    40
   // |                |
   // V                V
    //30               45
	



	public static void main(String[] args) {
		LinkedList2d list = new LinkedList2d();
	//	list.insert(h, data);
		

	}

}


