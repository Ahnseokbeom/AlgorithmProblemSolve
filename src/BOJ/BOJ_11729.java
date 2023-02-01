package BOJ;

import java.util.Scanner;

public class BOJ_11729 {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sb.append((int)(Math.pow(2, n)-1)).append("\n");
		hanoi(n,1,2,3);
		System.out.println(sb);
		sc.close();
	}
	public static void hanoi(int n, int start, int mid, int to) {
		//start = a / mid = b / to = c
		//���� �ϳ��̰� 1�����
		if(n==1) {
			sb.append(start+" "+to+"\n");
			return;
		}
		//a -> c�� �ű�ٰ� ���� / n-1���� b�� �ű��.
		hanoi(n-1, start,to,mid);
		// 1���� a���� c�� �ű��.
		sb.append(start+" "+to+"\n");
		//n-1������ b���� c�� �ű��.
		hanoi(n-1,mid,start,to);
	}

}
