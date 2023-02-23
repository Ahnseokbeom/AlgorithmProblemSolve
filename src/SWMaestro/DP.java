package SWMaestro;

public class DP {
	static int[] n9095 = {4,7,10};
	static int[] n11726 = {2,9};
	static int[] n11053 = {10,20,10,30,20,50};
	static int[][] n1932 = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
	public static void main(String[] args) {
		System.out.println("n9095");
		for(int i = 0;i<n9095.length;i++) System.out.println(num9095(n9095[i]));

		System.out.printf("n11726");
		for(int i = 0;i<n11726.length;i++) System.out.println(num11726(n11726[i]));

		System.out.printf("n11053\n%d",num11053(n11053));

		System.out.printf("n1932\n%d",num1932(n1932));

	}
	private static int num9095(int n) {
		int[] dp = new int[12];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for(int i = 4;i<=11;i++) dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
		return dp[n];
	}
	private static int num11726(int n) {
		int[] dp = new int[1001];
		dp[1] = 1;
		dp[2] = 2;
		for(int i = 3;i<dp.length;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	private static int num11053(int[] arr) {
		int[] dp = new int[n11053.length];
		int max = 0;
		for(int i = 0;i<dp.length;i++) {
			dp[i] = 1;
			for(int j = 0;j<i;j++) {
				if(n11053[j]<n11053[i] && dp[i] <= dp[j]) dp[i] = dp[j]+1;
			}
		}
		for(int i = 0;i<dp.length;i++) {
			max = Math.max(max, dp[i]);
		}
		return max;
	}
	private static int num1932(int[][] arr) {
		int max = 0;
		int size = n1932[n1932.length-1].length;
		int[][] dp = new int[n1932.length][size];
		dp[0][0] = n1932[0][0];
		for(int i = 1;i<dp.length;i++) {
			dp[i][0] = dp[i-1][0]+n1932[i][0];
			dp[i][i] = dp[i-1][i-1]+n1932[i][i];
			for(int j = 1;j<i-1;j++) {
				dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j])+n1932[i][j];
				max = Math.max(max, dp[i][j]);
			}
		}
		return max;
	}
}
