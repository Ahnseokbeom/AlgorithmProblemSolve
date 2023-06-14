package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11049 {
	static int[][] arr;
	static int[][] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][2];
		dp = new int[n][n];
		for(int i = 0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			Arrays.fill(dp[i], Integer.MAX_VALUE);
		}
		System.out.println(rec(0,n-1));
	}
	public static int rec(int left, int right) {
		if(left==right) return 0;
		if(dp[left][right] != Integer.MAX_VALUE) return dp[left][right];
		for(int i = left;i<right;i++) {
			int num = rec(left,i)+rec(i+1,right)+arr[left][0] * arr[i][1] * arr[right][1];
			dp[left][right] = Math.min(dp[left][right], num);
		}
		return dp[left][right];
	}

}
