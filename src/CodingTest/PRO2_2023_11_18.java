package CodingTest;

public class PRO2_2023_11_18 {
	public static void main(String[] args) {
		System.out.println(solution(3, new int[] {1,2,1,3,3,2}));
		System.out.println(solution(4, new int[] {3,3,2,2,1,1,4,4}));
	}
	 public static int solution(int n, int[] orders) {
	        int mod = 1_000_000_000;
	        int[] count = new int[n + 1];

	        for (int order : orders) {
	            count[order]++;
	        }

	        int[] dp = new int[n + 1];
	        dp[0] = 1;

	        for (int i = 1; i <= n; i++) {
	            for (int j = n; j >= count[i]; j--) {
	                dp[j] += dp[j - count[i]];
	                dp[j] %= mod;
	            }
	        }

	        long result = 0;
	        for (int i = 1; i <= n; i++) {
	            if (count[i] > 1 && dp[n-1] == 0) {
	                result = 0;
	                break;
	            }
	            result = (result + dp[i]) % mod;
	        }
	        return (int) (result % mod);
	    }
}
