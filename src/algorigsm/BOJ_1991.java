package algorigsm;

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
	public void add(char data, char Ldata, char Rdata) { // 노드를 추가하는 함수
		if(root==null) { 
			root = new node(data);
			// Ldata가 .이 아니라면 왼쪽 자식 노드 생성
			if(Ldata != '.') root.left = new node(Ldata);
			// Rdata가 .이 아니라면 오른쪽 자식 노드 생성
			if(Rdata != '.') root.right = new node(Rdata);
		}else {
			//루트가 null이 아니라면 탐색
			search(root, data, Ldata, Rdata);
		}
	}
	public void search(node root, char data, char Ldata, char Rdata) { // 노드를 찾는 함수
		if(root==null) return; // 루트 노드가 null이면 종료
		else if(root.data==data) {// 루트노드의 data가 data와 같다면
			if(Ldata != '.') root.left = new node(Ldata);
			if(Rdata != '.') root.right = new node(Rdata);
		}else { // 그렇지 않다면
			search(root.left, data, Ldata, Rdata); // 왼쪽 재귀 탐색
			search(root.right, data, Ldata, Rdata); // 오른쪽 재귀 탐색
		}
	}
	public void PreOrder(node root) { // 루트 -> 좌 -> 우
		System.out.print(root.data);
		if(root.left!=null) PreOrder(root.left);
		if(root.right!=null) PreOrder(root.right);
	}
	public void InOrder(node root) { // 좌 -> 루트 -> 우
		if(root.left!=null) InOrder(root.left);
		System.out.print(root.data);
		if(root.right!=null) InOrder(root.right);
	}
	public void PostOrder(node root) { // 좌 -> 우 -> 루트
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
		t.PreOrder(t.root); // 전위 순회
		System.out.println();
		t.InOrder(t.root); // 중위 순회
		System.out.println();
		t.PostOrder(t.root); // 후위 순회
	}
}
