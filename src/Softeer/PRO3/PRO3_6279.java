package Softeer.PRO3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PRO3_6279 {
	static int answer;
	static boolean[] check;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		String s = br.readLine();
		String[] str = s.split("");
		check = new boolean[n];
		System.out.println(solution(n, k, str));
	}
	public static int solution(int n, int k, String[] str) {
		answer = 0;
		for(int i = 0;i<n;i++) {
			if(str[i].equals("P")) {
				int left = Math.max(i-k, 0);
				int right = Math.min(i+k, n-1);
				for(int j = left;j<=right;j++) {
					if(str[j].equals("H") && !check[j]) {
						check[j] = true;
						answer++;
						break;
					}
				}
			}
		}
		return answer;
	}
}
