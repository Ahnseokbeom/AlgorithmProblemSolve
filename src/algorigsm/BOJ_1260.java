package algorigsm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class BOJ_1260 {
	static int[][] check; // 간선 연결 상태
	static boolean[] checked; // 방문 기록
	static int n; // 정점의 개수
	static int m; // 간선의 개수
	static int v; // 시작위치
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // 연결 상태 
		m = sc.nextInt(); // 간선 개수
		v = sc.nextInt(); // 시작위치
		
		check = new int[1001][1001]; // 정점 최대 개수가 1000이므로 1001로 초기화
		checked = new boolean[n+1]; // 방문기록 초기값은 모두 false
		Arrays.fill(checked, false);
		
		for(int i = 0;i<m;i++) { // 연결 상태
			int x = sc.nextInt();
			int y = sc.nextInt();
			check[x][y] = check[y][x] = 1;
		}
		dfs(v);
		Arrays.fill(checked, false); // 재초기화
		System.out.println();
		bfs();
		sc.close();
	}
	public static void dfs(int i) {
		checked[i] = true; // 방문함을 의미
		System.out.print(i+" ");
		for(int j = 1;j<=n;j++) { //방문하지 않고 값이 있는 곳이라면 그 값을 넣고 재귀
			if(check[i][j] == 1 && checked[j]==false) {
				dfs(j);
			}
		}
	}
	public static void bfs() {
		Queue<Integer> q = new LinkedList<Integer>();
		//시작위치를 처음 출력에 넣어준다.
		q.offer(v);
		checked[v] = true;
		System.out.print(v+" ");
		while(!q.isEmpty()) { // q가 비어있지 않을동안
			int num = q.poll(); 
			for(int j = 1;j<=n;j++) { // 값이 존재하고, 방문하지 않은 곳이면 q에 넣고 그 값을 출력
				if(check[num][j] == 1 && checked[j] == false) {
					q.offer(j);
					checked[j] = true;
					System.out.print(j+" ");
				}
			}
		}
	}
	

}
