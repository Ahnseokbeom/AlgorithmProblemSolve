package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class BOJ_11286 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		Queue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				if(Math.abs(a) > Math.abs(b)) {
					return 1;
				}else if(Math.abs(a) == Math.abs(b)) {
					return a-b;
				}else {
					return -1;
				}
			}
		});
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<n;i++) {
			int x = Integer.parseInt(br.readLine());
			if(pq.isEmpty() && x == 0) {
				pq.offer(x);
				sb.append(pq.poll()).append("\n");
			}else if(x==0) {
				sb.append(pq.poll()).append("\n");
			}
			if(x!=0) {
				pq.offer(x);
			}
		}
		System.out.println(sb);
	}

}
