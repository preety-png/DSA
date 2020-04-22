package linkedList;


class Queue{
	 Node rear;
	 Node front;
	 
	public void enqueue(int data)
	 {
		 Node newNode = new Node(data);
		 if (front==null&&rear==null)
		 {
			front =newNode;
		    rear=newNode;
		 }
		 else
			 rear.next=newNode;
		     rear=newNode;
	 }
	
	 
	 public int dequeue()
	 {
		 int deleted;
		 
		 Node temp = front;
		 front=front.next;
		 if(front==null)
		 {
			 rear=null;
		 }
		 deleted=temp.data;
		 temp=null;
		 
		return deleted;
		 
	 }
	
}

public class implementQueueUsingLinkedList {
	

	public static void main(String[] args) {
		
		Queue q = new Queue();
		LinkedList l = new LinkedList();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		l.displayLinkedList(q.front);
		System.out.println("front="+q.front.data);
		System.out.println("rear="+q.rear.data);
		q.dequeue();
		System.out.println("front="+q.front.data);
		System.out.println("rear="+q.rear.data);
		
	}

}
