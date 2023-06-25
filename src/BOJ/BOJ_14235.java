package BOJ;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ_14235 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<n;i++) {
			int a = sc.nextInt();
			if(a==0) {
				if(pq.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(pq.poll()).append("\n");
				}
			}else if(a > 0) {
				for(int j = 0;j<a;j++) {
					int b = sc.nextInt();
					pq.offer(b);
				}
			}
		}
		sc.close();
		System.out.println(sb);
	}

}
