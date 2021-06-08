class LinkedList{

	Node head;

	class Node{
		Node next;
		int data;
	}

	void push(int data){

		Node newNode = new Node();

		newNode.data = data;
		newNode.next = head;
		head = newNode;

	}

	void append(int data){

		if(head == null){
			push(data);
			return;
		}

		Node newNode = new Node();
		newNode.data = data;

		Node iter = head;

		while(iter.next!=null){
			iter = iter.next;
		}

		iter.next = newNode;

	}

	void insertAfter(int n, int data){

		if(head == null){
			push(data);
			return;
		}

		Node iter = head;

		while(iter.next!=null&&n>0){
			iter = iter.next;
			n--;
		}

		Node newNode = new Node();
		newNode.data = data;
		newNode.next = iter.next;
		iter.next = newNode;

	}

	void printList(){
		if(head==null){
			return;
		}

		Node iter = head;

		while(iter.next!=null){
			System.out.print(iter.data+" ");
			iter = iter.next;
		}

		System.out.print(iter.data+" ");
	}

	Node GetNthNode(int n){

		Node temp = head;

		while(temp!=null){
			if (n==0){
				return temp;
			}
			temp = temp.next;
			n--;
		}

		return null;
	}

	Node GetNthNodeFromLast(int n){

		Node temp1 = head, temp2 = GetNthNode(n); 

		if(temp2 == null){
			return null;
		}

		while(temp2.next!=null){
			temp2 = temp2.next;
			temp1 = temp1.next;
		}

		return temp1;
	}


	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list.append(6);
		list.push(7);
		list.push(1);
		list.append(4);
		list.insertAfter(1, 8);
		list.printList();

		System.out.println("\n");
		System.out.println(list.GetNthNodeFromLast(10));
		System.out.println(list.GetNthNodeFromLast(0).data);
		System.out.println(list.GetNthNodeFromLast(1).data);
		System.out.println(list.GetNthNodeFromLast(3).data);
		System.out.println(list.GetNthNodeFromLast(5));
		System.out.println(list.GetNthNodeFromLast(6));
	}

}