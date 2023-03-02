package SWMaestro;

public class BOJ_11057 {
	public static int solution(int n) {
		int answer = 0;
		long[][] dp = new long[n+1][10];
		int[] sum = new int[n+1];
		for(int i = 0;i<10;i++) dp[1][i] = 1;
		int mod = 10007;
		sum[1] = 10;
		for(int i = 2;i<=n;i++) {
			for(int j = 0;j<10;j++) {
				if(j==0) {
					dp[i][j] = dp[i-1][j];
				}else {
					dp[i][j] = (dp[i][j-1]+dp[i-1][j])%mod;
				}
				sum[i]+=dp[i][j];
			}
		}
		answer = sum[n];
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution(1));
		System.out.println(solution(2));
		System.out.println(solution(3));
	}

}
