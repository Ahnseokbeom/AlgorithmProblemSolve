package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class BOJ_1158 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		Queue<Integer> queue = new LinkedList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1;i<=n;i++) {
			queue.offer(i);
		}
		int result = 0;
		while(!queue.isEmpty()) {
			for(int i = 0;i<k-1;i++) {
				result = queue.poll();
				queue.offer(result);
			}
			list.add(queue.poll());
		}
		System.out.print("<");
		for(int i = 0;i<list.size();i++) {
			if(i == list.size()-1) {
				System.out.print(list.get(i)+">");
			}else {
				System.out.print(list.get(i)+", ");
			}
		}
		
		
	}

}
