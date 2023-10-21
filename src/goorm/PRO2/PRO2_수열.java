package goorm.PRO2;

public class PRO2_수열 {
	static long[] dp;
	static int mod = 1000000007;
	public static void main(String[] args) {
		System.out.println(solution(2));
		System.out.println(solution(6));
		System.out.println(solution(10));
		System.out.println(solution(100000));
	}
	public static long solution(int k) {
		dp = new long[k+1];
		if(k==1) return 0;
		else {
		dp[1] = 0;
		dp[2] = 1;
		for(int i = 3;i<=k;i++) dp[i] = (dp[i-1]+dp[i-2])%mod;
		}
		return dp[k]%mod;
	}

}
