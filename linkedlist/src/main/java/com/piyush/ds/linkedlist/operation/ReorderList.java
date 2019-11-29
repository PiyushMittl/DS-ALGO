package com.piyush.ds.linkedlist.operation;

public class ReorderList {

	Node head = null;
	// 1->2->3->
	// return 1->3->2
	
	// 12->10->7->34->45->87
	//return 12->87->45->34->7->10
	
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

	public void printList() {
		ReorderList.Node temp = head;
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
     public static Node rotate(Node node,Node current,Node start){
        if(node == null)
        return current;
        else{
            current=rotate(node.next,current,start);
            if(start.data!=node.data)
            {  
              current.next=node;
              current=current.next;
              return current;
            }else {
            	current.next=null;
            }
        }
        return start;
    }

	public static void main(String[] args) {

		ReorderList linkedList = new ReorderList();

		Node node5 = linkedList.new Node(3);
		Node node6 = linkedList.new Node(4);
		Node node7 = linkedList.new Node(5);
		// add node
		linkedList.addLast(node5);
		linkedList.addLast(node6);
		linkedList.addLast(node7);
		// traverse list
		rotate(linkedList.head,linkedList.head,linkedList.head);
		
		System.out.println("\n print after reverse list is :");
		linkedList.printList();

	}
}
