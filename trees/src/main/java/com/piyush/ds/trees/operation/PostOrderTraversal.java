package com.piyush.ds.trees.operation;

import java.util.Stack;

/**
 * 
 * @author Piyush Mittal
 *
 */

public class PostOrderTraversal {

	public static void main(String[] args) {
		Node root=new PostOrderTraversal().createTree();
		new PostOrderTraversal().levelOrderTraversal(root);
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
	
	
	
	Stack<Node> stack1=new Stack<>();
	Stack<Node> stack2=new Stack<>();
	
	void levelOrderTraversal(Node root) {
		Node node=root;
		stack1.push(node);
		
		while(!stack1.isEmpty())
		{
			node=stack1.pop();
			stack2.push(node);
			
			if(node.left!=null)
				stack1.push(node.left);			
			if(node.right!=null)
				stack1.push(node.right);
		}
		
		while(!stack2.isEmpty())
			System.out.println(stack2.pop().data);
	}

}
