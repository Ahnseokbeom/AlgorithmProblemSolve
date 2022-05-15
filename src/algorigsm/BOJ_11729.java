package algorigsm;

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
		//만약 하노이가 1개라면
		if(n==1) {
			sb.append(start+" "+to+"\n");
			return;
		}
		//a -> c로 옮긴다고 가정 / n-1개를 b로 옮긴다.
		hanoi(n-1, start,to,mid);
		// 1개를 a에서 c로 옮긴다.
		sb.append(start+" "+to+"\n");
		//n-1개개를 b에서 c로 옮긴다.
		hanoi(n-1,mid,start,to);
	}

}
