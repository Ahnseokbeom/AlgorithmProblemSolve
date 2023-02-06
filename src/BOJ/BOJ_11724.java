package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11724 {
	static int[][] arr = new int[1001][1001];
	static boolean[] visit = new boolean[1001];
	static int n;
	static int m;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		for(int i = 0;i<m;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			arr[a][b] = arr[b][a] = 1;

		}
		int answer = 0;
		for(int i = 1;i<=n;i++) {
			if(!visit[i]) {
				dfs(i);
				answer++;
			}
		}
		System.out.println(answer);

	}
	private static void dfs(int i) {
		visit[i] = true;
		for(int j = 1;j<=n;j++) {
			if(arr[i][j]==1 && !visit[j]) dfs(j);
		}
	}

}
