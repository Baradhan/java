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

	int GetCountOfTheKey(int key){

		int count = 0;
		Node temp = head;

		while(temp!=null){
			if(temp.data == key){
				count++;
			}
			temp = temp.next;
		}

		return count;
	}

	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list.append(6);
		list.append(9);
		list.push(7);
		list.push(1);
		list.append(4);
		list.insertAfter(1, 8);
		list.append(1);
		list.append(1);
		list.append(9);
		list.append(7);
		list.append(1);
		list.append(9);
		list.append(7);
		list.append(8);
		list.append(9);
		list.append(1);

		list.printList();
		System.out.print("\n");
		System.out.println("1 Count:"+list.GetCountOfTheKey(1));
		System.out.println("9 Count:"+list.GetCountOfTheKey(9));
		System.out.println("7 Count:"+list.GetCountOfTheKey(7));
		System.out.println("8 Count:"+list.GetCountOfTheKey(8));
		System.out.println("4 Count:"+list.GetCountOfTheKey(4));

	}

}