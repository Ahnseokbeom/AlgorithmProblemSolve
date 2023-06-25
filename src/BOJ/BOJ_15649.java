package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15649 {
	static boolean[] visited;
	static int[] list;
	static int n;
	static int m;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		visited = new boolean[n];
		list = new int[m];
		dfs(0);
		System.out.println(sb);

	}
	public static void dfs(int num) {
		if(num==m) {
			for(int a : list) {
				sb.append(a).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i = 0;i<n;i++) {
			if(!visited[i]) {
				visited[i]=true;
				list[num]=i+1;
				dfs(num+1);
				visited[i]=false;
			}
		}
	}

}
