package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2485 {
	public static int[] gap;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] tree = new int[n];
		gap = new int[n-1];
		for(int i = 0;i<n;i++) {
			tree[i] = Integer.parseInt(br.readLine());
			if(i > 0) gap[i-1] = tree[i] - tree[i-1];
		}
		for(int i = 0;i<=gap.length-2;i++) gap[i+1] = gcd(gap[i],gap[i+1]);
		System.out.println((tree[n-1]-tree[0])/gap[gap.length-1]-(n-1));
	}
	public static int gcd(int a, int b) {
		while(b > 0) {
			int temp = a;
			a = b;
			b = temp%b;
		}
		return a;
	}

}
