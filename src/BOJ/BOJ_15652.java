package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15652 {
	static int[] list;
	static int n;
	static int m;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		list = new int[m];
		dfs(1,0);
		System.out.println(sb);
	}
	public static void dfs(int order, int num) {
		if(num==m) {
			for(int i : list) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i = order;i<=n;i++) {
			list[num] = i;
			dfs(i,num+1);
		}
	}

}
