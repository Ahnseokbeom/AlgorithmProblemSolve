package SWMaestro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1697 {
	static boolean[] visit;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		bfs(n,k);
	}
	private static void bfs(int n, int k) {
		if(n==k) return;
		Queue<Integer> q = new LinkedList<>();
		q.offer(n);
		int size = q.size();
		int count = 0;
		while(true) {
			count++;
			size = q.size();
			for(int i = 0;i<size;i++) {
				int x = q.remove();
				visit[x] = true;
				if(x-1==k || x+1==k || x*2==k) {
					System.out.println(count);
					return;
				}
				if(x-1>=0 && !visit[x-1]) {
					visit[x] = true;
					q.offer(x-1);
				}
				if(x+1<=100000 && !visit[x+1]) {
					visit[x+1] = true;
					q.offer(x+1);
				}
				if(x*2<=100000 && !visit[x*2]) {
					visit[x*2] = true;
					q.offer(x*2);
				}
			}
		}
	}

}
