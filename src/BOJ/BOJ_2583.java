package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_2583 {
	static boolean[] visit;
	static int m,n,k;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,1,-1};
	static int[][] map;
	static int count = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		map = new int[m][n];
		for(int i = 0;i<k;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			for(int a = y1;a<y2;a++) {
				for(int b = x1;b<x2;b++) map[a][b] = 1;
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				if(map[i][j]==0) {
					count = 0;
					dfs(i,j);
					list.add(count);
				}
			}
		}
		System.out.println(list.size());
		Collections.sort(list);
		for(Integer i : list) System.out.print(i+" ");
	}
	private static void dfs(int x, int y) {
		map[x][y] = 1;
		count++;
		for(int i = 0;i<4;i++) {
			int nowX = x+dx[i];
			int nowY = y+dy[i];
			if(nowX>=0 && nowX<m&&nowY>=0&&nowY<n) {
				if(map[nowX][nowY]==0) dfs(nowX,nowY);
			}
		}
	}

}
