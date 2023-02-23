package SWMaestro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1260 {
	static boolean[] visit;
	static int[][] arr;
	static int n,m,v;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());

		arr = new int[n+1][n+1];
		visit = new boolean[n+1];

		for(int i = 0;i<m;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = arr[b][a] = 1;
		}
		dfs(v);
		System.out.println();
		visit = new boolean[n+1];
		bfs(v);

	}
	private static void dfs(int v) {
		visit[v] = true;
		System.out.print(v+" ");
		for(int i = 1;i<=n;i++) {
			if(arr[v][i]==1 && !visit[i]) dfs(i);
		}
	}
	private static void bfs(int v) {
		Queue<Integer> q = new LinkedList<>();
		q.add(v);
		visit[v] = true;
		while(!q.isEmpty()) {
			int temp = q.poll();
			System.out.print(temp+" ");
			for(int i = 1;i<=n;i++) {
				if(arr[temp][i]==1 && !visit[i]) {
					q.add(i);
					visit[i] = true;
				}
			}
		}
	}

}
