package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PRO_162066 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<n;i+=2) {
			int num = s.charAt(i)+(int)Math.pow(s.charAt(i+1)-'0', 2);
			if(num > 122) {
				sb.append((char)((num-123)+'a'));
			}else sb.append((char)num);
		}
		System.out.println(sb);
	}
}
