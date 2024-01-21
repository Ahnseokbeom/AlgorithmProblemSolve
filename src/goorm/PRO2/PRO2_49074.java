package goorm.PRO2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PRO2_49074 {
	static ArrayList<Integer> arr = new ArrayList<>();
	static int count = 0;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 1;i<=31;i++) arr.add((int)Math.pow(2, i));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		for(int i = 1;i<=n;i++) {
			if(!arr.contains(Integer.parseInt(st.nextToken()))) {
				sb.append(i+" ");
				count++;
			}
		}
		System.out.println(count+"\n"+sb);
	}
}
