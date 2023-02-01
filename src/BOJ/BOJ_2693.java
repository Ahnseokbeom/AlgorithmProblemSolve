package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2693 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int[] a;
		while(t-->0) {
			st = new StringTokenizer(br.readLine()," ");
			a = new int[10];
			for(int i = 0;i<10;i++) {
			a[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(a);
			sb.append(a[a.length-3]).append("\n");
		}
		System.out.println(sb);
	}

}
