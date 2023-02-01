package BOJ;

import java.util.Scanner;

public class BOJ_1904 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[1000001];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 3;
		for(int i = 4;i<=n;i++) {
			dp[i] = (dp[i-1]+dp[i-2])%15746;
		}
		System.out.println(dp[n]);
		sc.close();
	}

}
