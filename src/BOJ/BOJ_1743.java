package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1743 {
	static int[][] arr;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static boolean[] visit;
	static int n,m;
	static int temp, answer;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		arr = new int[n+1][m+1];
		for(int i = 0;i<k;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			arr[r][c] = 1;
		}
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=m;j++) {
				if(arr[i][j]==1) {
					temp = 0;
					dfs(i,j);
					answer = Math.max(answer, temp);
				}
			}
		}
		System.out.println(answer);
	}
	private static void dfs(int x, int y) {
		arr[x][y] = 0;
		temp++;
		for(int i = 0;i<4;i++) {
			int nowX = x+dx[i];
			int nowY = y+dy[i];
			if((1<=nowX&&nowX<n+1) && (1<=nowY&&nowY<m+1) && (arr[nowX][nowY]==1)){
				dfs(nowX,nowY);
			}
		}
	}

}
