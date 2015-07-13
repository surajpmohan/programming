package org.bn.programming;

public class Stack<E> {
	public class Node<F>{
		public Node<F> getNext() {
			return next;
		}
		public void setNext(Node<F> next) {
			this.next = next;
		}
		public F getData() {
			return data;
		}
		public void setData(F data) {
			this.data = data;
		}
		private Node<F> next;
		private F data;
	}
	private Node<E> top=null;
	public void push(E value){
		Node<E> node = new Node<E>();
		node.setData(value);
		if(top==null){
			top = node;
		}
		else{
			node.setNext(top);
			top = node;
		}
	}
	public E pop(){
		if(top!=null){
			E data = top.getData();
			top = top.getNext();
			return data;
		}
		return null;
	}
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0; i<100; i++){
			stack.push(i);
		}
		int data;
		while((data=stack.pop())!=0){
			System.out.println(data);
		}
	}

}
