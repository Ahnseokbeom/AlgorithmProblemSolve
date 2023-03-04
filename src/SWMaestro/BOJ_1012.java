package SWMaestro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1012 {
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static int[][] map;
	static boolean[][] visit;
	static int m,n,k;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i = 0;i<t;i++) {
			count = 0;

			st = new StringTokenizer(br.readLine()," ");
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			map = new int[m][n];
			visit = new boolean[m][n];

			for(int j = 0;j<k;j++) {
				st = new StringTokenizer(br.readLine()," ");
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				map[x][y] = 1;
			}


			for(int j = 0;j<m;j++) {
				for(int k = 0;k<n;k++) {
					if(map[j][k]==1 && !visit[j][k]) {
						count++;
						dfs(j,k);
					}
				}
				sb.append(count).append("\n");
			}
			System.out.println(count);
		}

	}

	public static void dfs(int x, int y) {
		visit[x][y] = true;
		for(int i = 0;i<4;i++) {
			int nX = x+dx[i];
			int nY = y+dy[i];

			if(nY < n && nY >= 0 && nX < m && nX >= 0) {
				if(!visit[nX][nY] && map[nX][nY]==1) dfs(nX,nY);
			}
		}
	}

}
