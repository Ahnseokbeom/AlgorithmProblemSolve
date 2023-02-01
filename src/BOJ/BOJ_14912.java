package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14912 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int count = 0;
		for(int i = 1;i<=n;i++) {
			String s = Integer.toString(i);
			for(int j = 0; j<s.length();j++) {
				if(Integer.parseInt(s.charAt(j)+"")==d) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
