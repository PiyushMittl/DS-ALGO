package com.piyush.ds.trees.operation;

/**
 * 
 * @author Piyush Mittal
 *
 */

public class CreatingBinaryTree {

	public static void main(String[] args) {
		new CreatingBinaryTree().createTree();
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

	void createTree() {
		CreatingBinaryTree tree=new CreatingBinaryTree();
		Node node = new Node(10, null, null);
		
		/* following is the tree after above statement 
			  
	        10 
	      /   \ 
	    null  null     
	    
	    */
		
		tree.node= node;
		tree.node.left=new Node(8,null,null);
		tree.node.right=new Node(12,null,null);

		
		/* following is the tree after above statement 
			  
	        10 
	      /   \ 
	     8     12     
	    
	    */		
		
		tree.node.left.left=new Node(5,null,null);
		tree.node.left.right=new Node(9,null,null);

		/* following is the tree after above statement 
			  
	        10 
	      /   \ 
	     8     12     
	   /   \ 
	  5     9     
	
     */		

		
	}

}
