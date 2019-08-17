package com.piyush.ds.trees.bst.operations;

import java.util.Stack;

/**
 * 
 * @author Piyush Mittal
 *
 *         this is a sample program to demonstrate deletion operation for BST
 *
 */
public class BinarySearchTreeDeletionA {

	public static void main(String[] args) {
		new BinarySearchTreeDeletionA().binarySearchTreeInsertion();
	}

	private Node binarySearchTreeInsertion() {
		Node root = new Node(20);

		// adding nodes to bst
		addNode(new Node(15), root);
		addNode(new Node(25), root);
		addNode(new Node(18), root);
		addNode(new Node(10), root);
		addNode(new Node(16), root);
		addNode(new Node(19), root);
		addNode(new Node(17), root);

		levelOrderTraversal(root);
		deleteNode(root, new Node(15));
		System.out.println("\n");
		levelOrderTraversal(root);
		return null;
	}

	public Node searchNode(Node root, Node searchNode) {

		while (root != null) {
			if (root.data > searchNode.data)
				root = root.left;
			else if (root.data < searchNode.data)
				root = root.right;
			else if (root.data == searchNode.data)
				return root;
		}
		return null;
	}

	public Node deleteNode(Node root, Node deleteNode) {

		// Check if tree is empty or not
		if (root == null)
			return null;

		// Search the location of the node to be deleted
		// Node deleteNode = searchNode(root, deleteNode);
		if (root.data > deleteNode.data)
			root.left = deleteNode(root.left, deleteNode);
		else if (root.data < deleteNode.data)
			root.right = deleteNode(root.right, deleteNode);

		else {

			// Condition 1:
			// if there no left and right child of the node to be deleted
			if (root.left == null && root.right == null) {
				root = null;
				return root;
			}
			// Condition 2:
			// if there is only one left or right child is available
			else if (root.left != null && root.right==null) {
				Node temp = root.left;
				root.left = null;
				root = temp;
				return root;
			} else if (root.right != null && root.left==null) {
				Node temp = root.right;
				root.right = null;
				root = temp;
				return root;
			}
			// Condition 3:
			// if there is both left and right child is available
			else {
				// find minimum from left
				Node minimum = findMinimum(root.right);
				root.data = minimum.data;
				deleteNode(root.right, minimum);
			}
		}
		return root;

	}

	private Node findMinimum(Node node) {

		if (node.left == null)
			return node;
		else
			return findMinimum(node.left);

	}

	public Node addNode(Node node, Node root) {

		if (root == null) {
			return node;
		}
		if (node.data > root.data) {
			root.right = addNode(node, root.right);
		} else if (node.data < root.data) {
			root.left = addNode(node, root.left);
		}
		return root;
	}

	Stack<Node> stack = new Stack<>();

	void levelOrderTraversal(Node root) {
		Node node = root;

		while (node != null || !stack.empty()) {
			// push node left till its empty
			while (node != null) {
				stack.push(node);
				node = node.left;
			}
			node = stack.pop();
			System.out.print(node.data + " ");
			node = node.right;
		}
	}

	/**
	 * 
	 * @author Piyush Mittal
	 * 
	 *         Node class which has left,right pointer and data
	 *
	 */
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
