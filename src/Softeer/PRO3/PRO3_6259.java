package Softeer.PRO3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PRO3_6259 {
	static int n,m,k;
	static int[][] dp;
	 public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr1[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) arr2[i] = Integer.parseInt(st.nextToken());
        dp = new int[n + 1][m + 1];
        System.out.println(solution(arr1, arr2));

    }
	 public static int solution(int[] arr1, int[] arr2) {
		 int answer = 0;
		 for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (arr1[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    answer = Math.max(answer, dp[i][j]);
                }
            }
        }
		 return answer;
	 }
}
