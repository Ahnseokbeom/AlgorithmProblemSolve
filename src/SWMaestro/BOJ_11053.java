package SWMaestro;

import java.util.Scanner;
public class BOJ_11053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[n+1];
		int[] dp = new int[n+1];
		for(int i = 1;i<=n;i++) {
			list[i] = sc.nextInt();
		}
		int max = 0;
		for(int i = 1;i<=n;i++) {
			dp[i] = 1;
			for(int j = 1;j<=i;j++) {
				if(list[j]<list[i] && dp[i]<=dp[j]) dp[i] = dp[j]+1;
			}
		}
		for(int i : dp) {
			max = Math.max(i,max);
		}
		System.out.println(max);
		sc.close();
	}

}
