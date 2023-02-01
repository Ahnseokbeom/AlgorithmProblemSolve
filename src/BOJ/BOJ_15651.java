package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15651 {
	static StringBuilder sb = new StringBuilder();
	static int n;
	static int m;
	static int[] list;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		list = new int[m];
		dfs(0);
		System.out.println(sb);
	}
	public static void dfs(int num) {
		if(num==m) {
			for(int i = 0;i<m;i++) {
				sb.append(list[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i = 1;i<=n;i++) {
			list[num] = i;
			dfs(num+1);
		}
	}
}
