package com.gaurav;

public class LinkedList {
	
	public Node add(Node head) {
		int i = 1;
		Node curr = head;
		while(i<=10) {
			curr.next = new Node(i, null);
			curr = curr.next;
			i++;
		}
		
		return head;
	}
	
	public Node reverse(Node head) {
		Node curr = head;
		Node pre  = null;
		while(curr!=null) {
			Node next = curr.next;
			curr.next = pre;
			pre = curr;
			curr = next;
		}
		head = pre;
		return head;
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Node head = new Node(1, null);
		head = list.add(head);
		Node reverseList = list.reverse(head);
		Node curr = reverseList;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
}

class Node {
	int data;
	Node next;
	
	Node(int data,Node next){
		this.data = data;
		this.next = next;
	}
}