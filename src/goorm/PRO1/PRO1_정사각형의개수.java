package goorm.PRO1;

public class PRO1_정사각형의개수 {
	static long[] dp;
	public static void main(String[] args){
		System.out.println(solution(4));
		System.out.println(solution(10));
		System.out.println(solution(123));
		System.out.println(solution(1));
	}
	public static long solution(int n) {
		dp = new long[1000001];
		dp[1] = 1;
		for(int i = 2;i<=n;i++) dp[i] = (long)(Math.pow(i, 2))+dp[i-1];
		return dp[n];
	}
}
