package BOJ;

import java.util.Scanner;
class node{
	char data;
	node left,right;
	public node(char data) {
		this.data = data;
	}
}
class tree{
	node root;
	public void add(char data, char Ldata, char Rdata) {
		if(root==null) {
			root = new node(data);
			if(Ldata != '.') root.left = new node(Ldata);
			if(Rdata != '.') root.right = new node(Rdata);
		}else {
			search(root, data, Ldata, Rdata);
		}
	}
	public void search(node root, char data, char Ldata, char Rdata) {
		if(root==null) return;
		else if(root.data==data) {
			if(Ldata != '.') root.left = new node(Ldata);
			if(Rdata != '.') root.right = new node(Rdata);
		}else {
			search(root.left, data, Ldata, Rdata);
			search(root.right, data, Ldata, Rdata);
		}
	}
	public void PreOrder(node root) {
		System.out.print(root.data);
		if(root.left!=null) PreOrder(root.left);
		if(root.right!=null) PreOrder(root.right);
	}
	public void InOrder(node root) {
		if(root.left!=null) InOrder(root.left);
		System.out.print(root.data);
		if(root.right!=null) InOrder(root.right);
	}
	public void PostOrder(node root) {
		if(root.left!=null) PostOrder(root.left);
		if(root.right!=null) PostOrder(root.right);
		System.out.print(root.data);
	}
}

public class BOJ_1991 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		tree t = new tree();
		for(int i = 0;i<n;i++) {
			t.add(sc.next().charAt(0),sc.next().charAt(0),sc.next().charAt(0));
		}
		sc.close();
		t.PreOrder(t.root);
		System.out.println();
		t.InOrder(t.root);
		System.out.println();
		t.PostOrder(t.root);
	}
}
