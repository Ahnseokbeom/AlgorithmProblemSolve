package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PRO_177463 {
	static StringBuilder sb;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		time(s.split(" ")[0],s.split(" ")[1]);
		System.out.println(sb);
	}
	public static void time(String s1, String s2) {
		sb = new StringBuilder();
		if(Integer.parseInt(s2)+50 >= 60) {
			int h = Integer.parseInt(s1)+1;
			if(h >= 24) h = h-24;
			int m = Integer.parseInt(s2)+50 - 60;
			sb.append(String.valueOf(h)).append(" ").append(String.valueOf(m));
		}else {
			int m = Integer.parseInt(s2)+50;
			sb.append(s1).append(" ").append(String.valueOf(m));
		}
	}
}
