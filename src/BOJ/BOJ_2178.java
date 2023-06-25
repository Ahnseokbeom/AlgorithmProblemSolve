package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2178 {
	static int[][] maze;
	static int n;
	static int m;
	static boolean[][] visited;
	static int[] arrX = {-1,1,0,0};
	static int[] arrY = {0,0,1,-1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		maze = new int[n][m];
		for(int i = 0;i<n;i++) {
			String s = br.readLine();
			for(int j = 0;j<m;j++) {
				maze[i][j] = s.charAt(j)-'0';
			}
		}
		visited = new boolean[n][m];
		visited[0][0] = true;
		bfs(0,0);
		System.out.println(maze[n-1][m-1]);

	}
	public static void bfs(int x, int y) { //
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {x,y});

		while(!q.isEmpty()) {
			int now[] = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			for(int i = 0;i<4;i++) {
				int nextX = nowX + arrX[i];
				int nextY = nowY + arrY[i];
				if(nextX < 0 || nextY < 0 || nextX >= n || nextY >=m) {
					continue;
				}
				if(visited[nextX][nextY] == true || maze[nextX][nextY] == 0) {
					continue;
				}
				q.offer(new int[]{nextX,nextY});
				maze[nextX][nextY] = maze[nowX][nowY]+1;
				visited[nextX][nextY] = true;
			}
		}
	}

}
