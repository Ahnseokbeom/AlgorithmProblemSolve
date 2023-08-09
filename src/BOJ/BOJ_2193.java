package BOJ;

public class BOJ_2193 {
	static long[] dp = new long[91];
	public static void main(String[] args) {
		System.out.println(solution(3));
	}
	public static long solution(int n) {
		dp[0] = 0;
		dp[1] = 1;
		for(int i = 2;i<=n;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
}
