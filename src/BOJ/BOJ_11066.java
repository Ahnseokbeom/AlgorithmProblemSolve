package BOJ;

public class BOJ_11066 {
	static int[] sum;
	static int[][] dp, Karr;
	public static void main(String[] args) {
		System.out.println(solution(4, new int[] {0,40,30,30,50}));
		System.out.println(solution(15, new int[] {0,1,21,3,4,5,35,5,4,3,5,98,21,14,17,32}));

	}
	public static int solution(int K, int[] arr) {
		dp = new int[502][502];
		Karr = new int[502][502];
		sum = new int[K+1];
		for(int i = 1;i<=K;i++) {
			sum[i] = sum[i-1]+arr[i];
			dp[i-1][i] = 0;
			Karr[i-1][i] = i;
		}
		for (int d = 2; d <= K; d++) {
            for (int i = 0; i + d <= K; i++) {
                int j = i + d;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = Karr[i][j - 1]; k <= Karr[i + 1][j]; k++) {
                    int v = dp[i][k] + dp[k][j] + (sum[j] - sum[i]);
                    if (dp[i][j] > v) {
                        dp[i][j] = v;
                        Karr[i][j] = k;
                    }
                }
            }
        }
		 return dp[0][K];
	}
}
