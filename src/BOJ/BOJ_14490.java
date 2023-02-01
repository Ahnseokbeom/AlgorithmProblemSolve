package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14490 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),":");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int x = gcd(n,m);
		System.out.println(n/x+":"+m/x);
	}
	static int gcd(int n, int m) {
		while(m!=0) {
			int r = n%m;
			n = m;
			m = r;
		}
		return n;
	}

}
