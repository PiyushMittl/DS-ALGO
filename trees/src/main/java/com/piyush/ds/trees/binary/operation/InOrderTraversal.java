package com.piyush.ds.trees.binary.operation;

import java.util.LinkedList;
import java.util.Stack;

/**
 * this progran demonstrate how to create a binary tree
 * traverse that created binary tree in in-order or LNR  
 * 
 * @author Piyush Mittal
 *
 */

public class InOrderTraversal {

	public static void main(String[] args) {
		Node root=new InOrderTraversal().createTree();
		new InOrderTraversal().levelOrderTraversal(root);
	}
	
	
	Node node;
	
	class Node {
		int data;
		Node left;
		Node right;
		
		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	/**
	 * creating a tree
	 * 
	 * @return
	 */
	Node createTree() {
		Node root=new Node(10, null, null);
		
		/* following is the tree after above statement 
			  
	        10 
	      /   \ 
	    null  null     
	    
	    */
		
		root.left=new Node(8,null,null);
		root.right=new Node(12,null,null);

		
		/* following is the tree after above statement 
			  
	        10 
	      /   \ 
	     8     12     
	    
	    */		
		
		root.left.left=new Node(5,null,null);
		root.left.right=new Node(9,null,null);

		/* following is the tree after above statement 
			  
	        10 
	      /   \ 
	     8     12     
	   /   \ 
	  5     9     
	
     */		
	return root;	
	}
	
	
	/**
	 * traversing a tree in in-order
	 */
	Stack<Node> stack=new Stack<>();
	void levelOrderTraversal(Node root) {
		Node node=root;	
		
		while(node!=null || !stack.empty()) {
		//push node left till its empty
		while(node!=null) {
			stack.push(node);
			node=node.left;
		}
			node=stack.pop();
			System.out.println(node.data);
			node=node.right;
		}
	}

}