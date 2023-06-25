package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_2161 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		Queue<Integer> q = new LinkedList<Integer>();
		int[] list =  new int[n];
		for(int i = 1;i<=n;i++) {
			q.add(i);
		}
		int i = 0;
		while(q.size() != 1) {
			list[i++] = q.poll();
			q.offer(q.poll());
		}
		StringBuilder sb = new StringBuilder();

		for(i = 0;i<list.length;i++) {
			if(i== list.length-1) {
				sb.append(q.peek()).append(" ");
			}else {
				sb.append(list[i]).append(" ");
			}
		}
		System.out.println(sb);
	}

}
