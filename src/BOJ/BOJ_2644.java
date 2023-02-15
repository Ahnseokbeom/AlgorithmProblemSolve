package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_2644 {
	static ArrayList<Integer>[] list;
	static boolean[] visit;
	static int answer = -1;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		list = new ArrayList[n+1];
		visit = new boolean[n+1];
		for(int i = 1;i<=n;i++) {
			list[i] = new ArrayList<>();
		}
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(br.readLine());
		for(int i = 0;i<l;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int p = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			list[p].add(c);
			list[c].add(p);
		}
		dfs(x,y,0);
		System.out.println(answer);
	}
	private static void dfs(int x, int y, int count) {
		if(x==y) {
			answer = count;
			return;
		}
		visit[x] = true;
		for(int i = 0;i<list[x].size();i++) {
			int next = list[x].get(i);
			if(!visit[next]) dfs(next,y,count+1);
		}
	}

}
