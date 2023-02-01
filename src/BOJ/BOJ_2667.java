package BOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2667 {
	static int dx[] = {0,0,1,-1}; // x��
	static int dy[] = {-1,1,0,0}; // y��
	static int n; // �Է¹��� ������ ũ��
	//�ִ� n�� 25�����̹Ƿ� visited / map�� �ִ�ġ�� �ʱ�ȭ
	static boolean[][] visited = new boolean[25][25]; // �湮���
	static int[][] map = new int[25][25]; // �����ִ����� üũ���� ����
	static int count; // ������
	static ArrayList<Integer> list; // �������� �Է¹��� ����Ʈ
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // ������ ũ�� �Է�
		// map / visited ���� ũ�⿡ �°� �ʱ�ȭ
		map = new int[n][n];
		visited = new boolean[n][n];
		for(int i = 0;i<n;i++) { // ������ ������ ������ �־��ش�.
			String s = sc.next();
			for(int j = 0;j<n;j++) {
				map[i][j] = s.charAt(j)-'0'; // count�� �ϱ� ���ؼ� String������ int������ �ٲ㼭 �־��ش�.
			}
		}
		count = 0; // �������� 0���� �ʱ�ȭ
		list = new ArrayList<>(); // ���� ���� list�� ���� �ʱ�ȭ
		sc.close();
		for(int i = 0;i<n;i++) { // ���� �� ���� ���� list�� �־��ش�. 
			for(int j = 0;j<n;j++) {
				if(map[i][j] == 1 && !visited[i][j]) {
					count = 1;
					bfs(i,j);
					list.add(count);
				}
			}
		}
		Collections.sort(list); // ���������̹Ƿ� ���� 
		System.out.println(list.size()); // ó���� �������� ���
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<list.size();i++) { // ������ ���� �� ���
			sb.append(list.get(i)).append("\n");
		}
		System.out.println(sb);
}
	public static int bfs(int x, int y) {
		visited[x][y] = true;
		
		for(int i = 0;i<4;i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			if(nextX >= 0 && nextY >= 0 && nextX < n && nextY < n) {
				if(map[nextX][nextY] == 1 && !visited[nextX][nextY]) { 
					bfs(nextX,nextY);
					count++;
				}
			}
		}
		return count;
	}
}
