package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2178 {
	static int[][] maze; // �̷�
	//�̷��� ũ��
	static int n; 
	static int m;
	static boolean[][] visited; // �湮���
	static int[] arrX = {-1,1,0,0}; // X����(����)
	static int[] arrY = {0,0,1,-1}; // Y����(�¿�)
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
		visited = new boolean[n][m]; // ����� ���ÿ� ��� false�� �ʱ�ȭ
		visited[0][0] = true; // �̷� ���������� �湮�� ������ üũ
		bfs(0,0); // �̷� ����
		System.out.println(maze[n-1][m-1]);
		
	}
	public static void bfs(int x, int y) { // 
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {x,y}); // ���� ��ġ�� ����
		
		while(!q.isEmpty()) {
			int now[] = q.poll(); // �� ��ġ�� now�迭�� �޴´�.
			int nowX = now[0];
			int nowY = now[1];
			for(int i = 0;i<4;i++) { // ������ �κ��� �ִ��� �˻�
				int nextX = nowX + arrX[i];
				int nextY = nowY + arrY[i];
				if(nextX < 0 || nextY < 0 || nextX >= n || nextY >=m) { // ���� x,y�� �̷��� ũ�⸦ �Ѿ�ų�, ���� 0���ϸ� continue
					continue;
				}
				if(visited[nextX][nextY] == true || maze[nextX][nextY] == 0) { // �̹� �˻��� �κ��̸� continue
					continue; 
				}
				q.offer(new int[]{nextX,nextY}); // �˻��� ���� �ٽ� ť�� �־��ش�
				maze[nextX][nextY] = maze[nowX][nowY]+1; // �������ϴ� �ּ�ĭ 1�� ����
				visited[nextX][nextY] = true; // �˻��� �κ��� true ��, �湮�� ���̶�� üũ���ش�
			}
		}
	}

}
