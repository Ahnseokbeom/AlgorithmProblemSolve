package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1339 {
	static int n;
	static int[] arr = new int[26];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		for(int i = 0;i<n;i++) {
			String s = br.readLine();
			for(int j = 0;j<s.length();j++) {
				char c = s.charAt(j);
				arr[c-'A'] +=(int)Math.pow(10,s.length()-1-j);
			}
		}
		System.out.println(greedy());
	}
	public static int greedy() {
		Arrays.sort(arr);
		int a = 9;
		int b = 25;
		int answer = 0;
		while(arr[b] != 0) {
			answer += arr[b]*a;
			b--;
			a--;
		}
		return answer;
	}

}
