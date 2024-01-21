package goorm.PRO3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PRO3_195694 {
	static int[] dx = {0,0,1,-1};
	static int[] dy = {-1,1,0,0};
	static int[][] arr;
	static boolean[][] check;
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());

		StringTokenizer st;
		arr = new int[n][n];
		check = new boolean[n][n];
		for(int i = 0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0;j<n;j++) arr[i][j] = Integer.parseInt(st.nextToken());
		}
		int answer = 0;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				if(!check[i][j] && arr[i][j]==1) {
					answer++;
					bfs(i,j);
				}
			}
		}
		System.out.println(answer);
	}
	// Runtime Error 발생
	public static void dfs(int x, int y) {
		check[x][y] = true;
		for(int i = 0;i<4;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
			if(!check[nx][ny] && arr[nx][ny]==1) {
				dfs(nx,ny);
			}
		}
	}
	// 정답
	public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        check[x][y] = true;

        while (!q.isEmpty()) {
            int[] num = q.poll();
            int cx = num[0];
            int cy = num[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && !check[nx][ny] && arr[nx][ny] == 1) {
                    q.offer(new int[]{nx, ny});
                    check[nx][ny] = true;
                }
            }
        }
    }
}
