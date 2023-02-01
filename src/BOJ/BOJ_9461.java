package BOJ;

import java.util.Scanner;

public class BOJ_9461 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long[] dp = new long[101];
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		dp[4] = 2;
		dp[5] = 2;
		for(int i = 6;i<=100;i++) {
			dp[i] = dp[i-1]+dp[i-5];
		}
		System.out.println(dp[100]);
		StringBuilder sb = new StringBuilder();
		while(t-->0) {
			int n = sc.nextInt();
			sb.append(dp[n]+"\n");
		}
		System.out.println(sb);
		sc.close();
	}

}
