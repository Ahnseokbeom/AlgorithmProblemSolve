package programmers;

public class PRO_2_MaxSquareSearch {
	public static void main(String[] args) {
		int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		int[][] dp = new int[board.length+1][board[0].length+1];
		int max = 0;
		for(int i = 1;i<=board.length;i++) {
			for(int j = 1;j<=board[0].length;j++) {
				if(board[i-1][j-1]!=0) {
					int min = Math.min(Math.min(dp[i][j-1], dp[i-1][j]),dp[i-1][j-1]);
					dp[i][j] = min+1;
					max = Math.max(max, min+1);
				}
			}
		}
		System.out.println(max*max);
	}

}
