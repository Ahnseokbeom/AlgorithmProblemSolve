package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BOJ_1655 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> minq = new PriorityQueue<Integer>();
		PriorityQueue<Integer> maxq = new PriorityQueue<Integer>(Collections.reverseOrder());

		for(int i = 0;i<n;i++) {
			int num = Integer.parseInt(br.readLine());
			if(minq.size()==maxq.size()) {
				maxq.offer(num);
			}else {
				minq.offer(num);
			}
			if(!minq.isEmpty() && !maxq.isEmpty()) {
				if(minq.peek() < maxq.peek()) {
					int temp = minq.poll();
					minq.offer(maxq.poll());
					maxq.offer(temp);
				}
			}
			sb.append(maxq.peek()).append("\n");
		}
		System.out.println(sb);

	}

}
