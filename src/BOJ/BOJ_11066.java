package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11066 {
	static int[] sum;
	static int[][] dp, Karr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		while(t-->0) {
			for(int i = 0;i<K;i++) {

			}
		}
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
		for (int a = 2; a <= K; a++) {
            for (int b = 0; a + b <= K; b++) {
                int c = a + b;
                dp[b][c] = Integer.MAX_VALUE;
                for (int k = Karr[b][c - 1]; k <= Karr[b + 1][c]; k++) {
                    int v = dp[b][k] + dp[k][c] + (sum[c] - sum[b]);
                    if (dp[b][c] > v) {
                        dp[b][c] = v;
                        Karr[b][c] = k;
                    }
                }
            }
        }
		 return dp[0][K];
	}
}
