package goorm.PRO2;

public class PRO2_폭탄구현하기 {
	static int[] dx = {0,0,1,-1};
	static int[] dy = {-1,1,0,0};
	static int answer;
	public static void main(String[] args){
		System.out.println(solution(3, 3, new int[][] {{3,3},{3,3},{1,1}}));
		System.out.println(solution(4, 4, new int[][] {{1,1},{4,4},{3,3},{2,4}}));
	}
	public static int solution(int n, int k, int[][] board){
		answer = 0;
		for(int i = 0;i<k;i++) {
			for(int j = 0;j<4;j++) {
				int nx = board[i][0]+dx[j];
				int ny = board[i][1]+dy[j];
				if(nx > n || ny > n || nx <= 0 || ny <= 0) continue;
				else answer++;
			}
		}
		return answer+k;
	}
}

