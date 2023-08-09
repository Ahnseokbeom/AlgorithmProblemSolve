package BOJ;

import java.util.Arrays;

public class BOJ_11057 {
	static int n;
	static int[][] dp = new int[n+1][11];
	static int mod = 10007;
	public static void main(String[] args) {

		System.out.println(failure(4));

		for(int i = 1;i<=4;i++) Arrays.fill(dp[i], 0);

		System.out.println(success(4));
	}
	public static int success(int n) {
		for(int i = 1;i<=10;i++) dp[1][i] = 1;
		for(int i = 2;i<=n;i++) {
			for(int j = 1;j<=10;j++) {
				for(int k = j;k<=10;k++) {
					dp[i][j] += dp[i-1][k];
					dp[i][j] %= mod;
				}
			}
		}
		return Arrays.stream(dp[n-1]).sum();
	}

	public static int failure(int n) {
		for(int i = 1;i<=10;i++) {
			dp[i][1] = 1;
			dp[1][i] = 1;
		}
		for(int i = 2;i<=10;i++) {
			for(int j = 2;j<=10;j++) {
				dp[i][j] = (dp[i-1][j]+dp[i][j-1])%mod;
			}
		}
		return dp[n][10];
	}

}
