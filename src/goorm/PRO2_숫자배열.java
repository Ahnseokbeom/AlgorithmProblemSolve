package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PRO2_숫자배열 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int idx = 1;
		StringBuilder sb = new StringBuilder();
		for(int i = 1;i<=n;i++){
			for(int j = 1;j<=n;j++){
				if(j==n) sb.append(idx);
				else sb.append(idx).append(" ");
				idx++;
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
