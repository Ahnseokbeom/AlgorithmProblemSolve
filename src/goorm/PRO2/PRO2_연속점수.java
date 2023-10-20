package goorm.PRO2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PRO2_연속점수 {
	static int n, sum;
	static int[] dp, arr;
	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	n = Integer.parseInt(br.readLine());
	arr = new int[n];
	dp = new int[n];
	StringTokenizer st = new StringTokenizer(br.readLine());
	int max = 0;
	for(int i = 0;i<n;i++) {
		arr[i] = Integer.parseInt(st.nextToken());
		max = Math.max(arr[i],max);
	}
	System.out.println(max > DP()?max:sum);
}
	public static int DP() {
		sum = 0;
		for(int i = 0;i<n;i++) {
			dp[i] = arr[i];
			for(int j = 0;j<i;j++) {
				if(i-1==j && arr[j]+1 == arr[i] && dp[i] < dp[j]+arr[i]) dp[i] = dp[j]+arr[i];
			}
			sum = Math.max(sum, dp[i]);
		}
		return sum;
	}
}
