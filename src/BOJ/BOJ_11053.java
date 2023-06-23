package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11053 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int[] list = new int[a];
		int[] dp = new int[a];
		for(int i = 0;i<a;i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		int max = 0;
		for(int i = 0;i<a;i++) {
			dp[i] = 1;
			for(int j = 0;j<i;j++) {
				if(list[j]<list[i] && dp[i] <= dp[j]) dp[i] = dp[j]+1;
			}
		}
		for(int i : dp) max = Math.max(i, max);
		System.out.println(max);
	}

}
