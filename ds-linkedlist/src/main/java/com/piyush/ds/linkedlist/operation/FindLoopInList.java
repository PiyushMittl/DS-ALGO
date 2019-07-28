package com.piyush.ds.linkedlist.operation;

/**
 * 
 * @author Piyush Mittal
 *
 *         this program is used to find the middle element to the linked list
 *         without knowing the lenght
 */
public class FindLoopInList {

	Node head = null;

	public class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addLast(Node node) {

		// if head is null then list is empty
		// else traverse the list till its last element and then insert the element
		// behind
		// connecting added node with last node
		if (head == null) {
			head = node;
			node.next = head;
		} else {
			Node temp = head;
			while (temp.next != head)
				temp = temp.next;

			temp.next = node;
			node.next = head;
		}
	}

	public void findLoop() {

		if (head == null)
			System.out.println("list is empty");
		else {
			FindLoopInList.Node temp = head;
			FindLoopInList.Node mid = head;

			while (temp.next != null) {
				// incrementing temp pointer by 2
				temp = temp.next;
				if (temp.next != null) {
					temp = temp.next;
				}
				mid = mid.next;
				System.out.println(temp.data + "    " + mid.data);
				if (temp.data == mid.data) {
					System.out.println("there is a loop in list");
					break;
				}
			}
			System.out.println(mid.data);
		}
	}

	public static void main(String[] args) {

		FindLoopInList linkedList = new FindLoopInList();

		for (int i = 0; i < 20; i++) {
			// add node
			linkedList.addLast(linkedList.new Node(i));
		}

		// traverse list
		linkedList.findLoop();

	}
}
