package CodeUp;

public class PRO_2601 {
	static int[] dp;
	public static void main(String[] args) {
		System.out.println(fibo(7));
	}
	public static int fibo(int n) {
		dp = new int[41];
		dp[1] = dp[2] = 1;
		for(int i = 3;i<=n;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
}
