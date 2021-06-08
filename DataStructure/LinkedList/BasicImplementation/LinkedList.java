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

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();

		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node();

		for(Node iter = list.head;iter != null;iter=iter.next) {
			System.out.printf("Data: %d\n", iter.data);
		}
	}

}