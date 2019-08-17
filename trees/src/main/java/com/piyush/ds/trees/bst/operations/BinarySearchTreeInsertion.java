package com.piyush.ds.trees.bst.operations;

public class BinarySearchTreeInsertion {

	public static void main(String[] args) {
		new BinarySearchTreeInsertion().binarySearchTreeInsertion();
	}

	private Node binarySearchTreeInsertion() {
		Node node1 = new Node(50);
		Node node2 = new Node(45);
		Node node3 = new Node(40);
		Node node4 = new Node(35);
		Node node5 = new Node(30);

		addNode(node2, node1);
		addNode(node3, node1);
		addNode(node4, node1);
		addNode(node5, node1);

		return null;
	}

	public Node addNode(Node node, Node root) {
		Node tempHead = root;

		if (tempHead == null) {
			tempHead = node;
			return tempHead;
		}

		while (tempHead != null) {
			if (node.data > tempHead.data) {
				if (tempHead.left == null) {
					tempHead.left = node;
					return tempHead;	
				} else
					tempHead = tempHead.left;
			} else {
				if (tempHead.right == null) {
					tempHead.right = node;
					return tempHead;
				} else
					tempHead = tempHead.right;
			}
		}
		return tempHead;
	}

	class Node {

		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

}
