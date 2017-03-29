package com.aditya.collections;

public class MyLinkedList<T> {
	
	private Node head;
	private int counter;
	
	public MyLinkedList(){
		
	}
	
	public void add(T data){
		if(head==null){
			head = new Node(data);
		}
		
		Node temp = new Node(data);
		Node currentNode = head;
		
		if(currentNode.getNext()!=null){
			while(currentNode.getNext()!=null){
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(temp);
		}
	}
	
	public T get(int index){
		Node currentNode=null;
		if(index<0){
			return null;
		}
		if(head!=null){
			currentNode = head;
		}
	}
	public boolean remove(int index){
		Node currentNode = head;
		for (int i=0; i<index; i++){
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(currentNode.getNext().getNext());
		counter--;
		return true;
	}
	

	private class Node{
		Node next;
		T data;
		
		public Node (T data){
			this.next = null;
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}
		
		
	}
}
