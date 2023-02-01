package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_7576 {
	static int n;
	static int m;
	static int[][] tomato;
	static int max;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,1,-1};
	static Queue<int[]> q;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		tomato = new int[n][m];
		for(int i = 0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0;j<m;j++) {
				tomato[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		q = new LinkedList<int[]>();
		//�丶�� �翡�� 1�� �߰��ϸ� ť�� �߰�(�� ������ ���ؼ� ��𼭺��� ��������� ���Ѵ�.)
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if(tomato[i][j]==1) {
					q.offer(new int[] {i,j});
				}
			}
		}
		bfs();
	}
	static void bfs() {
		while(!q.isEmpty()) {
			int now[] = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			for(int i = 0;i<4;i++) {
				int nextX = nowX+dx[i];
				int nextY = nowY+dy[i];
				if(nextX < 0 || nextY < 0 || nextX > n-1 || nextY > m-1) { // ������ ����� continue
					continue;
				}
				if(tomato[nextX][nextY] != 0) continue; // �丶�䰡 ���ų� ���� �丶���� continue
				else // �׷��� ���� ��쿡�� ť�� ���� ĭ ���� �� ���� ĭ �ε��� �߰�
					tomato[nextX][nextY] = tomato[nowX][nowY]+1;
					q.offer(new int[] {nextX,nextY});
			}
		}
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if(tomato[i][j]==0) { // ������ �� ���� �丶�䰡 �����Ѵٸ� -1��� �� ����
					System.out.println(-1);
					System.exit(0);
				}	
				max = Math.max(max, tomato[i][j]); // max(�ϼ�)���� ������ �ϼ� ��� �ֱ�
			}
			
		}
		System.out.println(max-1); // �� �;��ٸ� �ϼ� ���
	}

}
