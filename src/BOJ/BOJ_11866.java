package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11866 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i<n;i++) {
			queue.offer(i+1);
		}
		while(!queue.isEmpty()) {
			for(int i = 0;i<k-1;i++) {
			int temp = queue.poll();
			queue.offer(temp);
			}
			list.add(queue.poll());
		}
		sb.append("<");
		for(int i = 0;i<list.size();i++) {
			if(i==list.size()-1) {
				sb.append(list.get(i)+">");
			}else {
				sb.append(list.get(i)+", ");
			}
		}
		System.out.println(sb.toString());
	}

}
