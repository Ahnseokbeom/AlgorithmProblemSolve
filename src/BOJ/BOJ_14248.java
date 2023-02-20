package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_14248 {
	static int n;
	static int check[], bridge[];
	static int dx[] = {1,-1};
	static int count = 1;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		bridge = new int[n];
		check = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0;i<n;i++)bridge[i] = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(br.readLine());
		bfs(s-1);
		System.out.println(count);
	}
	private static void bfs(int x) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(x);
		check[x] = 1;
		while(!q.isEmpty()) {
			x = q.poll();
			int jump = bridge[x];
			for(int i : dx) {
				int nowX = (i*jump)+x;
				if(nowX >=0 && nowX < n && check[nowX]==0) {
					check[nowX] = 1;
					q.offer(nowX);
					count++;
				}
			}
		}
	}
}
