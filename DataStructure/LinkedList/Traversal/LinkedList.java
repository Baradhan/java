class LinkedList {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
		}

		Node() {
		}
	}

	void printList(){

		for(Node iter = head;iter != null;iter=iter.next) {
			System.out.printf("Data: %d\n", iter.data);
		}

	}

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();

		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node();

		list.printList();
	}

}