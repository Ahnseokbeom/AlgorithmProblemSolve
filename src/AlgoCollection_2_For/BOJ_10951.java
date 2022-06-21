package AlgoCollection_2_For;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10951 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreTokens()) {
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine()," ");
			int sum = a+b;
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}

}
