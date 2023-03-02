package SWMaestro;

public class BOJ_11052 {
	public static int solution(int n, int[] arr) {
		int[] dp = new int[n+1];
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				dp[i] = Math.max(dp[i], dp[i-j]+arr[j]);
			}
		}
		int answer = dp[n];
		return answer;
	}
	public static void main(String[] args) {

		System.out.println(solution(4,new int[] {0,1,5,6,7}));
		System.out.println(solution(5,new int[] {0,10,9,8,7,6}));
		System.out.println(solution(10,new int[] {0,1,1,2,3,5,8,13,21,34,55}));
		System.out.println(solution(10,new int[] {0,5,10,11,12,30,35,40,45,47}));
		System.out.println(solution(4,new int[] {0,5,2,8,10}));
		System.out.println(solution(4,new int[] {0,3,5,15,16}));
	}

}
