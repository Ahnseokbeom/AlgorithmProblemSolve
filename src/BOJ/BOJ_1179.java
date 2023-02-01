package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1179 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		long n = Integer.parseInt(st.nextToken());
		long k = Integer.parseInt(st.nextToken());
		Queue<Integer> queue = new LinkedList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1;i<=n;i++) {
			queue.offer(i);
		}
		while(queue.size()!=1) {
			for(int i = 0;i<k-1;i++) {
				queue.offer(queue.poll());
			}
			list.add(queue.poll());
		}
		System.out.print(queue.peek());
	}

}
