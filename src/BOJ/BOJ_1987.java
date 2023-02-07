package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1987 {
	static int r,c;
	static int[][] arr;
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	static int max = Integer.MIN_VALUE;
	static boolean[] visit;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());

		arr = new int[r][c];
		for(int i = 0;i<r;i++) {
			String s = br.readLine();
			for(int j = 0;j<c;j++) {
				arr[i][j] = s.charAt(j)-'A';
			}
		}

		visit = new boolean[26];
		dfs(0,0,1);
		System.out.println(max);
	}
	private static void dfs(int x, int y, int len) {
		visit[arr[x][y]] = true;
		max = Math.max(max, len);

		for(int i = 0;i<4;i++) {
			int x1 = x+dx[i];
			int y1 = y+dy[i];
			if(x1 >= 0 && y1 >= 0 && x1 < r && y1 < c) {
				if(!visit[arr[x1][y1]]) {
					dfs(x1,y1,len+1);
					visit[arr[x1][y1]] = false;
				}
			}
		}
	}

}
