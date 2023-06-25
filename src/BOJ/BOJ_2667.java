package BOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2667 {
	static int dx[] = {0,0,1,-1}; // x축
	static int dy[] = {-1,1,0,0}; // y축
	static int n; // 입력받을 지도의 크기
	//최대 n이 25까지이므로 visited / map을 최대치로 초기화
	static boolean[][] visited = new boolean[25][25]; // 방문기록
	static int[][] map = new int[25][25]; // 단지있는지를 체크해줄 지도
	static int count; // 단지수
	static ArrayList<Integer> list; // 단지수를 입력받을 리스트
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // 지도의 크기 입력
		// map / visited 지도 크기에 맞게 초기화
		map = new int[n][n];
		visited = new boolean[n][n];
		for(int i = 0;i<n;i++) { // 지도에 단지의 유무를 넣어준다.
			String s = sc.next();
			for(int j = 0;j<n;j++) {
				map[i][j] = s.charAt(j)-'0'; // count를 하기 위해서 String형식을 int형으로 바꿔서 넣어준다.
			}
		}
		count = 0; // 단지수를 0으로 초기화
		list = new ArrayList<>(); // 값을 담을 list로 새로 초기화

		for(int i = 0;i<n;i++) { // 단지 내 집의 수를 list에 넣어준다.
			for(int j = 0;j<n;j++) {
				if(map[i][j] == 1 && !visited[i][j]) {
					count = 1;
					bfs(i,j);
					list.add(count);
				}
			}
		}
		Collections.sort(list); // 오름차순이므로 정렬
		System.out.println(list.size()); // 처음에 단지수를 출력
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<list.size();i++) { // 단지내 집의 수 출력
			sb.append(list.get(i)).append("\n");
		}
		sc.close();
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
