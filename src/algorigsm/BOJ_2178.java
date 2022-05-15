package algorigsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2178 {
	static int[][] maze; // 미로
	//미로의 크기
	static int n; 
	static int m;
	static boolean[][] visited; // 방문기록
	static int[] arrX = {-1,1,0,0}; // X방향(상하)
	static int[] arrY = {0,0,1,-1}; // Y방향(좌우)
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
		visited = new boolean[n][m]; // 선언과 동시에 모두 false로 초기화
		visited[0][0] = true; // 미로 시작지점은 방문한 것으로 체크
		bfs(0,0); // 미로 시작
		System.out.println(maze[n-1][m-1]);
		
	}
	public static void bfs(int x, int y) { // 
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {x,y}); // 현재 위치를 저장
		
		while(!q.isEmpty()) {
			int now[] = q.poll(); // 그 위치를 now배열에 받는다.
			int nowX = now[0];
			int nowY = now[1];
			for(int i = 0;i<4;i++) { // 인접한 부분이 있는지 검사
				int nextX = nowX + arrX[i];
				int nextY = nowY + arrY[i];
				if(nextX < 0 || nextY < 0 || nextX >= n || nextY >=m) { // 만약 x,y가 미로의 크기를 넘어가거나, 값이 0이하면 continue
					continue;
				}
				if(visited[nextX][nextY] == true || maze[nextX][nextY] == 0) { // 이미 검사한 부분이면 continue
					continue; 
				}
				q.offer(new int[]{nextX,nextY}); // 검사한 값을 다시 큐에 넣어준다
				maze[nextX][nextY] = maze[nowX][nowY]+1; // 지나야하는 최소칸 1씩 증가
				visited[nextX][nextY] = true; // 검사한 부분을 true 즉, 방문한 곳이라고 체크해준다
			}
		}
	}

}
