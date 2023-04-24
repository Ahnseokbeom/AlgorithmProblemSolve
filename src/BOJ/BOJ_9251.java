package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9251 {
	static char[] c1;
	static char[] c2;
	static Integer[][] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		c1 = br.readLine().toCharArray();
		c2 = br.readLine().toCharArray();
		dp = new Integer[c1.length][c2.length];
		System.out.println(LCS(c1.length-1,c2.length-1));
	}
	public static int LCS(int x, int y) {
		if(x==-1 || y == -1) return 0;
		if(dp[x][y]== null) {
			dp[x][y] = 0;
			if(c1[x]==c2[y]) dp[x][y] = LCS(x-1,y-1)+1;
			else dp[x][y] = Math.max(LCS(x-1,y), LCS(x,y-1));
		}
		return dp[x][y];
	}

}
