package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3036 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int first = Integer.parseInt(st.nextToken());
		for(int i = 1;i<n;i++) {
			int second = Integer.parseInt(st.nextToken());
			int gcd = gcd(first,second);

			System.out.println((first/gcd)+"/"+(second/gcd));
		}
	}
	static int gcd(int a, int b) {
		int r;
		while(b!=0) {
			r = a%b;
			a = b;
			b = r;
		}
		return a;
	}

}
