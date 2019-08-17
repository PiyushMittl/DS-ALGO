package com.piyush.ds.trees.bst.operations;

/**
 * 
 * @author Piyush Mittal
 *
 *this is a sample program to demonstrate insertion operation for BST
 *
 */
public class BinarySearchTreeInsertionRec {

	public static void main(String[] args) {
		new BinarySearchTreeInsertionRec().binarySearchTreeInsertion();
	}

	private Node binarySearchTreeInsertion() {
		Node node1 = new Node(50);
		Node node2 = new Node(45);
		Node node3 = new Node(60);
		Node node4 = new Node(35);
		Node node5 = new Node(30);

		addNode(node2, node1);
		addNode(node3, node1);
		addNode(node4, node1);
		addNode(node5, node1);

		return null;
	}

	public Node addNode(Node node, Node root) {

		if (root == null) {
			return node;
		}
		if (node.data > root.data) {
			System.out.println("going right");
			root.left = addNode(node, root.left);
		} else if (node.data < root.data) {
			System.out.println("going left");
			root.right = addNode(node, root.right);
		}
		
		System.out.println(root.data);
		return root;
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
