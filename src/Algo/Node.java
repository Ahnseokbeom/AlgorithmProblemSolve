package Algo;

public class Node {
	static class node{
		int value;
		node next;
		public node(int value, node next) {
			this.value=value;
			this.next=next;
		}
		public void printAll() {
			if(value==0) return;
			System.out.printf("%d ",this.value);
			if(next != null) next.printAll();
		}
	}
	public static void main(String[] args) {
		node root = null;
		for(int i = 1;i<=10;i++) {
			root = new node(i,root);
		}
		root.printAll();
	}

}
