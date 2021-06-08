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
			System.out.println("\nempty");
			return;
		}else{
			System.out.println("");
		}

		Node iter = head;

		while(iter.next!=null){
			System.out.print(iter.data+" ");
			iter = iter.next;
		}

		System.out.print(iter.data+" ");
	}

	void deleteByKey(int key){

		Node temp = head;

		if(temp!=null&&temp.data==key){
			head = head.next;
			return;
		}

		Node prev = temp;

		while(temp!=null&&temp.data!=key){
			prev = temp;
			temp = temp.next;
		}

		if(temp==null){
			// key is not present
			System.out.print("\n Key not found");
			return;
		}

		prev.next=temp.next;
	}

	void deleteByPosition(int pos){

		if(pos==0){
			head = head.next;
			return;
		}

		Node temp = head;

		for(int i=0;temp!=null&&i<pos-1;i++){
			temp = temp.next;
		}

		if(temp==null){
			// given position is greater than length of linked list
			System.out.print("\n Position greater than length");
			return;
		}

		temp.next = temp.next.next;
	}

	void deleteLinkedList(){
		head = null;
	}


	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list.append(6); // 6
		list.push(7); // 7 6
		list.push(1); // 1 7 6
		list.append(4); // 1 7 6 4
		list.insertAfter(1, 8); // 1 7 8 6 4
		list.append(10); // 1 7 8 6 4 10
		list.append(11); // 1 7 8 6 4 10 11
		list.printList();  // 1 7 8 6 4 10 11

		list.deleteByKey(1); // 7 8 6 4 10 11
		list.printList();  // 7 8 6 4 10 11
		list.deleteByKey(6); // 7 8 4 10 11
		list.printList();   // 7 8 4 10 11
		list.deleteByKey(100); // 7 8 4 10 11
		list.printList();  // 7 8 4 10 11

		list.deleteByPosition(0); // 8 4 10 11
		list.printList();  // 8 4 10 11
		list.deleteByPosition(2); // 8 4 11
		list.printList();  // 8 4 11
		list.deleteByPosition(10); // 8 4 11
		list.printList();  // 8 4 11

		list.deleteLinkedList(); // empty
		list.printList();  // empty

	}

}