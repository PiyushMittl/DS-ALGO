package com.piyush.ds.linkedlist.operation;

public class SinglyLinkedList {

	Node head = null;

	public class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addFirst(Node node) {
		// if head is null then inserted node is first node
		// else insert the node at beginning of list
		if (head == null)
			head = node.next;
		else
			node.next = head;
		head = node;
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

	public void addBeforeNthNode(int nthIndex, Node node) {

		if (head == null) {
			System.out.println("list is empty");
		} else {
			Node temp = head;
			int i = 0;
			while (i < nthIndex) {
				i++;
				if (temp.next == null)
					break;
				else
					temp = temp.next;
			}
			if (temp.next != null || (nthIndex == i && temp.next == null)) {
				Node prev = temp.next;
				node.next = prev;
				temp.next = node;
			} else
				System.out.println("\n index is greater than list size and should be less than list zise");
		}
	}

	public void addAfterNthNode(int nthIndex) {

	}

	public void printList() {
		SinglyLinkedList.Node temp = head;
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		SinglyLinkedList linkedList = new SinglyLinkedList();

		Node node1 = linkedList.new Node(1);
		Node node2 = linkedList.new Node(2);
		Node node3 = linkedList.new Node(3);
		Node node4 = linkedList.new Node(4);
		// add node
		linkedList.addFirst(node1);
		linkedList.addFirst(node2);
		linkedList.addFirst(node3);
		linkedList.addFirst(node4);
		// traverse list
		System.out.println("\n node inserted at beginning and list is :");
		linkedList.printList();

		Node node5 = linkedList.new Node(5);
		Node node6 = linkedList.new Node(6);
		Node node7 = linkedList.new Node(7);
		Node node8 = linkedList.new Node(8);
		// add node
		linkedList.addLast(node5);
		linkedList.addLast(node6);
		linkedList.addLast(node7);
		linkedList.addLast(node8);
		// traverse list
		System.out.println("\n node inserted at last and list is :");
		linkedList.printList();

		Node node100 = linkedList.new Node(100);
		linkedList.addBeforeNthNode(50, node100);
		// traverse list
		System.out.println("node inserted at middle and list is :");
		linkedList.printList();

	}
}
