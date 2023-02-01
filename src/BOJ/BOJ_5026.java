package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5026 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<n;i++) {
			String str = br.readLine();
			if(str.equals("P=NP")) {
				sb.append("skipped").append("\n");
			}else {
				StringTokenizer st = new StringTokenizer(str,"+");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				sb.append(a+b).append("\n");
			}
		}
		System.out.println(sb);
	}

}
