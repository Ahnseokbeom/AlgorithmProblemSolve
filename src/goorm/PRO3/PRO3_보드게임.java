package goorm.PRO3;

public class PRO3_보드게임 {
	static long[] dp;
	static int mod = 1000000007;
	public static void main(String[] args) {
		int n = 49584;
		System.out.println(solution(n));
	}
	public static long solution(int n) {
		dp = new long[n+1];
		dp[0] = 1;
		for(int i = 1;i<=n;i++) {
			if (i >= 1) dp[i] = (dp[i] + dp[i - 1]) % mod;
            if (i >= 3) dp[i] = (dp[i] + dp[i - 3]) % mod;
        }
		return dp[n];
	}
}
