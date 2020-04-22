package linkedList;


class Stack{
	 Node top;
	 
	public void push(int data)
	 {
		 Node newNode = new Node(data);
		 if (top==null)
		 {
			 top = newNode;
		 }
		 else {
			 newNode.next= top;
			 top=newNode;
		 }
	 }
	
	 
	 public int pop()
	 {
		 int deleted;
		 
		 Node temp = top;
		 top=top.next;
		 deleted=temp.data;
		 temp=null;
		 
		return deleted;
		 
	 }
	 
	 public void peek()
	 {
		 System.out.println("top="+top.data);
	 }
	
}

public class implementStackUsingLinkedList {
	

	public static void main(String[] args) {
		
		Stack s = new Stack();
		LinkedList l = new LinkedList();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		l.displayLinkedList(s.top);
		s.peek();
		s.pop();
		s.peek();
		
	}

}
