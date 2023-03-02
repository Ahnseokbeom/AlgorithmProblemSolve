package SWMaestro;

import java.util.Arrays;

public class BOJ_2225 {
	public static int solution(int n, int k) {
		int mod = 1000000000;
		int[][] dp = new int[k+1][n+1];
		Arrays.fill(dp[1], 1);
		for(int i = 1;i<=k;i++) dp[i][0] = 1;

		for(int i = 2;i<=k;i++) {
			for(int j = 1;j<=n;j++) {
				dp[i][j] = (dp[i][j-1]+dp[i-1][j])%mod;
			}
		}
		return dp[k][n];
	}
	public static void main(String[] args) {
		System.out.println(solution(20,2));
		System.out.println(solution(6,4));
	}

}
