package com.piyush.ds.trees.binary.operation;

import java.util.Stack;

/**
 * 
 * @author Piyush Mittal
 *
 */

public class PreOrderTraversal {

	public static void main(String[] args) {
		Node root=new PreOrderTraversal().createTree();
		new PreOrderTraversal().levelOrderTraversal(root);
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
	
	
	
	Stack<Node> stack=new Stack<>();
	void levelOrderTraversal(Node root) {
		Node node=root;
		stack.push(node);
		
		while(!stack.isEmpty())
		{
			node=stack.pop();
			System.out.println(node.data);

			
			if(node.right!=null)
				stack.push(node.right);
			if(node.left!=null)
				stack.push(node.left);			
		}
	}

}
