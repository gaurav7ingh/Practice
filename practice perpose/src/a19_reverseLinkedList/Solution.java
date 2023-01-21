package a19_reverseLinkedList;

import a18_addTwoLinkedList.Node;

public class Solution {

	// This function creates a singly linked list from an array.
	public static Node generateSinglyLinkedList(int[] arr) {
		if (arr.length == 0 || arr == null)
			return null;
		Node SinglyLinkedList = new Node(arr[0]);
		Node temp = SinglyLinkedList;
		for (int i = 1; i < arr.length; i++) {
			temp.next = new Node(arr[i]);
			temp = temp.next;
		}
		return SinglyLinkedList;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		Node list = generateSinglyLinkedList(arr);
		list = reverseLinkedList(list);
		printList(list);
	}

	// This function adds two Singly linked list.
	public static Node reverseLinkedList(Node head) {
		Node current = head;
		Node pre = null;
		while (current != null) {
			Node after = current.next;
			current.next = pre;
			pre = current;
			current = after;
		}
		head = pre;
		return head;
	}

	// This function prints the Singly linked list on a single line.
	public static void printList(Node head) {
		if (head == null)
			return;
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.println("NULL");

	}

}
