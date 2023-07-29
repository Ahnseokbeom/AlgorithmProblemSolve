package CodeUp;

public class PRO_3702 {
	static int[][] dp = new int[51][51];
	public static void main(String[] args) {
		System.out.println(solution(3, 4));
	}
	public static int solution(int r, int c) {
		if(r==1 || c==1) {
			return dp[r][c] = dp[c][r] = 1;
		}
		if(dp[r][c]!=0) {
			return dp[r][c];
		}else return dp[r][c] = dp[c][r] = (solution(r-1, c)+solution(r, c-1))%100000000;
	}
}
