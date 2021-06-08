import java.util.*;

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

	boolean DetectLoop1(){

		Node temp = head;
		HashSet<Node> set = new HashSet<Node>(); 

		while(temp!=null){
			if(set.contains(temp)){
				return true;
			}
			set.add(temp);
			temp = temp.next;
		}

		return false;
	}

	boolean DetectLoop2(){

		Node temp1 = head, temp2 = head;

		while(temp2!=null&&temp2.next!=null){
			temp1 = temp1.next;
			temp2 = temp2.next.next;
			if(temp1 == temp2){
				return true;
			}
		}

		return false;
	}


	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list.append(6);
		list.push(7);
		list.push(1);
		list.append(4);
		list.insertAfter(1, 8);
		System.out.println(list.DetectLoop1());
		System.out.println(list.DetectLoop2());


		LinkedList list2 = new LinkedList(); 
        list2.push(20);
        list2.push(4);
        list2.push(15);
        list2.push(10);
        list2.head.next.next.next.next = list2.head;
		System.out.println(list2.DetectLoop1());
		System.out.println(list2.DetectLoop2());

		LinkedList list3 = new LinkedList(); 
        list3.push(20);
        list3.head.next = list3.head;
		System.out.println(list3.DetectLoop1());
		System.out.println(list3.DetectLoop2());

		LinkedList list4 = new LinkedList(); 
        list4.push(20);
        list4.push(10);
        list4.head.next.next = list4.head;
		System.out.println(list4.DetectLoop1());
		System.out.println(list4.DetectLoop2());

	}

}