package com.piyush.ds.linkedlist.operation;

/**
 * 
 * @author Piyush Mittal
 *
 *this program is used to find the middle element to the linked list without knowing the lenght
 */
public class FindMidElement {

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
		if (head == null)
			head = node;
		else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;

			temp.next = node;
		}
	}

	public void findMiddle() {

		if (head == null)
			System.out.println("list is empty");
		else {
			FindMidElement.Node temp = head;
			FindMidElement.Node mid = head;

			while (temp.next != null) {
				// incrementing temp pointer by 2
				temp = temp.next;
				if (temp.next != null)
					temp = temp.next;
				
				//incrementinf mid pointer by 1
				mid = mid.next;
			}
			System.out.println(mid.data);
		}
	}

	public static void main(String[] args) {

		FindMidElement linkedList = new FindMidElement();

		for (int i = 0; i < 20; i++) {
			// add node
			linkedList.addLast(linkedList.new Node(i));
		}

		// traverse list
		System.out.println("mid element of a list is :");
		linkedList.findMiddle();

	}
}
