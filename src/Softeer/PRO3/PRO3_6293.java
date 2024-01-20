package Softeer.PRO3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PRO3_6293 {
	static int[] arr,dp;
	static int answer;
	 public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      arr = new int[n];
      dp = new int[n];
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int i = 0;i<n;i++) arr[i] = Integer.parseInt(st.nextToken());
      answer = 0;
      System.out.println(solution(n));
    }
	public static int solution(int n) {
		for(int i = 0;i<n;i++){
	        dp[i] = 1;
	        for(int j = 0;j<i;j++){
	          if(arr[i] > arr[j] && dp[i]<=dp[j]){
	            dp[i] = dp[j]+1;
	          }
	        }
	      }
		System.out.println(Arrays.toString(dp));
      for(int i : dp) answer = Math.max(answer,i);
      return answer;
	}
}
