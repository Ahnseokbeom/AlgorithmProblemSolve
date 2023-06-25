package BOJ;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_2606 {
	static boolean[] visit;
	static int[][] check;
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int m = sc.nextInt();
		check = new int[n+1][n+1];
		visit = new boolean[n+1];
		Arrays.fill(visit, false);
		for(int i = 0;i<m;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			check[x][y] = 1;
			check[y][x] = 1;
		}
		sc.close();
		bfs(1);
	}
	public static void bfs(int v) {
		Queue<Integer> q = new LinkedList<Integer>();
		visit[v] = true;
		q.offer(v);
		int count = 0;
		while(!q.isEmpty()) {
			int x = q.poll();
			for(int i = 1;i<check.length;i++) {
				if(check[x][i] == 1 && visit[i] == false) {
					q.offer(i);
					visit[i] = true;
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
