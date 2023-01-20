package a18_addTwoLinkedList;

public class Solution {
	// This function adds two Singly linked list.
	public static Node addTwoLinkedList(Node head1, Node head2) {
		Node node = new Node(0);
		Node curr = node;
		int carry = 0;
		while (head1 != null || head2 != null) {
			int sum = carry;
			if (head1 != null) {
				sum += head1.data;
				head1 = head1.next;
			}
			if (head2 != null) {
				sum += head2.data;
				head2 = head2.next;
			}
			carry = sum / 10;
			sum = sum % 10;
			curr.next = new Node(sum);
			curr = curr.next;
		}
		return node.next;
	}

	// This function prints the Singly linked list on a single line.
	public static void printList(Node head) {
		if (head == null)
			return;
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

	}

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

	// Main Function
	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 3 }; // input array
		int[] arr2 = { 5, 6, 4 }; // input array
		Node head1 = generateSinglyLinkedList(arr1);
		Node head2 = generateSinglyLinkedList(arr2);
		Node ans = addTwoLinkedList(head1, head2);
		printList(ans);

	}
}
