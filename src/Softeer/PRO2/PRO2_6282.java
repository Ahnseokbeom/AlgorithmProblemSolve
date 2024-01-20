package Softeer.PRO2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class PRO2_6282 {
	static int[][] arr;
	static boolean[][] check;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {-1,1,0,0};
	static int area;
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		check = new boolean[n][n];
		for(int i = 0;i<n;i++) {
			String s = br.readLine();
			for(int j = 0;j<n;j++) arr[i][j] = Integer.parseInt(s.charAt(j)+"");
		}
		ArrayList<Integer> list = new ArrayList<>();
		int num = 0;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				if(!check[i][j] && arr[i][j]==1) {
					area = 1;
					dfs(i,j);
					num++;
					list.add(area);
				}
			}
		}
		System.out.println(num);
		Collections.sort(list);
		for(int size : list) System.out.println(size);
	}
	public static void dfs(int x, int y) {
		check[x][y] = true;
		for(int i = 0;i<4;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
				if(!check[nx][ny] && arr[nx][ny]==1) {
					check[nx][ny] = true;
					area++;
					dfs(nx,ny);
				}
			}
		}
	}
}
