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
	public void add(char data, char Ldata, char Rdata) { // ��带 �߰��ϴ� �Լ�
		if(root==null) { 
			root = new node(data);
			// Ldata�� .�� �ƴ϶�� ���� �ڽ� ��� ����
			if(Ldata != '.') root.left = new node(Ldata);
			// Rdata�� .�� �ƴ϶�� ������ �ڽ� ��� ����
			if(Rdata != '.') root.right = new node(Rdata);
		}else {
			//��Ʈ�� null�� �ƴ϶�� Ž��
			search(root, data, Ldata, Rdata);
		}
	}
	public void search(node root, char data, char Ldata, char Rdata) { // ��带 ã�� �Լ�
		if(root==null) return; // ��Ʈ ��尡 null�̸� ����
		else if(root.data==data) {// ��Ʈ����� data�� data�� ���ٸ�
			if(Ldata != '.') root.left = new node(Ldata);
			if(Rdata != '.') root.right = new node(Rdata);
		}else { // �׷��� �ʴٸ�
			search(root.left, data, Ldata, Rdata); // ���� ��� Ž��
			search(root.right, data, Ldata, Rdata); // ������ ��� Ž��
		}
	}
	public void PreOrder(node root) { // ��Ʈ -> �� -> ��
		System.out.print(root.data);
		if(root.left!=null) PreOrder(root.left);
		if(root.right!=null) PreOrder(root.right);
	}
	public void InOrder(node root) { // �� -> ��Ʈ -> ��
		if(root.left!=null) InOrder(root.left);
		System.out.print(root.data);
		if(root.right!=null) InOrder(root.right);
	}
	public void PostOrder(node root) { // �� -> �� -> ��Ʈ
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
		t.PreOrder(t.root); // ���� ��ȸ
		System.out.println();
		t.InOrder(t.root); // ���� ��ȸ
		System.out.println();
		t.PostOrder(t.root); // ���� ��ȸ
	}
}
