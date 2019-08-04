package com.piyush.ds.trees.operation;

import java.util.LinkedList;
import java.util.Queue;

/**
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
	
	
	
	Queue<Node> q=new LinkedList<>();
	void levelOrderTraversal(Node root) {
		Node temp=root;
		q.add(temp);

		while(!q.isEmpty())
		{
			Node node=q.poll();
			System.out.println(node.data);

			
			if(node.left!=null)
				q.add(node.left);
			if(node.right!=null)
				q.add(node.right);
			
		}
		
	}

}
