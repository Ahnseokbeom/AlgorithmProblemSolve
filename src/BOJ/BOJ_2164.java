package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_2164 {
	public static void main(String[] args) throws IOException{
		Queue<Integer> queue = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1;i<=n;i++) {
			queue.offer(i);
		}
		while(queue.size()!=1) {
			queue.poll();
			int temp = queue.poll();
			queue.offer(temp);
		}
		System.out.println(queue.peek());
	}

}
