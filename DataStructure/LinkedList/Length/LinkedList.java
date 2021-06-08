public class LinkedList{

	public class Node{
		int data;
		Node next;
	}

	Node head;

	public int Length(){
		int count = 0;
		Node temp = head;

		while(temp!=null){
			count++;
			temp = temp.next;
		}

		return count;

	}

	public void append(int data){
		if(head == null){
			head = new Node();
			head.data = data;
			return;
		}

		Node temp = head;

		while(temp.next!=null){
			temp = temp.next;
		}

		temp.next = new Node();
		temp.next.data = data;

	}


	public static void main(String[] args){
		LinkedList list = new LinkedList();

		list.append(1);
		list.append(2);
		list.append(3);

		System.out.println(list.Length());
	}

}