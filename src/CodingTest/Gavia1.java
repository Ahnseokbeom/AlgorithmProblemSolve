package CodingTest;

public class Gavia1 {
	public static void main(String[] args) {
		System.out.println(solution(6));
	}
	public static int solution(int n) {
		int[] dp = new int[401];
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 6;
		dp[4] = 20;
		for(int i = 5;i<dp.length;i++) {
			dp[i] = 1;
			for(int j = 1;j<i;j++) {
				if(j==i-2) dp[i]+=(int)Math.pow(j, 2)*2;
				else dp[i]+=(int)Math.pow(j, 2);
			}
		}
		return dp[n];
	}
}
