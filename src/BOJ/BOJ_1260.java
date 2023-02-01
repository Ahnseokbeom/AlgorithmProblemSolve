package BOJ;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class BOJ_1260 {
	static int[][] check; // ���� ���� ����
	static boolean[] checked; // �湮 ���
	static int n; // ������ ����
	static int m; // ������ ����
	static int v; // ������ġ
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // ���� ���� 
		m = sc.nextInt(); // ���� ����
		v = sc.nextInt(); // ������ġ
		
		check = new int[1001][1001]; // ���� �ִ� ������ 1000�̹Ƿ� 1001�� �ʱ�ȭ
		checked = new boolean[n+1]; // �湮��� �ʱⰪ�� ��� false
		Arrays.fill(checked, false);
		
		for(int i = 0;i<m;i++) { // ���� ����
			int x = sc.nextInt();
			int y = sc.nextInt();
			check[x][y] = check[y][x] = 1;
		}
		dfs(v);
		Arrays.fill(checked, false); // ���ʱ�ȭ
		System.out.println();
		bfs();
		sc.close();
	}
	public static void dfs(int i) {
		checked[i] = true; // �湮���� �ǹ�
		System.out.print(i+" ");
		for(int j = 1;j<=n;j++) { //�湮���� �ʰ� ���� �ִ� ���̶�� �� ���� �ְ� ���
			if(check[i][j] == 1 && checked[j]==false) {
				dfs(j);
			}
		}
	}
	public static void bfs() {
		Queue<Integer> q = new LinkedList<Integer>();
		//������ġ�� ó�� ��¿� �־��ش�.
		q.offer(v);
		checked[v] = true;
		System.out.print(v+" ");
		while(!q.isEmpty()) { // q�� ������� ��������
			int num = q.poll(); 
			for(int j = 1;j<=n;j++) { // ���� �����ϰ�, �湮���� ���� ���̸� q�� �ְ� �� ���� ���
				if(check[num][j] == 1 && checked[j] == false) {
					q.offer(j);
					checked[j] = true;
					System.out.print(j+" ");
				}
			}
		}
	}
	

}
