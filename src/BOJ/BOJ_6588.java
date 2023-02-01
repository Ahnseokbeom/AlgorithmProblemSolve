package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_6588 {
	static boolean[] prime = new boolean[1000001];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[] NotPrime = new boolean[1000001];
		NotPrime[0]=NotPrime[1] = true;
		for(int i = 2;i<=1000000;i++) {
			if(!NotPrime[i]) {
				for(int j = i*2;j<=1000000;j+=i) {
					NotPrime[j] = true;
				}
			}
		}
		while(true) {
			int n = Integer.parseInt(br.readLine());
			boolean check = false;
			if(n==0) {
				System.out.println(sb);
				return;
			}
			for(int i = 3;i<=n;i+=2) {
				if(!NotPrime[i] && !NotPrime[n-i]) {
					sb.append(n+" = "+i+" + "+(n-i)).append("\n");
					check = true;
					break;
				}
			}
			if(!check) {
				sb.append("Goldbach's conjecture is wrong.").append("\n");
			}
		}
	}

}
