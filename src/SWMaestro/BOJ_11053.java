package SWMaestro;

public class BOJ_11053 {
	public static int solution(int n, int[] arr) {
		int answer = 0;
		int[] dp = new int[n];
		for(int i = 0;i<n;i++) {
			dp[i] = 1;
			for(int j = 0;j<i;j++) {
				if(dp[i]<=dp[j] && arr[i] > arr[j]) {
					dp[i] = dp[j]+1;
				}
			}
		}
		for(int i : dp) answer = Math.max(answer, i);
		return answer;
	}
	public static void main(String[] args) {
		int n = 6;
		int[] arr = {10,20,10,30,20,50};
		System.out.println(solution(n,arr));
		System.out.println(solution(n,new int[] {10,30,20,40,50,60}));
	}

}
