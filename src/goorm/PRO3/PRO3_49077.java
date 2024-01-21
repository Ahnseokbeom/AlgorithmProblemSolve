package goorm.PRO3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PRO3_49077 {
	/*
	 1번 예제    	2번 예제		3번 예제		4번 예제
	 5 4       	5 5			8 7			10 10
	...## 		.##..		......#.	#...##.#.#
	..###		##.##		...#.###	.....###..
	.....		##.##		#.......	.####.##.#
	.#..#		###.. 		.##.....	.#####...#
				.##..		..##.###	##......#.
							........	....#.##..
							....##..	..#..####.
							10 10		.###...##.
										........#.
										#..#....#.
	 */
	static int max,n,m,cnt,num;
	static char[][] arr;
	static boolean[][] check;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {-1,1,0,0};
	static StringBuilder sb;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new char[m][n];
		check = new boolean[m][n];
		for(int i = 0;i<m;i++) {
			String s = br.readLine();
			for(int j = 0;j<n;j++) arr[i][j] = s.charAt(j);
		}
		System.out.println(solution());
	}
	public static void dfs(int x, int y) {
		check[x][y] = true;
		num++;
		for(int i = 0;i<4;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx >= 0 && nx < m && ny >= 0 &&  ny < n) {
				if(!check[nx][ny] && arr[nx][ny]=='#') {
					check[nx][ny] = true;
					dfs(nx,ny);
				}
			}
		}
	}
	public static StringBuilder solution() {
		sb = new StringBuilder();
		max = 0;
		cnt = 0;
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				if(!check[i][j] && arr[i][j]=='#') {
					max++;
					num = 0;
					dfs(i,j);
					cnt = Math.max(cnt, num);
				}
			}
		}
		sb.append(max+"\n"+cnt);
		return sb;
	}
}
